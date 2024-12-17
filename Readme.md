Aqui está o texto revisado para maior clareza e formatação:

---

### Regras para a criação de identificadores em Java

Em Java, seguimos as seguintes regras para criar identificadores:

1. **Não pode ser uma palavra reservada (palavra-chave).**
2. **Não pode ser `true` nem `false`**, pois são literais que representam os valores booleanos.
3. **Não pode ser `null`**, que é o literal que representa o tipo nulo.
4. **Não pode conter espaços em branco ou outros caracteres de formatação.**
5. **Deve ser uma combinação de uma ou mais letras e dígitos no padrão Unicode-16.**  
   Exemplos baseados no alfabeto latino incluem:
    - Letras maiúsculas: **A a Z** (códigos Unicode de `\u0041` a `\u005a`).
    - Letras minúsculas: **a a z** (códigos Unicode de `\u0061` a `\u007a`).
    - Sublinha (underscore): `_` (código Unicode `\u005f`).
    - Cifrão: `$` (código Unicode `\u0024`).
    - Dígitos: **0 a 9** (códigos Unicode de `\u0030` a `\u0039`).

---

Aqui está o texto revisado para maior clareza e fluidez:

---

### Comentários em Java

Os comentários são utilizados para documentar programas e melhorar sua legibilidade. O compilador Java ignora os comentários, ou seja, eles não afetam a execução do programa nem fazem o computador realizar qualquer ação.

Por convenção, cada programa deve começar com um comentário que indique o número da figura (se aplicável) e o nome do arquivo correspondente.

---

Aqui está a versão revisada e organizada do texto:

---

### Palavras Reservadas em Java

Em programação, palavras-chave (ou palavras reservadas) são palavras que não podem ser usadas como identificadores, ou seja, não podem ser usadas como nomes de variáveis, classes, métodos, etc. Essas palavras são reservadas porque já possuem um uso específico na sintaxe da linguagem ou estão reservadas para futuras funcionalidades, garantindo compatibilidade com versões anteriores ou com outras linguagens.

Abaixo, segue uma lista de palavras-chave em Java e suas descrições:

| **Palavra**       | **Descrição**                                                                                                                                                     |
|--------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **abstract**       | Modificador usado para classes e métodos. Uma classe abstrata não pode ser instanciada diretamente e deve ser herdada. Métodos abstratos são implementados em subclasses. |
| **boolean**        | Tipo de dado que armazena valores booleanos (`true` ou `false`).                                                                                                 |
| **break**          | Interrompe um loop ou um bloco de repetição.                                                                                                                    |
| **byte**           | Tipo de dado que armazena números inteiros entre -128 e 127.                                                                                                    |
| **case**           | Marca um bloco de código em uma instrução `switch`.                                                                                                             |
| **catch**          | Captura exceções geradas por um bloco `try`.                                                                                                                    |
| **char**           | Tipo de dado que armazena um único caractere.                                                                                                                   |
| **class**          | Define uma classe.                                                                                                                                               |
| **const**          | Reservada para constantes, mas não está em uso (use `final`).                                                                                                   |
| **continue**       | Continua para a próxima iteração de um loop.                                                                                                                    |
| **default**        | Especifica o bloco padrão em uma instrução `switch`.                                                                                                            |
| **do**             | Cria um loop `do-while`.                                                                                                                                        |
| **double**         | Tipo de dado que armazena números de ponto flutuante com precisão dupla.                                                                                        |
| **else**           | Usado em instruções condicionais.                                                                                                                               |
| **enum**           | Declara um tipo enumerado (imutável).                                                                                                                           |
| **extends**        | Indica que uma classe é herdada de outra classe.                                                                                                                |
| **final**          | Modificador que torna classes, métodos ou atributos inalteráveis.                                                                                              |
| **finally**        | Bloco de código executado após um bloco `try`, independentemente de exceções.                                                                                   |
| **float**          | Tipo de dado que armazena números de ponto flutuante com precisão simples.                                                                                      |
| **for**            | Cria um loop `for`.                                                                                                                                            |
| **goto**           | Reservada, mas não está em uso.                                                                                                                                |
| **if**             | Declaração condicional.                                                                                                                                        |
| **implements**     | Indica que uma classe implementa uma interface.                                                                                                                |
| **import**         | Importa pacotes, classes ou interfaces.                                                                                                                         |
| **instanceof**     | Verifica se um objeto é uma instância de uma classe ou interface.                                                                                               |
| **int**            | Tipo de dado que armazena números inteiros entre -2147483648 e 2147483647.                                                                                      |
| **interface**      | Declara um tipo especial de classe que contém apenas métodos abstratos.                                                                                        |
| **long**           | Tipo de dado que armazena números inteiros de -9223372036854775808 a 9223372036854775807.                                                                      |
| **module**         | Declara um módulo (adicionado no Java 9).                                                                                                                      |
| **native**         | Indica que o método é implementado em outra linguagem.                                                                                                         |
| **new**            | Cria novos objetos.                                                                                                                                            |
| **package**        | Declara um pacote.                                                                                                                                              |
| **private**        | Modificador de acesso que torna atributos ou métodos acessíveis apenas na classe onde foram declarados.                                                        |
| **protected**      | Modificador de acesso que torna atributos ou métodos acessíveis no mesmo pacote e em subclasses.                                                               |
| **public**         | Modificador de acesso que torna atributos ou métodos acessíveis por qualquer classe.                                                                           |
| **requires**       | Especifica bibliotecas necessárias em um módulo (adicionado no Java 9).                                                                                        |
| **return**         | Finaliza a execução de um método e, opcionalmente, retorna um valor.                                                                                           |
| **short**          | Tipo de dado que armazena números inteiros entre -32768 e 32767.                                                                                               |
| **static**         | Modificador que torna atributos ou métodos associados à classe em vez de instâncias.                                                                           |
| **strictfp**       | Restringe a precisão e o arredondamento de cálculos de ponto flutuante.                                                                                        |
| **super**          | Refere-se a atributos ou métodos da superclasse (classe pai).                                                                                                 |
| **switch**         | Seleciona um entre vários blocos de código para execução.                                                                                                      |
| **synchronized**   | Garante que o acesso ao método ou bloco de código seja feito por apenas uma thread de cada vez.                                                                |
| **this**           | Refere-se ao objeto atual.                                                                                                                                     |
| **throw**          | Lança uma exceção.                                                                                                                                            |
| **throws**         | Declara as exceções que um método pode lançar.                                                                                                                 |
| **transient**      | Indica que um atributo não faz parte do estado persistente de um objeto.                                                                                       |
| **try**            | Inicia um bloco que pode lançar exceções.                                                                                                                      |
| **var**            | Declara uma variável com inferência de tipo (adicionado no Java 10).                                                                                          |
| **void**           | Especifica que um método não retorna nenhum valor.                                                                                                             |
| **volatile**       | Indica que um atributo sempre será lido da "memória principal", evitando caching local.                                                                        |
| **while**          | Cria um loop `while`.                                                                                                                                          |

