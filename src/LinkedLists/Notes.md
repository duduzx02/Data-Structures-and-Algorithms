# LinkedList
## Introdução
### Comparando Arrays com LikedList:
- **Arrays:** Estrutura de dados de tamanho fixo. Excelente para acesso rápdio a elementros (o(1) para acesso), mas 
  caros para termos de inserção e exclusão(O(n)).
- **Listas de Arrays:** como 'ArraysList' em java, permite tamanho dinâmico, mas ainda depende de arrays subjacentes,
  o que pode levar operações caras de redimensionamento.
- **LikedList:** Têm tamanho dinâmico e permitem inserção e exclusão de nós de forma eficinete (o(1)) para 
  inserção/remoção no inícico.
- **Vantagens:** Inserção e exclusão de nós eficientes.
- **Representação visual:** Cada nós contém um valor e um ponteiro para o próximo nó.

## Lista ligadas simples e duplas
### Listas ligadas simples:

- **Conexão:** cada nó aponta para o próximo.
- **Armazenamento:** Menos memória necessária.

### Listas ligadas duplas:
- **Conexão:** cada nó aponta para o próximo e para o anetrior.
- **Armazenamento:** mais memória necessária, mas facilita a travessia em ambas as direções.

### Traversão:
- **Simples:** apenas da cabeça até o final
- **Duplas:** permite a travessia tanto da cabeça ao final quanto do final à cabeça.


! Podemos tratar nossas listas como fila ou pilhas
