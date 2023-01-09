package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Dichiaro le variabili
        Scanner input = new Scanner (System.in);
        int lato1, lato2, lato3;


        // Chiedo in input i valori da assegnare ai lati
        System.out.println("Inserisci il valore del primo lato: ");
        lato1 = input.nextInt();
        System.out.println("Inserisci il valore del secondo lato: ");
        lato2 = input.nextInt();
        System.out.println("Inserisci il valore del terzo lato: ");
        lato3 = input.nextInt();


        if((lato1 == lato2) && (lato2 == lato3)){
            System.out.println("Il triangolo è equilatero!");
        } else if((lato1 == lato2) || (lato2 == lato3) || (lato1 == lato3)){
            System.out.println("Il triangolo è isoscele!");
        } else{
            System.out.println("Il triangolo è scaleno");
        }
    }
}