import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nParole, conteggio = 0;

        System.out.println("Quante parole vuoi inserire? ");
        nParole = input.nextInt();
        String[] parole = new String[nParole];

        input = new Scanner(System.in);
        for(int i = 0; i < nParole; i++){
            System.out.println("Inserisci la parola: ");
            parole[i] = input.nextLine();
        }

        //DEBUG
        for (int i = 0; i < nParole; i++){
            System.out.println(parole[i]);
        }

        for (int i = 1; i < nParole; i++){
            if(parole[i].equals(parole[i-1])){
                conteggio+=1;
            }
        }

        System.out.println("conteggio: "+conteggio);

    }
}