---

## Modificadores de Acesso

Aqui estão os modificadores de acesso no Java, com suas descrições e visibilidades:



| **Modificador** | **Descrição**                                                                                                                                                 |
|-----------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **Default**     | (Sem modificador explícito) Membros da classe são acessíveis apenas dentro do mesmo pacote.                                                                   |
| **Public**      | Permite acesso a partir de qualquer classe.                                                                                                                  |
| **Private**     | Restringe o acesso a membros da própria classe, não podendo ser herdados ou acessados por outras classes.                                                    |
| **Protected**   | Permite acesso a partir de classes do mesmo pacote e também de subclasses, mesmo que estejam em pacotes diferentes.                                          |

### **Tabela de Acesso**

| **Modificador** | **Classe** | **Subclasse** | **Pacote** | **Global** |
|-----------------|------------|---------------|------------|------------|
| **Private**     | Sim        | Não           | Não        | Não        |
| **Protected**   | Sim        | Sim           | Sim        | Não        |
| **Default**     | Sim        | Não           | Sim        | Não        |
| **Public**      | Sim        | Sim           | Sim        | Sim        |


---

**Tipos Primitivos e suas Classes Empacotadoras**

Em Java, cada tipo primitivo possui uma classe empacotadora de tipo correspondente no pacote `java.lang`. Essas classes permitem manipular valores de tipos primitivos como objetos. As classes empacotadoras de tipo são:

- **Boolean**
- **Byte**
- **Character**
- **Double**
- **Float**
- **Integer**
- **Long**
- **Short**

As classes empacotadoras de tipo numérico, como `Byte`, `Short`, `Integer`, `Long`, `Float` e `Double`, estendem a classe `Number`. A classe `Boolean` não estende a classe `Number`. Além disso, as classes empacotadoras são **final**, o que significa que não podem ser estendidas.

Os tipos primitivos não possuem métodos, então, os métodos relacionados a esses tipos estão localizados nas classes empacotadoras correspondentes. Por exemplo, o método `parseInt` (que converte uma `String` em um valor `int`) está na classe `Integer`.

---

**Tabela de Tipos Primitivos**

| **Nome**      | **Tipo**  | **Tamanho**  | **Valor Mínimo**    | **Valor Máximo**    | **Valor Default** |
|---------------|-----------|--------------|---------------------|---------------------|-------------------|
| **Lógico**    | `boolean` | -            | `false`             | `true`              | `false`           |
| **Caractere** | `char`    | 16 bits      | `\u0000`            | `\uFFFF`            | `\u0000`          |
| **Inteiro**   | `byte`    | 8 bits       | -128                | 127                 | 0                 |
|               | `short`   | 16 bits      | -32,768             | 32,767              | 0                 |
|               | `int`     | 32 bits      | -2,147,483,648      | 2,147,483,647       | 0                 |
|               | `long`    | 64 bits      | -9,223,372,036,854,775,808 | 9,223,372,036,854,775,807 | 0          |
| **Decimal**   | `float`   | 32 bits      | 7 casas decimais    | N/A                 | 0.0               |
|               | `double`  | 64 bits      | 15 casas decimais   | N/A                 | 0.0               |

---

Essas classes empacotadoras são muito úteis quando você precisa manipular valores primitivos como objetos, oferecendo métodos para conversão, comparação e outras operações.

Aqui está a explicação dos **operadores** e sua **precedência**, conforme o texto fornecido:

---

### **Operadores em Java**
Os **operadores** são símbolos usados para realizar operações sobre variáveis e valores. Eles podem ser classificados em diferentes tipos, conforme a quantidade de operandos com os quais operam, e possuem uma **ordem de precedência**, determinando qual operação será executada primeiro em expressões compostas.

### **Tipos de Operadores**

1. **Aritméticos**: Usados para cálculos matemáticos.
   - `+`, `-`, `*`, `/`, `%`
2. **Atribuição**: Usados para atribuir valores a variáveis.
   - `=`, `+=`, `-=`, `*=`, `/=`, `%=`
3. **Relacionais**: Usados para comparar valores.
   - `>`, `<`, `>=`, `<=`, `==`, `!=`
