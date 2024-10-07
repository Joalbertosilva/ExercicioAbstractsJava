package entities;

import java.util.ArrayList;

public class Question3 {
    private ArrayList<String> lista;

    public Question3() {
        this.lista = new ArrayList<>();
    }

    public ArrayList<String> getLista() {
        return lista;
    }

    public void setLista(ArrayList<String> lista) {
        this.lista = lista;
    }

    public void adicionarItem(String item) {
        this.lista.add(item);
    }

    public void exibirLista() {
        for (String item : lista) {
            System.out.println(item);
        }
    }

    public void exibirElemento(int index) {
        try {
            String item = lista.get(index);
            System.out.println("Elemento na posição " + index + ": " + item);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Erro: O índice " + index + " está fora dos limites da lista.");
        }
    }
}
