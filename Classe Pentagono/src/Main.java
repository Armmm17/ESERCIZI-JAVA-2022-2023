import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lato = 0;
        Pentagono figura1 = new Pentagono();
        System.out.println("Inserisci la lunghezza del lato del pentagono: ");
        lato = input.nextInt();


        System.out.println(figura1.calcolaPerimetro(lato));
        System.out.print(figura1.calcolaArea(lato));


    }
}