4. **Lógicos**: Usados para operações lógicas em expressões booleanas.
   - `!`, `&&`, `||`
5. **Bit a Bit**: Usados para operações em nível de bits.
   - `&`, `|`, `^`, `<<`, `>>`, `>>>`

### **Classificação dos Operadores Quanto ao Número de Operandos**
- **Unário**: Operam sobre um único operando (exemplo: `a--`, `++a`, `!a`).
- **Binário**: Operam sobre dois operandos (exemplo: `a + b`, `a * b`, `a == b`).
- **Ternário**: Operam sobre três operandos (exemplo: `condição ? a : b`).

### **Exemplos de Operadores**

```java
int a = 5, b = 2, c = 0;

a--;  // '--' é unário, pois opera apenas em 'a'.
c = a * b;  // '*' é binário, pois opera em 'a' e 'b'.
c = c < 0 ? a : b;  // '? :' é ternário, baseado na condição 'c < 0'.
```

### **Precedência dos Operadores**

A **precedência dos operadores** define a ordem de execução em uma expressão. Operadores com maior precedência são avaliados primeiro.

| **Tipo de Operador**         | **Lista de Operadores**                            |
|------------------------------|----------------------------------------------------|
| **Sufixais**                  | `expr++`, `expr--`                                 |
| **Prefixais**                 | `++expr`, `--expr`, `+expr`, `-expr`, `~`, `!`     |
| **Multiplicativos**           | `*`, `/`, `%`                                     |
| **Aditivos**                  | `+`, `-`                                          |
| **Shift Binário**             | `<<`, `>>`, `>>>`                                 |
| **Comparativos**              | `<`, `>`, `<=`, `>=`, `instanceof`                 |
| **Igualdade**                 | `==`, `!=`                                        |
| **Bit a Bit E (AND)**         | `&`                                               |
| **Bit a Bit XOR (XOR)**       | `^`                                               |
| **Bit a Bit OU (OR)**         | `|`                                               |
| **Lógico E (AND)**            | `&&`                                              |
| **Lógico OU (OR)**            | `||`                                              |
| **Ternário**                  | `?:`                                              |
| **Atribuição**                | `=`, `+=`, `-=`, `*=`, `/=`, `%=`, `&=`, `^=`, `|=`, `<<=`, `>>=`, `>>>=` |

### **Observações sobre a Precedência**

- **Operadores com maior precedência**: O prefixo `++` e `--` têm maior prioridade e são avaliados antes de outros operadores.
- **Operadores de multiplicação, divisão e módulo** (`*`, `/`, `%`) têm precedência maior que operadores de soma e subtração.
- **Operadores lógicos** (`&&`, `||`) e bit a bit (`&`, `|`) têm uma precedência mais baixa.
- **Operador ternário** (`?:`) tem uma precedência intermediária e é avaliado após os operadores aritméticos e lógicos.

--- 

Assim, a **ordem de precedência** dos operadores em Java é importante para garantir que as expressões sejam avaliadas corretamente. Para garantir uma ordem desejada, recomenda-se o uso de parênteses para agrupar operações.
Aqui está o texto em Markdown, pronto para ser inserido:

Aqui está o texto formatado em Markdown para o Notion:

---

### Precedência 0: Atribuições

Os operadores de atribuição são os mais numerosos e os que têm uma prioridade menor de serem interpretados. Eles armazenam o valor que aparecer à direita na variável presente à esquerda. Caso deseje-se que a variável da esquerda receba o valor dela mesma após passar por alguma operação com um segundo valor, basta colocar o símbolo da operação antes do sinal `=` e colocar o segundo valor à direita.

Quando em uma mesma linha forem encontrados vários operadores diferentes, serão
executados primeiro aqueles que tiverem maior precedência. Se existirem operadores com o
mesmo valor de precedência, será realizado primeiro aquele cujo símbolo aparecer primeiro. É
possível alterar a ordem natural com que são feitas as operações através do uso de parênteses.
As operações entre parênteses sempre são realizadas antes.

---
### Precedência 1: operadores ternários
O operador ternário ? : recebe ao todo três operandos. O primeiro operando deve possuir
necessariamente um valor do tipo boolean. Os outros dois operandos podem ser de qualquer
tipo. Caso o valor do primeiro operando seja "verdadeiro", o operador retorna um valor igual ao
do segundo operando. Caso o seu valor seja "falso", ele retorna um valor idêntico ao terceiro
operando. 

Aqui está o texto formatado em Markdown para o Notion:

---

### Precedência 3 e 2: Operadores AND e OR

Os operadores AND e OR só podem ser usados em variáveis e literais do tipo **boolean**. O operador **AND (&&)** retorna "verdadeiro" quando seus dois operandos também valem "verdadeiro" e retorna "falso" caso contrário. O operador **OR (||)** retorna "falso" quando seus dois operandos são falsos e retorna "verdadeiro" caso contrário.

---

Aqui está o texto formatado em Markdown para o Notion:

---

### Precedência 6, 5 e 4: Operadores Bit-a-Bit

Os **Operadores Bit-a-Bit** são todos aqueles que realizam suas operações sobre os bits de um número, e não sobre o seu valor. Existem ao todo três desses operadores e cada um deles tem um valor de precedência diferente.

- O que tem precedência mais alta é o **AND bit-a-bit (&)**. Ele analisa dois bits e retorna `1` se ambos forem iguais a `1` e `0` caso contrário.
- Depois vem o **OR exclusivo bit-a-bit (^)** que retorna `1` se os bits forem diferentes e `0` caso contrário.
- Por último, vem o operador **OR inclusivo (|)**, que retorna `0` caso ambos os bits sejam `0` e retorna `1` caso contrário.

