package Pilha;

public class PilhaNo {
    private No topo;

    public PilhaNo() {
        topo = null;
    }

    // Push: adiciona um elemento ao topo da pilha
    public void push(String elemento){
        No novoNo = new No(elemento);
        novoNo.proximo = topo;
        topo = novoNo;
    }

    // Pop: remove e retorna o elemento do tpo da pilha
    public String pop(){
        if(isEmpty()){
            return null; // lançar uma exceção
        }
        String dado = topo.dado;
        topo = topo.proximo;
        return dado;

    }

    // Peek: Retonr a


    // isEmpty: verifica se a pilha esta vazia
    public boolean isEmpty(){
        return topo == null;
    }
}
