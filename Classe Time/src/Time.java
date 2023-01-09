public class Time {
    public int ore;
    public int min;
    public int sec;

    public void aggiungi1Sec(){
        this.sec +=1;
        if(sec >= 60){
            this.sec -= 60;
            this.min +=1;
            if (this.min >= 60){
                this.min -= 60;
                this.ore += 1;
            }
        }
    }

    public void aggiungiOrario(int ore, int min, int sec){
        // AGGIUNGI SECONDI
        this.sec += sec;
        if (this.sec>60){
            this.sec -= 60;
            this.min += 1;
        }

        // AGGIUNGI MINUTI
        this.min += min;
        if (this.min>60){
            this.min -= 60;
            this.ore += 1;
        }

        // AGGIUNGI ORE
        this.ore += ore;
        if (this.ore>24){
            this.ore -= 24;
            int giorni = 0;
            giorni += 1;
        }
    }

    public boolean verificaOrario(int ore, int min, int sec){
        boolean valido = true;

        // CHECK
        if (sec>60 || min > 60 || ore > 24){
            valido = false;
        }
        return valido;
    }

    public boolean verifica(){
        boolean valido = true;

        // CHECK
        if (this.sec>60 || this.min > 60 || this.ore > 24){
            valido = false;
        }
        return valido;
    }

    public String stampa(){
        String str;
        str = this.ore+":"+this.min+":"+this.sec;
        return str;
    }

    // UGUALE METODO STAMPA MA SONO PIU STUDIATO
     @Override
    public String toString(){
        String str;
        str = this.ore+":"+this.min+":"+this.sec;
        return str;
     }

    public String mezzanotte(){
        int oreMidnight,minMidnight, secMidnight;
        String str;
        oreMidnight = 24 -this.ore;
        minMidnight = 60- this.min;
        secMidnight = 60- this.sec;
        str = "Mancano "+oreMidnight+":"+minMidnight+":"+secMidnight+" alla mezzanotte";
        return str;

    }
}
