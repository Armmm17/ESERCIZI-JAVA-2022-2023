import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opzione;
        Scanner input = new Scanner(System.in);
        Auto auto1 = new Auto();

        Menu();
        opzione = input.nextInt();

        while(opzione != 0){
            switch (opzione){
                case 1:
                    input = new Scanner(System.in);
                    System.out.println("Produttore: ");
                    auto1.produttore = input.nextLine();
                    Menu();
                    opzione = input.nextInt();
                    break;
                case 2:
                    input = new Scanner(System.in);
                    System.out.println("Modello: ");
                    auto1.modello = input.nextLine();
                    Menu();
                    opzione = input.nextInt();
                    break;
                case 3:
                    input = new Scanner(System.in);
                    System.out.println("Targa: ");
                    auto1.targa = input.nextLine();
                    Menu();
                    opzione = input.nextInt();
                    break;
                case 4:
                    auto1.targa = auto1.genTarga();
                    System.out.println("Targa: " + auto1.targa);
                    Menu();
                    opzione = input.nextInt();
                    break;
                case 5:
                    input = new Scanner(System.in);
                    System.out.println("Tipo di veicolo: ");
                    auto1.tipoVeicolo = input.nextLine();
                    Menu();
                    opzione = input.nextInt();
                    break;
                case 6:
                    input = new Scanner(System.in);
                    System.out.println("Chilometraggio: ");
                    auto1.chilometraggioTot = input.nextDouble();
                    Menu();
                    opzione = input.nextInt();
                    break;
                case 7:
                    input = new Scanner(System.in);
                    System.out.println("Cilindrata: ");
                    auto1.cilindrata = input.nextInt();
                    Menu();
                    opzione = input.nextInt();
                    break;
                case 8:
                    input = new Scanner(System.in);
                    System.out.println("Potenza (Cavalli): ");
                    auto1.potenzaCV = input.nextInt();
                    Menu();
                    opzione = input.nextInt();
                    break;
                case 9:
                    input = new Scanner(System.in);
                    System.out.println("Alimentazione (diesel/elettrico/benzina): ");
                    auto1.alimentazione = input.nextLine();
                    Menu();
                    opzione = input.nextInt();
                    break;
                case 10:
                    input = new Scanner(System.in);
                    System.out.println("Capacità serbatoio (in litri): ");
                    auto1.capacitaSerbatoio = input.nextDouble();
                    Menu();
                    opzione = input.nextInt();
                    break;
                case 11:
                    input = new Scanner(System.in);
                    System.out.println("Prima immatricolazione (formato: GG/MM/AA): ");
                    auto1.firstCarReg = input.nextLine();
                    Menu();
                    opzione = input.nextInt();
                    break;
                case 12:
                    input = new Scanner(System.in);
                    System.out.println("Ultima immatricolazione (formato: GG/MM/AA): ");
                    auto1.lastCarReg = input.nextLine();
                    Menu();
                    opzione = input.nextInt();
                    break;
                case 13:
                    auto1.stampa();
                    System.out.println(" ");
                    Menu();
                    opzione = input.nextInt();
                    break;
            }
        }
    }

    public static void Menu(){
        System.out.println("Opzioni: ");
        System.out.println("    0. Esci dal Programma");
        System.out.println("    1. Inserisci il produttore");
        System.out.println("    2. Inserisci il modello ");
        System.out.println("    3. Inserisci la targa");
        System.out.println("    4. Inserisci una targa generata automaticamente");
        System.out.println("    5. Inserisci il tipo di veicolo");
        System.out.println("    6. Inserisci il chilometraggio");
        System.out.println("    7. Inserisci la cilindrata");
        System.out.println("    8. Inserisci la potenza (in cavalli)");
        System.out.println("    9. Inserisci il tipo di alimentazione del motore (diesel/elettrico/benzina)");
        System.out.println("   10. Inserisci la capacità del serbatoio");
        System.out.println("   11. Inserisci la prima immatricolazione ");
        System.out.println("   12. Inserisci l'ultima immatricolazione");
        System.out.println("   13. Stampa le informazioni della auto");
        System.out.println(" ");
        System.out.println("Inserisci l'opzione: ");
    }
}