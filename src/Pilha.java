import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        Stack<String> pilhaDeJogos = new Stack<String>();

        System.out.println("push: Adiciona um item ao topo da pilha. " + pilhaDeJogos.push("MineCraft"));
        System.out.println("push: Adiciona um item ao topo da pilha. " + pilhaDeJogos.push("Skyrim"));
        System.out.println("push: Adiciona um item ao topo da pilha. " + pilhaDeJogos.push("Doom"));
        System.out.println("push: Adiciona um item ao topo da pilha. " + pilhaDeJogos.push("Borderlands"));
        System.out.println("push: Adiciona um item ao topo da pilha. " + pilhaDeJogos.push("Final Fantasy"));

        System.out.println(pilhaDeJogos);

        System.out.println("pop: Remove o item do topo da pilha. " + pilhaDeJogos.pop());
        System.out.println("peek: Permite visualizar o item no topo sem removê-lo. " + pilhaDeJogos.peek());
        System.out.println("empty: Verifica se a pilha está vazia. " + pilhaDeJogos.empty());
        System.out.println("search: Procura por um item na pilha e retorna sua posição e Retorna a posição. " + pilhaDeJogos.search("Doom") ) ;





    }
}
