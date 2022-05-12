package br.com.dio.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double a, b;
        System.out.println("Type the first value: ");
        a = scan.nextInt();

        System.out.println("Type the second value: ");
        b = scan.nextInt();


        double somar = somar(a, b);
        double subtrair = subtrair(a, b);
        double multiplicar = multiplicar(a, b);
        double dividir = dividir(a, b);

        System.out.println("soma: " + somar);
        System.out.println("subtração: " + subtrair);
        System.out.println("multiplicação: " + multiplicar);
        System.out.println("divisao: " + dividir);

    }

    public static double somar (double a, double b) {
        return a + b;
    }
    public static double subtrair (double a, double b) {
        return a - b;
    }
    public static double multiplicar (double a, double b) {
        return a * b;
    }
    public static double dividir (double a, double b) {
        return a / b;
    }


}
