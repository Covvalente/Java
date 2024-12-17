public class operadores {
    public static void main(String[] args) {

        // Operadores Aritméticos
        int a = 5, b = 2;
        int soma = a + b;  // Adição
        int subtracao = a - b;  // Subtração
        int multiplicacao = a * b;  // Multiplicação
        int divisao = a / b;  // Divisão
        int modulo = a % b;  // Resto da divisão (Módulo
        a++;  // Incremento
        b--;  // Decremento

        // Operadores de Atribuição
        a += b;  // Atribuição de soma
        a -= b;  // Atribuição de subtração
        a *= b;  // Atribuição de multiplicação
        a /= b;  // Atribuição de divisão
        a %= b;  // Atribuição de módulo
        a &= b;  // Atribuição de AND bit a bit
        a ^= b;  // Atribuição de XOR bit a bit
        a |= b;  // Atribuição de OR bit a bit
        a <<= 1; // Atribuição de deslocamento à esquerda
        a >>= 1; // Atribuição de deslocamento à direita
        a >>>= 1; // Atribuição de deslocamento à direita com preenchimento de zero

        // Operadores Relacionais
        boolean maiorQue = a > b;  // Maior que
        boolean menorQue = a < b;  // Menor que
        boolean maiorIgual = a >= b;  // Maior ou igual a
        boolean menorIgual = a <= b;  // Menor ou igual a
        boolean igual = a == b;  // Igual a
        boolean diferente = a != b;  // Diferente de

        // Operadores Lógicos
        boolean not = !(a > b);  // Negação lógica (NOT)
        boolean and = (a > b) && (b > 0);  // Conjunção lógica (AND)
        boolean or = (a > b) || (b > 0);  // Disjunção lógica (OR)

        // Operadores Bit a Bit (Bitwise)
        int andBitwise = a & b;  // AND bit a bit
        int orBitwise = a | b;   // OR bit a bit
        int xorBitwise = a ^ b;  // XOR bit a bit
        int notBitwise = ~a;     // Complemento bit a bit
        int shiftLeft = a << 1;  // Deslocamento à esquerda (shift left)
        int shiftRight = a >> 1; // Deslocamento à direita (shift right)
        int unsignedShiftRight = a >>> 1; // Deslocamento à direita com preenchimento de zero (unsigned shift right)

        // Operadores de Comparação (Testa tipo de dado)
        boolean instancia = a instanceof Integer;  // Verifica se um objeto é uma instância de uma classe

        // Operadores Ternários
        int resultado = (a > b) ? a : b;  // Operador ternário (condição ? valor1 : valor2)

        // Operadores Prefixos e Sufixos
        int incrementoPrefixado = ++a;  // Incremento prefixado
        int decrementoPrefixado = --b;  // Decremento prefixado
        int incrementoPosfixado = a++;  // Incremento posfixado
        int decrementoPosfixado = b--;  // Decremento posfixado

        // Operadores de Tipo (Casting)
        double c = 10.5;
        int d = (int) c;  // Conversão de tipo (casting)
    }
}
