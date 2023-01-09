public class Main {
    public static void main(String[] args) {
        int numero = 17;
        SimpleMath sp1 = new SimpleMath(numero);

        // TEST metodo stampa
        System.out.println(sp1.stampa());

        // TEST metodo somma1
        sp1.somma1();
        System.out.println(sp1.stampa());

        // TEST metodo somma
        int numToAdd = 34;
        System.out.println("La somma tra " + sp1.getNum() + " e " + numToAdd + " è " + sp1.somma(numToAdd));

        // TEST metodo maggiore  (risultato false)
        int numCheck = 16;
        System.out.println("il numero è maggiore? "+ sp1.maggiore(numCheck));

        // TEST metodo maggiore  (risultato false)
        numCheck = 24;
        System.out.println("il numero è maggiore? "+ sp1.maggiore(numCheck));

    }
}