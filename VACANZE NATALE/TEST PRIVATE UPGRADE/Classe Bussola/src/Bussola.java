public class Bussola {

    // Attributi
    private int gradi;

    // Metodi
    public Bussola(int gradi) {
        this.gradi = gradi;
    }

    public void setGradi(int gradi) {
        this.gradi = gradi;
    }

    public String stampa(){
        String str = "";
        str = "La bussola punta " + this.gradi + " gradi";
        return str;
    }

    public int gradiNord(){
        int gradiToNord = 360 - this.gradi;
        return gradiToNord;
    }

    public boolean gradiValidi(){
        boolean ris = true;
        if(this.gradi > 360){
            ris = false;
        }
        return ris;
    }

    public void aggiungi1grado(){
        this.gradi += 1;
    }

    public void togli1grado(){
        this.gradi -= 1;
    }

    public void aggiungiNgradi(int gradi){
        this.gradi += gradi;
        if(this.gradi > 360){
            this.gradi -= 360;
        }
    }

    public void togliNgradi(int gradi){
        this.gradi -= gradi;
        if(this.gradi < 0){
            this.gradi = 360 + this.gradi;
        }
    }

    public int confronta(int direzione){
        int differenza = 0;
        if(direzione > this.gradi){
            differenza = direzione - this.gradi;
        } else {
            differenza = (360 - this.gradi) + direzione;
        }
        return differenza;
    }


}
