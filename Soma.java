package myfirstapp;
import java.util.Scanner;
public class Soma{
public static void main(String args[]){
    Scanner input  = new Scanner(System.in);
    System.out.println("Digite o primeiro número: ");
        int num1 = input.nextInt();
    System.out.println("Digite o segundo número: ");
        int num2 = input.nextInt();
    int resultado = num1*num2;
        System.out.println("O resultado é "+resultado);   
}
}