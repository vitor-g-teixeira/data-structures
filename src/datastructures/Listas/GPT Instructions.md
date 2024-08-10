# Meu Input
Me descreva os métodos e atributos necessários para uma classe que implemente a estrutura de dados "Lista". Irei implementar em java.

Não quero sugestão de códigos, apenas me descreva quais métodos são necessários e como devem responder. Para que eu possa me desafiar a implementar a lógica.

# Resposta do GPT
## Implementação de uma Estrutura de Dados "Lista" em Java

Para implementar uma estrutura de dados "Lista" em Java, você precisará definir uma classe que contenha tanto os atributos para armazenar os dados quanto os métodos para manipular esses dados. Aqui está uma descrição dos componentes essenciais:

### Atributos

1. **`size`**:
   - **Tipo**: `int`
   - **Descrição**: Armazena o número atual de elementos na lista. Esse atributo ajuda a controlar o tamanho da lista e é utilizado em vários métodos, como ao adicionar ou remover elementos.

2. **`head`** (Opcional, se for uma lista ligada):
   - **Tipo**: Um tipo de nó (por exemplo, uma classe interna `Node` que armazena um valor e uma referência ao próximo nó).
   - **Descrição**: Aponta para o primeiro elemento da lista, sendo essencial em listas ligadas (Linked Lists). A partir do `head`, você pode percorrer toda a lista.

3. **`elements`** (para uma lista baseada em array):
   - **Tipo**: Um array de objetos (`Object[]`) ou do tipo específico que deseja armazenar.
   - **Descrição**: Armazena os elementos da lista. Em uma implementação baseada em array, você gerenciará a capacidade e poderá precisar redimensionar o array conforme elementos são adicionados.

### Métodos

1. **`add(T element)`**:
   - **Descrição**: Adiciona um elemento ao final da lista. Pode ser necessário redimensionar o array ou criar novos nós, dependendo da implementação.
   - **Retorno**: Pode retornar `boolean` para indicar se a adição foi bem-sucedida.

2. **`add(int index, T element)`**:
   - **Descrição**: Insere um elemento em uma posição específica na lista, movendo os elementos subsequentes para a direita. Pode lançar uma exceção (`IndexOutOfBoundsException`) se o índice for inválido.
   - **Retorno**: Pode retornar `boolean` para indicar sucesso.

3. **`get(int index)`**:
   - **Descrição**: Retorna o elemento na posição especificada. Deve lançar uma exceção (`IndexOutOfBoundsException`) se o índice for inválido.

4. **`remove(int index)`**:
   - **Descrição**: Remove o elemento na posição especificada, movendo os elementos subsequentes para a esquerda. Deve lançar uma exceção (`IndexOutOfBoundsException`) se o índice for inválido.
   - **Retorno**: Retorna o elemento removido.

5. **`indexOf(T element)`**:
   - **Descrição**: Retorna o índice da primeira ocorrência do elemento na lista ou `-1` se o elemento não for encontrado.

6. **`contains(T element)`**:
   - **Descrição**: Verifica se a lista contém o elemento especificado.
   - **Retorno**: Retorna `boolean`, `true` se o elemento estiver presente, `false` caso contrário.

7. **`clear()`**:
   - **Descrição**: Remove todos os elementos da lista, retornando-a ao estado vazio.

8. **`isEmpty()`**:
   - **Descrição**: Verifica se a lista está vazia.
   - **Retorno**: Retorna `boolean`, `true` se a lista não contiver elementos, `false` caso contrário.

9. **`size()`**:
   - **Descrição**: Retorna o número atual de elementos na lista.
   - **Retorno**: Retorna um valor `int`.

10. **`toString()`**:
    - **Descrição**: Retorna uma representação em string dos elementos da lista, geralmente no formato `[element1, element2, ...]`.

### Métodos Opcionais

1. **`ensureCapacity(int minCapacity)`** (para listas baseadas em array):
   - **Descrição**: Garante que a lista tenha capacidade suficiente para armazenar um número mínimo de elementos, redimensionando o array se necessário.

2. **`subList(int fromIndex, int toIndex)`**:
   - **Descrição**: Retorna uma visão da parte especificada da lista, como uma sublista. Deve lançar uma exceção (`IndexOutOfBoundsException`) se os índices forem inválidos.

3. **`set(int index, T element)`**:
   - **Descrição**: Substitui o elemento na posição especificada por um novo elemento.
   - **Retorno**: Retorna o elemento anterior na posição especificada.