Esses operadores podem ser usados em qualquer tipo de dados, desde que possuam o mesmo tamanho em bits.

---
Aqui está o texto formatado em Markdown para o Notion:

---

### Precedência 7: Operadores de Igualdade

Os **Operadores de Igualdade** são semelhantes aos **Operadores Comparativos**. Eles também recebem números como operandos e retornam um valor booleano. A diferença é que estes operadores apenas verificam se as variáveis são iguais ou não.

Como exemplos de operadores assim, pode-se citar o **Igual a (==)** e **Diferente de (!=)**. Estes operadores podem ser usados em qualquer tipo de variável, desde que elas sejam do mesmo tipo.

---

Aqui está o texto formatado em Markdown para o Notion:

---

### Precedência 8: Operadores Comparativos

Os **Operadores Comparativos** comparam dois números e retornam em seguida o valor booleano "verdadeiro" ou "falso". Como exemplo, pode-se citar:

- **Menor que (`<`)**
- **Maior que (`>`)**
- **Menor ou Igual que (`<=`)**
- **Maior ou Igual que (`>=`)**
- **Exemplo de (`instanceof`)**

O significado dos quatro primeiros operadores é evidente. Já a operação **Exemplo de** retorna "verdadeiro" se o primeiro operando for um objeto pertencente à classe passada como segundo operando e "falso" caso contrário.

---

Aqui está o texto formatado em Markdown para o Notion:

---

### Precedência 9: Operadores de Shift

Os **Operadores de Shift** são operadores que deslocam os bits de um número de modo a alternar o seu valor. Exemplos de operadores deste tipo são:

- **Shift para a Direita (`>>`)**
- **Shift para a Direita Sem-Sinal (`>>>`)**
- **Shift para a Esquerda (`<<`)**

O primeiro valor a ser recebido pelo operador é o número sobre o qual será realizado o shift, e o segundo número é a quantidade de posições de bits a serem deslocados.

---

Aqui está o texto formatado em Markdown para o Notion:

---

### Precedência 10: Operadores Aditivos

Os **Operadores Aditivos** são operadores que realizam alguma operação igual ou equivalente à adição. Assim como os **Operadores Multiplicativos**, os **Aditivos** podem ser usados tanto em variáveis como em literais (quando fazem a concatenação de strings). No entanto, eles **não podem ser usados em variáveis do tipo `char` e `boolean`**.

Eles também não alteram as variáveis passadas para eles. Em vez disso, retornam um número que deve ser direcionado para uma variável por meio da operação de atribuição (veja abaixo).

Exemplos de uso:

---

Aqui está o texto formatado em Markdown para o Notion:

---

### Precedência 11: Operadores Multiplicativos

Os **Operadores Multiplicativos** são operadores que realizam uma operação igual ou semelhante à multiplicação. Exemplos de operações desse tipo são:

- **Multiplicação (`*`)**: Realiza a multiplicação entre dois valores que não sejam do tipo `boolean` nem do tipo `char`.
- **Divisão (`/`)**: Divide o primeiro número pelo segundo. Não pode ser usado em valores do tipo `boolean` ou `char`.
- **Resto (`%`)**: Retorna o resto da divisão do primeiro número pelo segundo.

Exemplos de uso:

---
Aqui está o texto formatado em Markdown para o Notion:

---

### Precedência 12: Operadores Prefixa

Os **Operadores Prefixa** são operadores unários que alteram o valor de uma variável, e seus sinais são posicionados antes do identificador da variável. Exemplos de operadores prefixa incluem:

- **Incremento (`++`)**: Aumenta o valor da variável em uma unidade.
- **Decremento (`--`)**: Diminui o valor da variável em uma unidade.
- **Sinal Positivo (`+`)**: Retorna a variável com o mesmo sinal.
- **Sinal Negativo (`-`)**: Inverte o sinal da variável, transformando números positivos em negativos e vice-versa. Não pode ser usado em variáveis do tipo `boolean` ou `char`.
- **Inversão (`~`)**: Inverte o sinal dos bits de uma variável. Só pode ser usado em variáveis inteiras.
- **Negação (`!`)**: Transforma `verdadeiro` em `falso` e vice-versa. Só pode ser usado em variáveis do tipo `boolean`.

O **Incremento** e **Decremento** são mencionados novamente porque seus sinais podem vir antes das variáveis, e, em uma operação complexa (com outros operadores binários), alteram a precedência da operação.

Esses operadores **só funcionam em variáveis**, não em literais.

Exemplos de uso:

---

Aqui está o texto formatado em Markdown para o Notion:

---

### Observação: Diferença entre Operadores `++` e `--` Prefixais e Sufixais

Uma diferença importante entre os operadores `++` e `--` **prefixais** e **sufixais** é o **tempo de avaliação** da expressão em comparação com a alteração da variável. Veja o exemplo a seguir:

```java
int x = 5; // x contém 5
int y, z; // y e z não foram definidos
y = x++; // primeiro faz y igual ao valor (anterior) de x, e depois modifica x
z = ++x; // primeiro modifica x, e depois atribui a z o novo valor de x
```

Neste exemplo, ao final:

- `x` vale 7 (duas vezes incrementado)
- `y` vale 5 (o valor inicial de `x`)
- `z` vale 7 (o valor final de `x`)

**Importante:** Deve-se evitar usar mais de um operador prefixal e sufixal na mesma linha, pois isso pode tornar o código **incompreensível**, por exemplo: `x = (y++ + ++z - --x) + ++y`.

---

