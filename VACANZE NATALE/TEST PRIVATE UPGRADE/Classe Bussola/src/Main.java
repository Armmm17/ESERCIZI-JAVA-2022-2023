public class Main {
    public static void main(String[] args) {

        // START
        int gradi = 255;
        Bussola bss = new Bussola(gradi);


        // TEST metodo stampa
        System.out.println(bss.stampa());

        // TEST metodo gradiNord
        System.out.println("Mancano " + bss.gradiNord() + " gradi al nord");

        // TEST metodo gradiValidi (risultato = false)
        bss.setGradi(420);
        System.out.println("validità gradi: " + bss.gradiValidi());

        // TEST metodo gradiValidi (risultato =  true)
        bss.setGradi(255);
        System.out.println("validità gradi: " + bss.gradiValidi());

        // TEST metodo aggiungi1grado ()
        bss.aggiungi1grado();
        System.out.println(bss.stampa());

        // TEST metodo togli1grado
        bss.togli1grado();
        System.out.println(bss.stampa());

        // TEST metodo aggiungiNgradi
        int gradiToAdd = 128;
        bss.aggiungiNgradi(gradiToAdd);
        System.out.println(bss.stampa());

        // TEST metodo togliNgradi
        int gradiToSub = 150;
        bss.togliNgradi(gradiToSub);
        System.out.println(bss.stampa());

        // TEST metodo confronta
        int direction = 180;
        System.out.println("Mancano " + bss.confronta(direction) + " gradi alla direzione " + direction);



    }
}