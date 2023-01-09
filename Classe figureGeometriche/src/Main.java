import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // TEST CLASSE Triangolo
        System.out.println("TEST CLASSE Triangolo");
        System.out.println("");
        TriangoloIsoscele t1 = new TriangoloIsoscele();
        Scanner input = new Scanner(System.in);

        t1.base = 3;
        t1.altezza = 10;
        System.out.println("Base: "+t1.base);
        System.out.println("Altezza: "+t1.altezza);

        System.out.println("Area: " + t1.area());
        System.out.println("Perimetro: " + t1.perimetro());

        //TEST CLASSE Quadrato
        System.out.println("");
        System.out.println("TEST CLASSE Quadrato");
        Quadrato q1 = new Quadrato();
        q1.lato = 5.25;
        System.out.println("Lato: "+q1.lato);
        System.out.println("Perimetro: "+q1.perimetro());
        System.out.println("Area: "+q1.area());


        // TEST CLASSE PoligonoRegolare
        System.out.println("");
        System.out.println("TEST CLASSE PoligonoRegolare");
        PoligonoRegolare pR1 = new PoligonoRegolare();
        pR1.lato = 7.17;
        pR1.nLati = 7;
        System.out.println("Lato: "+pR1.lato);
        System.out.println("Numero Lati: "+pR1.nLati);
        System.out.println("Perimetro: "+pR1.perimetro());
        System.out.println("Area: "+pR1.area());

    }
}