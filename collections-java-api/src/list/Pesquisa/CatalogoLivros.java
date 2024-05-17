package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
        
        private List<Livro> livroList;

        public CatalogoLivros() {
            this.livroList = new ArrayList<>();
        }
        
        public void adicionarLivro(String titulo, String autor, int anoPublicacao){
            livroList.add(new Livro(titulo, autor, anoPublicacao));
        }

        public List<Livro> pesquisarLivroPorTitulo(String titulo){
            List<Livro> livrosEncontrados = new ArrayList<>();

            for (Livro l : livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livrosEncontrados.add(l);
                }
            }

            return livrosEncontrados;
        }

        public List<Livro> pesquisarLivroPorAutor(String autor){
            List<Livro> livrosEncontrados = new ArrayList<>();

            for (Livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosEncontrados.add(l);
                }
            }

            return livrosEncontrados;
        }

        public List<Livro> pesquisarLivroPorAnoPublicacao(int anoInicial, int anoFinal ){
            List<Livro> livrosEncontrados = new ArrayList<>();

            for (Livro l : livroList){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal ){
                    livrosEncontrados.add(l);
                }
            }

            return livrosEncontrados;
        }

        public static void main(String[] args) {
            CatalogoLivros catalogoLivros = new CatalogoLivros();
            catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
            catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
            catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
            catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
            catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);

            System.out.println(catalogoLivros.pesquisarLivroPorAutor("autor 4"));
            System.out.println(catalogoLivros.pesquisarLivroPorAnoPublicacao(2020, 2022));
            System.out.println(catalogoLivros.pesquisarLivroPorTitulo("Livro 1"));
        }


}
