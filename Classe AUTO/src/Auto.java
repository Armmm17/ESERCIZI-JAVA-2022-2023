import java.util.Random;

public class Auto {
    public String produttore;
    public String modello;
    public String targa;
    public String tipoVeicolo;
    public double chilometraggioTot;
    public int cilindrata;
    public double potenzaCV;
    public String alimentazione;
    public double capacitaSerbatoio;
    public String firstCarReg;
    public String lastCarReg;

    public void stampa(){
        System.out.println("Produttore: " + this.produttore);
        System.out.println("Modello: " + this.modello);
        System.out.println("Tipo veicolo: " + this.tipoVeicolo);
        System.out.println("Tipo alimentazione: " + this.alimentazione);
        System.out.println("Targa: " + this.targa);
        System.out.println("Chilometraggio: " + this.chilometraggioTot);
        System.out.println("Cilindrata: " + this.cilindrata);
        System.out.println("Cavalli: " + this.potenzaCV);
        System.out.println("Capacità serbatoio (litri): " + this.capacitaSerbatoio);
        System.out.println("Data prima immatricolazione: " + this.firstCarReg);
        System.out.println("Data ultima immatricolazione: " + this.lastCarReg);
    }
    public String genTarga(){
        Random random = new Random();
        String first2Char = "";
        String middle3Char = "";
        String last2Char = "";
        String[] lettere = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String [] numeri = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        // Genera due lettere (first)
        int lenLettere = lettere.length;
        int lenNumeri = numeri.length;
        for(int i = 0; i < 2; i++){
            int nRandom = random.nextInt(lenLettere);
            for(int y = 0; y < lenLettere; y++){
                if (y == nRandom){
                    first2Char += lettere[y];
                }
            }
        }

        for(int i = 0; i < 3; i++){
            int nRandom = random.nextInt(lenNumeri);
            for(int y = 0; y < lenNumeri; y++){
                if (y == nRandom){
                    middle3Char += numeri[y];
                }
            }
        }

        // Genera due lettere (last)
        for(int i = 0; i < 2; i++){
            int nRandom = random.nextInt(lenLettere);
            for(int y = 0; y < lenLettere; y++){
                if (y == nRandom){
                    last2Char += lettere[y];
                }
            }
        }

        targa = first2Char + middle3Char + last2Char;
        return targa;
    }

    public String formattaData(int giorno, int mese, int anno){
        String data = giorno +"/"+ mese + "/" + anno;
        return data;
    }
}
