package EstruturaDados;

public class Vetores {
    public static void main(String[] args) {
        // maneira comum de declarar vetores
        int [] vetor = {34,27,3,2};
        System.out.println(vetor);

        System.out.println();

        // outra maneira de declarar vetores
        int [] vetor2= new int [4];
        vetor2= new int[]{34, 27, 3,2};

        // declarando vetores de maneira individual
        int[] vetor3 = new int[4];
        vetor[0] = 34;
        vetor[1] = 27;
        vetor[2] = 3;
        vetor[3] = 2;

        // Descobrindo o tamanho do vetor
        String cars [] ={"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars.length);
        System.out.println();

        // demonstrando quantas vezes o loop deve ser executado usando o length no laço for
        // assim o codigo executa 4 vezes o conteudo armazenado no vetor
        String cars1 [] ={"Volvo", "BMW", "Ford", "Mazda"};
        for ( int i=0;i<cars.length;i++){
            System.out.println(cars[i]);
        }
        System.out.println();

        //Outra possibilidade é utilizar o loop "for-each", que é usado exclusivamente para percorrer
        //elementos em arrays. A sintaxe é: for (type variable : arrayname) {
        //...
        //}
        String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars2) {
            System.out.println(i);
        }


    }
}
