package condicionais;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = sc.nextInt();

        switch (n) {
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Quarta");
                break;

            case 4:
                System.out.println("Quinta");
                break;

            case 5:
                System.out.println("Sexta");
                break;
                case 6:
                    System.out.println("Sabado");
                    break;
            case 7 :
                System.out.println(" domingo");
                break;
                default:
                    System.out.println("Fim programa");
        }
    }
}
