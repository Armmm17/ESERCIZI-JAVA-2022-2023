import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "";
        String char1, char2;

        System.out.println("Inserisci la stringa: ");
        str = input.nextLine();
        System.out.println("Inserisci il primo carattere: ");
        char1 = input.nextLine();
        System.out.println("Inserisci il secondo carattere: ");
        char2 = input.nextLine();

        System.out.println(str);
        System.out.println(char1);
        System.out.println(char2);

    }
}