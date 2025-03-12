package CodigosFeitosDuranteEstudos.CadastroNinjas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListaGenerica <T>{
    private LinkedList<T> listagenrica;

    public ListaGenerica() {
        this.listagenrica = new LinkedList<>();
    }

    public void inserirninjas( T ninjasaserinserido){
        listagenrica.add(0, ninjasaserinserido);
        System.out.println("Ninja Adicionado ao Inicio da Lista\n");
    }

    public void excluirninja(){
        listagenrica.remove(0);

    }

    public void MostrarNinjas(){
        for (T ninjainserido : listagenrica){
            System.out.println(ninjainserido);
        }
    }

    public void acharninjaindex(int escolhaindex){
        List<T> copialistaninjas = new ArrayList<>(listagenrica);
        System.out.println("Ninja encontrado: " + copialistaninjas.get(escolhaindex));
    }

    public LinkedList<T> getListagenrica() {
        return listagenrica;
    }

    public void setListagenrica(LinkedList<T> listagenrica) {
        this.listagenrica = listagenrica;
    }
}