Aqui está o texto formatado em Markdown para o Notion:

---

### Precedência 13: Operadores Sufixa

Os **Operadores Sufixa** são operadores unários posicionados **após o identificador** da variável para incrementar (`++`) ou decrementar (`--`) uma variável de tipo numérico em 1.

Esses operadores **não podem ser utilizados em variáveis** do tipo `string`, `boolean` ou de referência, nem em **valores de expressão** ou **literais**.

Ao contrário dos operadores de **pré-incremento** e **pré-decremento**, os operadores **sufixais** retornam o **valor original** da variável para a expressão e, em seguida, realizam a operação sobre a variável.

---

Aqui está o texto formatado em Markdown para o Notion:

---

Aqui está o conteúdo formatado para o Notion em Markdown:

---

### Sequências de Caracteres

**Strings** são usadas para armazenar texto. Uma variável `String` contém uma coleção de caracteres entre aspas duplas. Portanto, uma `String` em Java é, na verdade, um **objeto** que contém métodos que podem realizar certas operações em strings.

#### Exemplo de uso do método `length()`:
```java
String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
System.out.println("O comprimento da string txt é: " + txt.length());
```

#### Métodos Comuns de String:
- **toUpperCase()**: Converte todos os caracteres de uma string para maiúsculas.
- **toLowerCase()**: Converte todos os caracteres de uma string para minúsculas.

```java
String txt = "Hello World";
System.out.println(txt.toUpperCase()); // Saída: "HELLO WORLD"
System.out.println(txt.toLowerCase()); // Saída: "hello world"
```

#### Exemplo de uso do método `indexOf()`:
```java
String txt = "Please locate where 'locate' occurs!";
System.out.println(txt.indexOf("locate")); // Saída: 7
```

### Concatenação de Strings

O operador `+` pode ser usado entre strings para combiná-las. Isso é chamado de **concatenação**.

- Se você adicionar dois números, o resultado será um número:

```java
int x = 10;
int y = 20;
int z = x + y; // z será 30 (um inteiro/número)
```

- Se você adicionar duas strings, o resultado será uma concatenação de strings:

```java
String x = "10";
String y = "20";
String z = x + y; // z será 1020 (uma String)
```

- Se você adicionar um número e uma string, o resultado será uma concatenação de strings:

```java
String x = "10";
int y = 20;
String z = x + y; // z será 1020 (uma String)
```

#### Problema com aspas dentro de strings:
```java
String txt = "We are the so-called "Vikings" from the north.";
```

