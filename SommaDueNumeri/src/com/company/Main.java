package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1, num2, somma;
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci il primo numero: ");
        num1 = input.nextInt();
        System.out.println("Inserisci il secondo numero: ");
        num2 = input.nextInt();

        somma = num1 + num2;

        System.out.println("La somma tra "+ num1 +" e "+ num2 + " è " + somma);

    }
}