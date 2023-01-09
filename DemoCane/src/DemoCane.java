public class DemoCane {
    public static void main(String[] args) {
        // Istanzio ll'oggetto balto di tipo Cane
        Cane balto = new Cane();

        // Assegno all'attributo nome dell'oggetto balto il nome balto
        balto.nome = "Balto";
        balto.anni = 8;
        balto.razza = "Husky Siberiano";

        // Eseguo il metodo scriviOutput() dell'oggetto balto
        balto.scriviOutput();

        Cane scooby = new Cane();
        scooby.nome = "Scooby";
        scooby.anni = 9;
        scooby.razza = "Alano";

        System.out.println(scooby.nome + " è un " + scooby.razza);
        System.out.print("Ha " + scooby.anni + " anni, oppure ");
        int anniUmani = scooby.getEtaInAnniUmani();
        System.out.println(anniUmani + " in anni umani.");

        Cane dart;
        dart = new Cane();
        dart.nome = "Dart";
        dart.anni = 100;
        dart.razza = "DemoCane";

        dart.scriviOutput();

        int anniUmaniDart = dart.getEtaInAnniUmani();

        System.out.println("Anni umani di Dart: " + anniUmaniDart);
    }
}