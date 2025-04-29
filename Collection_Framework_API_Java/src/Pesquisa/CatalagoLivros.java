package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {
    private List<Livro> livrolist;

    public CatalagoLivros() {
        this.livrolist = new ArrayList<>();
    }

    public void  adicionarLivro(String titulo, String autor, int anoPublicacao){
        livrolist.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarporAutor(String autor){
        List<Livro>livrosPorAutor = new ArrayList<>();
        if(!livrolist.isEmpty()){
            for(Livro l : livrolist){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return  livrosPorAutor;
    }

    public List<Livro> pesquisarIntervalosAnos(int anoInicial, int anoFinal){
        List<Livro>livrosPorIntervalos = new ArrayList<>();
        if(!livrolist.isEmpty()){
            for(Livro l : livrolist){
              if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                  livrosPorIntervalos.add(l);
              }
            }
        }
        return livrosPorIntervalos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livrolist.isEmpty()){
            for(Livro l : livrolist){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return  livroPorTitulo;
    }


    public static void main(String[] args) {
      CatalagoLivros catalagoLivro = new CatalagoLivros();
      catalagoLivro.adicionarLivro("Livro1","autor1",2020);
      catalagoLivro.adicionarLivro("Livro2","autor2",2021);
      catalagoLivro.adicionarLivro("Livro3","autor3",2022);
      catalagoLivro.adicionarLivro("Livro4","autor4",2023);
      catalagoLivro.adicionarLivro("Livro5","autor5",1994);

        System.out.println(catalagoLivro.pesquisarporAutor("autor2"));
        System.out.println(catalagoLivro.pesquisarIntervalosAnos(2020,2022));
    }
}
