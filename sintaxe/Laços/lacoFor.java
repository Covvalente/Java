package Laços;

import java.util.Scanner;

public class lacoFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor para uma contagem regressiva");
        int n = sc.nextInt();
        for ( int i =n;i>=0;i--){
            System.out.println("Contagem regressiva..."+i);
        }
    }
}
