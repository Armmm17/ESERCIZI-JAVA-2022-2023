public class Main {
    public static void main(String[] args) {
        Mostro bob = new Mostro();
        bob.nome = "Bob";
        bob.stazza = 4;
        bob.potere = "volare";
        bob.pvTot = 20;
        bob.danno = 2;

        boolean statoMostroBob = bob.vivo();

        System.out.println(statoMostroBob);
    }
}