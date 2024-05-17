package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
      
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    } 

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Pessoa 1", 20, 1.70);
        ordenacaoPessoa.adicionarPessoa("Pessoa 2", 30, 1.80);
        ordenacaoPessoa.adicionarPessoa("Pessoa 3", 40, 1.20);
        ordenacaoPessoa.adicionarPessoa("Pessoa 4", 17, 1.00);

     /*  System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());*/
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(this.pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(this.pessoaList);
        Collections.sort(pessoasPorAltura, this.new Pessoa.ComparatorPorAltura());
        return pessoasPorAltura;
    }
}
