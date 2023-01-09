package com.company;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        /*
         * // Dichiaro le variabili di tipo intero nUser(numero inserito dall'utente) e
         * somma inizializandola a 0 e dichiaro la variabile input di tipo Scanner
         * int nUser, somma = 0;
         * Scanner input = new Scanner(System.in);
         *
         * // Chiedo in input all'utetne il valore che andrà salvato nella variabile
         * nUser
         * System.out.println("Inserisci il numero: ");
         * nUser = input.nextInt();
         *
         * // Utilizzo un ciclo for per stampare la somma dei numeri che divisi per la
         * variabile nUser danno resto 0
         * for(int i = 1; i <= 100; i++){
         * if(i%nUser==0){
         * somma +=i;
         * System.out.println("La somma è: "+ somma);
         * }
         * }
         */

        // Dichiaro le variabili di tipo intero nUser(numero inserito dall'utente) e
        // somma inizializandola a 0 e dichiaro la variabile input di tipo Scanner
        int nUser, opzione = 1, somma = 0;
        Scanner input = new Scanner(System.in);

        while (opzione != 0) {
            menu();
            System.out.println("Inserisci l'opzione: ");
            opzione = input.nextInt();
            if (opzione == 1) {
                // Chiedo in input all'utetne il valore che andrà salvato nella variabile nUser
                System.out.println("Inserisci il numero: ");
                nUser = input.nextInt();

                // Utilizzo un ciclo for per stampare la somma dei numeri che divisi per la
                // variabile nUser danno resto 0
                for (int i = 1; i <= 100; i++) {
                    if (i % nUser == 0) {
                        somma += i;
                        System.out.println("La somma è: " + somma);
                    }
                }
            }
        }
    }

    public static void menu() {
        System.out.println("Opzioni:	");
        System.out.println("	0) Esci dal programma");
        System.out.println(
                "	1) Avvia il programma( chiede input un valore e calcola la somma di tutti i numeri divisibili per il numero inserito dall'utente da 1 a 100)");

    }
}