package Laços;

import java.util.Scanner;

public class lacoDoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para a contagem regressiva");
        int num = sc.nextInt();
        do{
            System.out.println("Contagem regressiva ..." + num);
            num--;
        } while(num>=0);



    }
}
