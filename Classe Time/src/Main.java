public class Main {
    public static void main(String[] args) {
        Time orario1 = new Time();
        orario1.ore = 23;
        orario1.min = 59;
        orario1.sec = 59;

        // TEST METODO AGGIUNGI1SEC
        orario1.aggiungi1Sec();
        System.out.println(orario1.toString());

        // TEST METODO AGGIUNGIORARIO
        int addOre, addMin, addSec;
        addOre = 3;
        addMin = 35;
        addSec = 42;
        orario1.aggiungiOrario(addOre, addMin, addSec);
        System.out.println(orario1.toString());

        // TEST METODO VERIFICA ORARIO
        int ore = 25;
        int min = 64;
        int sec = 79;

        System.out.println(orario1.verificaOrario(ore, min, sec));

        // TEST METODO
        System.out.println(orario1.verifica());
        // TEST METODO
        System.out.println(orario1.mezzanotte());
    }
}