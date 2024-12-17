package Precedencia;

public class Precedencia7 {
    public static void main(String[] args) {
        boolean variavel ;
        variavel =(-5==5);// variável recebe falso
        variavel=(2!=45674);// variavel recebe verdadeiro
        /*
        ao utilizar operadores de igualdade com objetos , a comparação
        é feita entre suas referencias . dessa forma , dois objetos coginitivamente
        iguais , podem ser avaliados como diferentes. exemplo:

         */
        class Pessoa{
            String nome;

            public Pessoa(String nome){
                this.nome = nome;
            }
        }
       // boolean b = new Pessoa("Mateus") == new Pessoa("Mateus");// comparação avaliada como falsa

    }
}
