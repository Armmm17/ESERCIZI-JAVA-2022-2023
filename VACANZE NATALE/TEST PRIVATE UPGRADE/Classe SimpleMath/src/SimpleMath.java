public class SimpleMath {

    // Attributi
    private int num;

    // Metodi

    public SimpleMath(int num){
        this.num = num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public String stampa(){
        String str = "";
        str ="Il numero memorizzato è: " + this.num;
        return str;
    }

    public void somma1(){
        this.num += 1;
    }

    public int somma(int num2){
        int somma = this.num + num2;
        return somma;
    }

    public boolean maggiore(int numToCheck){
        boolean risultato = false;
        if (numToCheck > this.num){
            risultato = true;
        }
        return risultato;
    }

}
