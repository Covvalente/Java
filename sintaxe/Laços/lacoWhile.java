package Laços;

import java.util.Scanner;

public class lacoWhile {
    public static void main(String[] args) {
        int contador=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numéro para contar até ele ");
        int n = sc.nextInt();

        while(contador<=n){
            System.out.println("Contando..."+contador);
            contador++;

        }
    }
}
