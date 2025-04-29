package Ordenacao;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class OrdenacaoPessoa {
    private List <Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade,altura));
    }

    public List<Pessoa> ordemarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

//    public List<Pessoa> ordenarPorAltura() {
//        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
//        if (!pessoaList.isEmpty()) {
//            Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
//            return pessoasPorAltura;
//        } else {
//            throw new RuntimeException("A lista está vazia!");
//        }
//    }


}



