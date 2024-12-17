package Precedencia;

public class Precedencia12 {
    public static void main(String[] args) {
        int numero=5; //numero contém 5
        boolean ligado=false; //ligado contém "falso"
        ++numero; //numero agora vale 6
        --numero; //numero passa a valer 5
        numero=+numero; //numero continua valendo 5
        numero=-numero; //numero passa a valer -5
        numero=~numero; //numero passa a valer 4
        ligado=!ligado; //ligado passa a representar o valor "true"

        int x = 5; // x contém 5
        int y, z; // y e z não foram definidos
        y = x++; // primeiro faz y igual ao valor (anterior) de x, e depois modifica x

                z = ++x; // primeiro modifica x, e depois atribui a z o novo valor de x


    }
}
