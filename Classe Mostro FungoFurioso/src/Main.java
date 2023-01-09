public class Main {
    public static void main(String[] args) {
        int hpFungo = 100;
        String abilityFungo = "Sporrata";
        int abilityVlFungo = 15;
        int damageFungo = 35;
        int protectionFungo = 100;
        FungoFurioso fungo = new FungoFurioso(hpFungo, abilityFungo, abilityVlFungo, damageFungo, protectionFungo);

        // TEST metodo stampa()
        System.out.println(fungo.stampa());

        // TEST isDead() ris: true
        System.out.println("Stato vita fungo: "+fungo.isDead());


        // TEST isDead() ris: false
        fungo.setHealthPoints(0);
        System.out.println("Stato vita fungo: "+fungo.isDead());

        // TEST attack()
        System.out.println("Danno inflitto: "+fungo.attack());

        // TEST
        int damageTk = 20;
        fungo.takeDamage(damageTk);
        System.out.println(fungo.stampa());

    }
}