A solução para evitar esse problema é usar o caractere de escape `\`:

```java
String txt = "We are the so-called \"Vikings\" from the north.";
```

### Métodos de Strings

Aqui está uma lista de métodos importantes para trabalhar com strings:

| **Método**              | **Descrição**                                                                 | **Tipo de Retorno** |
|-------------------------|-------------------------------------------------------------------------------|---------------------|
| `charAt()`              | Retorna o caractere no índice (posição) especificado                          | `char`              |
| `codePointAt()`         | Retorna o Unicode do caractere no índice especificado                         | `int`               |
| `codePointBefore()`     | Retorna o Unicode do caractere antes do índice especificado                   | `int`               |
| `codePointCount()`      | Retorna o número de valores Unicode encontrados em uma string                 | `int`               |
| `compareTo()`           | Compara duas strings lexicograficamente                                        | `int`               |
| `compareToIgnoreCase()` | Compara duas strings lexicograficamente, ignorando diferenças de maiúsculas e minúsculas | `int`         |
| `concat()`              | Anexa uma string ao final de outra string                                      | `String`            |
| `contains()`            | Verifica se uma string contém uma sequência de caracteres                      | `boolean`           |
| `contentEquals()`       | Verifica se uma string contém a mesma sequência exata de caracteres            | `boolean`           |
| `copyValueOf()`         | Retorna uma String que representa os caracteres do array de caracteres        | `String`            |
| `endsWith()`            | Verifica se uma string termina com o(s) caractere(s) especificado(s)          | `boolean`           |
| `equals()`              | Compara duas strings. Retorna true se as strings forem iguais, e false caso contrário | `boolean`       |
| `equalsIgnoreCase()`    | Compara duas strings, ignorando considerações de maiúsculas e minúsculas      | `boolean`           |
| `format()`              | Retorna uma string formatada usando o local, a string de formato e os argumentos especificados | `String` |
| `getBytes()`            | Converte uma string em um array de bytes                                       | `byte[]`            |
| `getChars()`            | Copia caracteres de uma string para um array de caracteres                     | `void`              |
| `hashCode()`            | Retorna o código hash de uma string                                            | `int`               |
| `indexOf()`             | Retorna a posição da primeira ocorrência encontrada dos caracteres especificados em uma string | `int`     |
| `intern()`              | Retorna a representação canônica do objeto string                             | `String`            |
| `isEmpty()`             | Verifica se uma string está vazia ou não                                       | `boolean`           |
| `join()`                | Junta uma ou mais strings com um separador especificado                       | `String`            |
| `lastIndexOf()`         | Retorna a posição da última ocorrência encontrada dos caracteres especificados em uma string | `int`    |
| `length()`              | Retorna o comprimento de uma string especificada                               | `int`               |
| `matches()`             | Procura uma string para uma correspondência com uma expressão regular e retorna as correspondências | `boolean` |

---
Aqui está o texto resumido, mantendo os pontos principais sobre vetores:

---

### EstruturaDados.Vetores

Um **vetor** (ou array) é uma estrutura de dados composta por variáveis do mesmo tipo, chamadas **elementos**. Pode ter uma ou mais dimensões (sendo uma matriz quando bidimensional). O acesso aos elementos é feito por **índices**, que representam as **posições** dos elementos no vetor.

EstruturaDados.Vetores são considerados **objetos** em Java, sendo tipos por referência. Seus elementos podem ser de tipos primitivos ou tipos por referência. Para acessar um elemento, usamos o nome do vetor e o índice correspondente.

Cada item de um vetor é um **elemento**, e a **dimensão** refere-se ao conjunto de posições. O **tipo de dado** do vetor é o conjunto de valores que ele pode armazenar.

---

Claro! Aqui está o texto formatado em Markdown:

---

### Atribuição de Elementos em EstruturaDados.Vetores

Os **elementos** dos vetores podem ser atribuídos da seguinte forma: separados por vírgulas e entre chaves. Por exemplo, em um vetor unidimensional, poderíamos indicar os dados de seus elementos assim: `{x0, x1, x2, ..., xn}`, em que cada um dos valores `x` é um valor do elemento de índice correspondente no vetor. A numeração dos índices começa a partir do zero e pode ser somente número natural, ou seja, inteiro maior ou igual a zero.

EstruturaDados.Vetores podem ser declarados e iniciados conforme o seguinte exemplo – cada dimensão é delimitada por chaves e cada elemento é separado do outro através de vírgulas:

```java
int[] vetor = {34, 27, 3, 2};
```

---

Aqui está o trecho adicionado ao formato Markdown:

---

### Declaração e Atribuição de Elementos em EstruturaDados.Vetores

Outro modo de uso é declarar e inicializar o vetor com o tamanho (quantidade de elementos) do vetor e depois atribuir os valores, como mostrado no exemplo abaixo:

```java
int[] vetor = new int[4];
vetor = new int[] {34, 27, 3, 2};
```

---

Aqui está o trecho adicionado ao formato Markdown:

---

### Atribuição Individual de Elementos em EstruturaDados.Vetores

Também é possível atribuir os elementos individualmente após declarar o vetor. Veja o exemplo abaixo:

```java
int[] vetor = new int[4];
vetor[0] = 34;
vetor[1] = 27;
vetor[2] = 3;
vetor[3] = 2;
```

---

Aqui está o trecho formatado em Markdown:

---

### Descobrindo o Tamanho de um Array

Para descobrir quantos elementos um array possui, use a propriedade `length()`:

```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars.length);
```

### Percorrendo Elementos de um Array com `for`

Você pode percorrer os elementos do array com o loop `for` e usar a propriedade `length` para especificar quantas vezes o loop deve ser executado. O exemplo a seguir gera todos os elementos do array `cars`:

```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (int i = 0; i < cars.length; i++) {
    System.out.println(cars[i]);
}
```

Lembre-se de que o acesso ao elemento do array se dá pelo índice. Neste exemplo, foi utilizado o índice `i`, uma variável criada dentro do `for` (`int i = 0`).

### Usando o Loop "for-each"

Outra possibilidade é utilizar o loop "for-each", que é usado exclusivamente para percorrer elementos em arrays. A sintaxe é:

```java
for (type variable : arrayname) {
    ...
}
```

Exemplo:

```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String i : cars) {
    System.out.println(i);
}
```

### Diferença entre `for` e `for-each`

A diferença entre os loops `for` e `for-each` é sutil. No exemplo acima, pode-se ler assim: "Para cada elemento `String` (chamado `i`) em `cars`, imprima o valor de `i`". O método `for-each` é mais fácil de escrever, não requer um contador (usando a propriedade `length`) e é mais legível.

---
Segue o conteúdo formatado em Markdown:

---

## Conversão de Tipos

A conversão de tipo ocorre quando você atribui um valor de um tipo de dado primitivo a outro tipo. Em Java, existem dois tipos principais de conversão:

1. **Ampliação de Tipos (Casting Automático)**  
   Convertendo um tipo de tamanho menor para um tipo de tamanho maior. Este processo é feito automaticamente.  
   Exemplo: `int` para `double`.

2. **Estreitamento de Tipos (Casting Manual)**  
   Convertendo um tipo de tamanho maior para um tipo de tamanho menor. Este processo deve ser feito manualmente, especificando o tipo desejado entre parênteses.

### Ampliação de Tipos (Casting Automático)

A conversão é feita automaticamente ao passar um tipo menor para um tipo maior.

```java
public class Main {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println(myInt);   // Outputs: 9
        System.out.println(myDouble); // Outputs: 9.0
    }
}
```

### Estreitamento de Tipos (Casting Manual)

A conversão é feita manualmente, colocando o tipo desejado entre parênteses antes do valor.

```java
public class Main {
    public static void main(String[] args) {
        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual casting: double to int
        System.out.println(myDouble); // Outputs: 9.78
        System.out.println(myInt);    // Outputs: 9
    }
}
```
Segue o conteúdo formatado em Markdown:

---

## Controle de Fluxo

Até o momento, os programas que aprendemos executam de forma estática, sem interatividade. Com o uso de **instruções condicionais**, podemos permitir que programas tomem decisões e executem diferentes blocos de código com base em condições.

### Instrução `if`

A instrução `if`, ou **if-then**, permite a execução condicional de um bloco de instruções quando uma expressão booleana avaliada retorna `true`.

#### Estrutura:

```java
if (expressaoBooleana) {
    // Instruções executadas se a expressaoBooleana for true.
}
```

#### Operadores Lógicos:

- **Menor que**: `a < b`
- **Menor ou igual a**: `a <= b`
- **Maior que**: `a > b`
- **Maior ou igual a**: `a >= b`
- **Igual a**: `a == b`
- **Diferente de**: `a != b`

#### Exemplo:

```java
int hora = 20;
boolean eManha = false;

