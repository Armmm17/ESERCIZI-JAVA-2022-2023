import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totale = 0;
        int i = 0;
        boolean cond = false;
        int sommaNumeriCount = 0;

        System.out.println("Inserisci il totale delle somme: ");
        totale = input.nextInt();

        while(i >= 0){
            sommaNumeriCount += i;
            if (sommaNumeriCount==totale){
                cond = true;
                System.out.println(cond);
                break;
            }
            // System.out.println(i);
            i++;
            if(sommaNumeriCount > totale){
                cond = false;
                System.out.println(cond);
                break;
            }
        }

    }
}