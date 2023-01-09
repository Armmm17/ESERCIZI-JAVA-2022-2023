public class Main {
    public static void main(String[] args) {
        // START
        double temperatura = 36.4;
        Termometro term = new Termometro(temperatura);

        // TEST metodo stampa
        System.out.println(term.stampa());

        // TEST metodo aumenta1grado
        term.aumenta1grado();
        System.out.println(term.stampa());

        // TEST metodo togli1grado
        term.togli1grado();
        System.out.println(term.stampa());

        // TEST metodo febbre (risultato = false)
        System.out.println("Febbre: " + term.febbre());


        // TEST metodo febbre (risultato = true)
        term.setTemperatura(39.5);
        System.out.println(term.stampa());
        System.out.println("Febbre: " + term.febbre());

        // TEST metodo confronta
        double valTemp2 = 35;
        System.out.println("La differneza tra "+ term.getTemperatura() + " e " + valTemp2 + " e di " + term.confronta(valTemp2));

        // TEST metodo intervallo (risultato = false)
        double higher = 34, lower = 37.5;
        System.out.println("la temperatura è compresa nell'intervallo " + lower + " - " + higher + ": "+term.intervallo(lower, higher));

        // TEST metodo intervallo (risultato = true)
        term.setTemperatura(36.3);
        System.out.println("la temperatura è compresa nell'intervallo " + lower + " - " + higher + ": "+term.intervallo(lower, higher));

        // TEST metodo convFahrenheit
        System.out.println("La temperatura " + term.getTemperatura() + " in gradi fahrenheit è " + term.convFahrenheit());





    }
}