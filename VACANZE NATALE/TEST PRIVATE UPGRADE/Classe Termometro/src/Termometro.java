public class Termometro {
    // Attributi
    private double temperatura;

    // Metodi


    public Termometro(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String stampa(){
        String str = "La temperatura è di " + this.temperatura;
        return str;
    }

    public void aumenta1grado(){
        this.temperatura += 1;
    }

    public void togli1grado(){
        this.temperatura -= 1;
    }

    public boolean febbre(){
        boolean ris = false;
        if(this.temperatura > 37){
            ris = true;
        }
        return ris;
    }

    public double confronta(double temp2){
        double differenza;
        if(this.temperatura > temp2){
            differenza = this.temperatura - temp2;
        } else {
            differenza = temp2 - this.temperatura;
        }
        return differenza;
    }

    public boolean intervallo(double lowerTempRange, double higherTempRange){
        boolean ris = false;
        if((this.temperatura > lowerTempRange) && (this.temperatura < higherTempRange)){
            ris = true;
        }
        return ris;
    }

    public double convFahrenheit(){
        double tempFahr = (this.temperatura *1.8) + 32;
        return tempFahr;
    }



}
