# EstudosJava ☕

Repositório de estudos de **Estrutura de Dados em Java**, com implementações práticas dos principais conceitos abordados em aula.

---

## 📁 Estrutura do Projeto

```
src/
└── EstruturaDados/
    ├── Aula01_Lista_Linear_Dinamica/
    ├── Aula02_ArrayList/
    ├── Aula02_Pilha/
    ├── Aula02_Stack/
    ├── Aula03_RecursividadeExemplo/
    ├── Aula05_Hash/
    └── TabelaHash/
```

---

## 📚 Conteúdos Estudados

### Aula 01 — Lista Linear Dinâmica

Implementação manual de uma **lista linear** utilizando array de `String`, com as operações fundamentais:

- **Inserir** — adiciona um elemento ao final da lista, respeitando a capacidade máxima.
- **Remover** — remove um elemento pelo valor, reorganizando os itens restantes.
- **Buscar** — retorna o índice de um elemento na lista (ou `-1` se não encontrado).
- **Imprimir** — exibe todos os elementos da lista.
- **Tamanho** — retorna a quantidade atual de elementos.

Também inclui um exemplo usando `ArrayList<String>` do Java (`ListaLinearDinamica.java`), demonstrando a diferença entre a implementação manual e a classe pronta da linguagem.

**Arquivos:**
- `ListaLinear.java` — implementação manual com array
- `ListaLinearDinamica.java` — exemplo com `ArrayList`
- `App.java` — teste básico com array de String

---

### Aula 02 — Pilha (Stack)

Estudo do conceito de **Pilha (LIFO — Last In, First Out)** com duas abordagens:

#### Implementação Manual (`Aula02_Pilha`)
Pilha implementada com array de `int`, incluindo:
- **push** — empilha um elemento no topo
- **pop** — desempilha o elemento do topo
- **peek** — consulta o elemento do topo sem removê-lo
- **verificaPilha** — verifica se a pilha está vazia

#### Usando `java.util.Stack` (`Aula02_Stack`)
Exemplo prático simulando a **navegação de páginas** de um site, utilizando a classe `Stack` do Java para demonstrar as operações `push`, `pop` e `peek`.

#### Carrinho de Compras com ArrayList (`Aula02_ArrayList`)
Implementação de um **Carrinho de Compras** usando `ArrayList`, aplicando os conceitos de pilha:
- **addProduto** — adiciona produto ao carrinho (push)
- **removerProduto** — remove o último produto adicionado (pop)
- **ultimoProduto** — consulta o último produto sem remover (peek)

**Arquivos:**
- `Pilha.java` — implementação manual da pilha
- `ExemploStack.java` — uso da classe `Stack` com navegação de páginas
- `CarrinhoCompras.java` — pilha aplicada a um carrinho de compras
- `App.java` — testes das implementações

---

### Aula 03 — Recursividade

Estudo do conceito de **recursividade** (funções que chamam a si mesmas) com três exemplos práticos:

- **Fatorial** — cálculo do fatorial de um número (`n!`) de forma recursiva.
- **Fibonacci** — cálculo da sequência de Fibonacci utilizando chamadas recursivas.
- **Listagem de diretórios** — percorre pastas e subpastas de um caminho no sistema de arquivos, listando arquivos e diretórios recursivamente usando `java.io.File`.

**Arquivos:**
- `Recursividade.java` — implementações de fatorial, fibonacci e listagem de diretórios

---

### Aula 05 — Tabela Hash (HashMap)

Estudo de **Tabela Hash** com duas abordagens:

#### Usando `java.util.HashMap` (`Aula05_Hash`)
Exemplo prático de um **controle de estoque** utilizando `HashMap<String, Integer>`, demonstrando:
- **Inserção** de pares chave-valor (`put`)
- **Busca** por chave (`containsKey`, `get`)
- **Iteração** sobre todos os elementos (`keySet`)
- **Atualização** de valor de uma chave existente

#### Implementação Manual (`TabelaHash`)
Implementação de uma **Tabela Hash do zero** utilizando `LinkedList<String>[]` para tratamento de colisões por encadeamento:
- **Função hash** — calcula o índice a partir do `hashCode` da chave
- **Inserir** — adiciona um elemento evitando duplicatas
- **Buscar** — verifica se um elemento existe na tabela
- **Exibir** — mostra o conteúdo de todos os buckets da tabela

**Arquivos:**
- `ExemploHash.java` — uso do `HashMap` para controle de estoque
- `TabelaHash.java` — implementação manual de tabela hash com encadeamento

---

## 🛠️ Tecnologias

- **Linguagem:** Java
- **IDE:** VS Code

## 🚀 Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/CaioP6/EstudosJava.git
   ```
2. Abra o projeto na sua IDE de preferência (VS Code, IntelliJ, Eclipse).
3. Navegue até a classe desejada e execute o método `main`.