// Exemplo 1: com bloco
if (hora <= 12) {
    eManha = true;
    System.out.print(hora + " AM");
}

// Exemplo 2: sem bloco
if (!eManha)
    System.out.print(hora - 12 + " PM");
System.out.println(" é o mesmo que " + hora + " horas.");
```

**Saída:**  
`8 PM é o mesmo que 20 horas.`

### Instrução `if...else`

A instrução `if...else`, ou **if-then-else**, complementa a funcionalidade do `if` permitindo a execução de instruções alternativas caso a expressão booleana retorne `false`.

#### Estrutura:

```java
if (expressaoBooleana) {
    // Instruções executadas se a expressaoBooleana for true.
} else {
    // Instruções executadas se a expressaoBooleana for false.
}
```

#### Exemplo:

```java
int hora = 20;

if (hora <= 12)
    System.out.print(hora + " AM");
else
    System.out.print(hora - 12 + " PM");

System.out.println(" é o mesmo que " + hora + " horas.");
```

**Saída:**  
`8 PM é o mesmo que 20 horas.`

### Instruções Aninhadas (`if` dentro de outro `if`)

Instruções `if` e `if...else` podem ser aninhadas para criar condições mais complexas.

#### Exemplo:

```java
int hora = 20;

if (hora < 0 || hora >= 24) {
    if (hora < 0)
        System.out.print("Erro: A hora deve ser maior que 0.");
    else
        System.out.print("Erro: A hora deve ser menor que 24.");
} else {
    if (hora <= 12)
        System.out.print(hora + " AM");
    else
        System.out.print(hora - 12 + " PM");
    System.out.println(" é o mesmo que " + hora + " horas.");
}
```

**Saída:**  
`8 PM é o mesmo que 20 horas.`

### Instrução `else if`

A instrução `else if` permite adicionar várias condições após uma instrução `if`. Isso é útil para cenários onde múltiplas verificações são necessárias.

#### Estrutura:

```java
if (expressaoBooleana1) {
    // Instruções caso expressaoBooleana1 seja true.
} else if (expressaoBooleana2) {
    // Instruções caso expressaoBooleana1 seja false e expressaoBooleana2 seja true.
} else {
    // Instruções caso todas as expressões anteriores sejam false.
}
```

#### Exemplo:

```java
int hora = 20;

if (hora < 0)
    System.out.print("Erro: A hora deve ser maior que 0.");
else if (hora >= 24)
    System.out.print("Erro: A hora deve ser menor que 24.");
else if (hora <= 12)
    System.out.print(hora + " AM é o mesmo que " + hora + " horas.");
else
    System.out.print(hora - 12 + " PM é o mesmo que " + hora + " horas.");
```

**Saída:**  
`8 PM é o mesmo que 20 horas.`

#### Alternativa com Identação:

```java
int hora = 20;

if (hora < 0)
    System.out.print("Erro: A hora deve ser maior que 0.");
else
    if (hora >= 24)
        System.out.print("Erro: A hora deve ser menor que 24.");
    else
        if (hora <= 12)
            System.out.print(hora + " AM é o mesmo que " + hora + " horas.");
        else
            System.out.print(hora - 12 + " PM é o mesmo que " + hora + " horas.");
```

**Observação:**  
Embora o código acima funcione, o uso de `else if` com identação adequada melhora a legibilidade e manutenção do código.

---
### Switch case
O texto descreve detalhadamente a estrutura e funcionamento do comando `switch` em Java, usado para controle condicional baseado na correspondência entre uma expressão e valores constantes. Aqui está um resumo do conteúdo abordado:

### Estrutura Básica do `switch`
```java
switch (expressao) {
    case constante1:
        // Instruções
        break;
    case constante2:
        // Instruções
        break;
    default:
        // Instruções
}
```

1. **Tipos Suportados na Expressão do `switch`**:
   - `byte`, `short`, `char`, `int`, `String` e `enum`.

2. **Funcionamento do `case`**:
   - Cada `case` contém uma expressão constante compatível com o tipo da expressão avaliada no `switch`.
   - O caractere `:` delimita o início do bloco de instruções.

3. **Execução Sequencial**:
   - Sem a instrução `break`, a execução continua nos blocos subsequentes, mesmo que a condição de outro `case` não seja atendida.

4. **Uso do `break`**:
   - Finaliza a execução do bloco atual e sai do `switch`.
   - Se não for usado, todas as instruções seguintes serão executadas.

5. **Bloco `default`**:
   - Opcional, executado quando nenhum dos casos é correspondido.
   - Pode ser colocado em qualquer posição no bloco, mas geralmente aparece no final.

### Exemplos de Código
1. **Sem `break`**:
   ```java
   int dia = 5;
   switch (dia) {
       case 2:
           System.out.print("Segunda ");
       case 3:
           System.out.print("Terça ");
       case 4:
           System.out.print("Quarta ");
       case 5:
           System.out.print("Quinta ");
       case 6:
           System.out.print("Sexta ");
   }
   // Saída: Quinta Sexta
   ```

2. **Com `break`**:
   ```java
   int dia = 5;
   switch (dia) {
       case 2:
           System.out.print("Segunda ");
           break;
       case 5:
           System.out.print("Quinta ");
           break;
       case 6:
           System.out.print("Sexta ");
           break;
       default:
           System.out.print("Outro dia");
   }
   // Saída: Quinta
   ```

3. **Uso do `default`**:
   ```java
   int dia = -1;
   switch (dia) {
       case 1:
           System.out.print("Domingo ");
           break;
       case 2:
           System.out.print("Segunda ");
           break;
       default:
           System.out.print("Erro: dia inválido");
   }
   // Saída: Erro: dia inválido
   ```

4. **Execução com Fluxo Completo**:
   - Exemplo sem `break`, onde o fluxo continua até o final ou até encontrar um `break`.

5. **Combinação de `case`**:
   - Dois ou mais `case` podem ser combinados:
   ```java
   switch (dia) {
       case 0:
       case 1:
           System.out.print("Fim de semana ");
           break;
       default:
           System.out.print("Dia útil ");
   }
   ```
   
---
### Loops em Java: `while` e `do/while`

Loops são estruturas fundamentais para a execução repetitiva de blocos de código, desde que uma condição especificada seja atendida. Vamos detalhar as características e exemplos de cada tipo de loop mencionado.

---

#### **1. Loop `while`**

O loop `while` executa repetidamente um bloco de código **enquanto a condição especificada for verdadeira**.  
Se a condição inicial for falsa, o loop não executará nenhuma iteração.

**Estrutura:**
```java
while (condição) {
    // bloco de código a ser executado enquanto a condição for verdadeira
}
```

**Exemplo:**
```java
int contador = 0;

