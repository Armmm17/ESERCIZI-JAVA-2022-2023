public class Main {
    public static void main(String[] args) {
        Cerchio c1 = new Cerchio();
        c1.raggio = 15;
        double angolo = 45;
        double raggioCond = 12;

        double areaC1 = c1.areaCerchio();
        System.out.println("AREA Cerchio: "+areaC1);

        double areaSpicchioC1 = c1.areaSpicchio(angolo);
        System.out.println("Area Spicchio (con var): "+ areaSpicchioC1);
        System.out.println("Area Spicchio (no var): "+ c1.areaSpicchio(angolo));

        double areaCornicioneSpicchioC1 = c1.areaCornicione(angolo, raggioCond);
        System.out.println("Area Cornicione Spicchio: "+areaCornicioneSpicchioC1);

    }
}