while (contador < 5) {
    System.out.println("Contador: " + contador);
    contador++;
}
```

**Saída:**
```
Contador: 0
Contador: 1
Contador: 2
Contador: 3
Contador: 4
```

---

#### **2. Loop `do/while`**

O loop `do/while` é uma **variante do `while`**, com a principal diferença de que **o bloco de código será executado pelo menos uma vez, independentemente da condição ser verdadeira ou falsa**, pois a verificação ocorre após a execução do bloco.

**Estrutura:**
```java
do {
    // bloco de código a ser executado
} while (condição);
```

**Exemplo:**
```java
int i = 0;

do {
    System.out.println("Valor de i: " + i);
    i++;
} while (i < 5);
```

**Saída:**
```
Valor de i: 0
Valor de i: 1
Valor de i: 2
Valor de i: 3
Valor de i: 4
```

---

#### **Comparação entre `while` e `do/while`**

| **Características**        | **`while`**                         | **`do/while`**                          |
|-----------------------------|--------------------------------------|------------------------------------------|
| **Execução mínima**         | Não é garantida                     | Sempre executa ao menos uma vez          |
| **Condição**                | Verificada antes de executar o bloco | Verificada após a execução do bloco      |
| **Uso principal**           | Quando o bloco pode não ser executado | Quando o bloco deve executar pelo menos uma vez |

---

#### **Exemplo com Condição Inicial Falsa**
Para ilustrar a diferença prática:

**`while` com condição falsa:**
```java
int x = 10;

while (x < 5) {
    System.out.println("Não será executado.");
}
```

**Saída:**
*(nenhuma saída)*

**`do/while` com condição falsa:**
```java
int x = 10;

do {
    System.out.println("Executado uma vez.");
} while (x < 5);
```

**Saída:**
```
Executado uma vez.
```

---

Esses loops são muito úteis para evitar repetição manual de código, tornando-o mais limpo, legível e eficiente. **Escolha o tipo de loop com base na lógica e na necessidade de executar o bloco de código pelo menos uma vez ou não.**
### **Loop `for` em Java**

O loop `for` em Java é amplamente utilizado para executar um bloco de código várias vezes, baseado em uma condição que é avaliada a cada iteração. Ele é composto por três partes principais: inicialização, condição e atualização.

---

### **Estrutura do Loop `for`**

```java
for (inicialização; condição; atualização) {
    // Bloco de código a ser executado
}
```

1. **Inicialização**: Executada uma única vez no início do loop. É usada para declarar e inicializar variáveis de controle.
2. **Condição**: Avaliada antes de cada iteração. O loop continua enquanto esta condição for verdadeira.
3. **Atualização**: Executada ao final de cada iteração, normalmente usada para alterar o valor da variável de controle.

---

### **Exemplo Simples**

O exemplo abaixo imprime os números de 0 a 4:

```java
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Valor de i: " + i);
        }
    }
}
```

**Saída:**
```
Valor de i: 0  
Valor de i: 1  
Valor de i: 2  
Valor de i: 3  
Valor de i: 4
```

---

### **Loop `for` com Array**

O loop `for` também pode ser usado para percorrer elementos de um array:

```java
public class Main {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento no índice " + i + ": " + numeros[i]);
        }
    }
}
```

**Saída:**
```
Elemento no índice 0: 10  
Elemento no índice 1: 20  
Elemento no índice 2: 30  
Elemento no índice 3: 40  
Elemento no índice 4: 50
```

---

### **Características do Loop `for` em Java**

- **Flexibilidade**: Pode ser usado para iterar em ordem crescente, decrescente ou com incrementos personalizados.
- **Personalização**: As expressões de inicialização, condição e atualização podem ser adaptadas conforme a lógica desejada.
- **Uso Combinado**: É possível trabalhar com várias variáveis no loop.

**Exemplo de Contagem Regressiva:**
```java
public class Main {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            System.out.println("Contagem regressiva: " + i);
        }
        System.out.println("Fogo!");
    }
}
```

**Saída:**
```
Contagem regressiva: 5  
Contagem regressiva: 4  
Contagem regressiva: 3  
Contagem regressiva: 2  
Contagem regressiva: 1  
Fogo!
```

---

O loop `for` é uma ferramenta poderosa que permite percorrer estruturas de dados e executar tarefas repetitivas de forma eficiente e clara.