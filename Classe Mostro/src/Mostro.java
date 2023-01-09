public class Mostro {
    public String nome;
    public double stazza;
    public String potere;
    public int pvTot;
    public int danno;

    public boolean vivo(){
        int vitaCorrente = pvTot - danno;
        // true: VIVO; false: MORTO
        boolean state = true;
        if(vitaCorrente <= 0){
            state = false;
        }
        return state;
    }

    public void attacco(){

    }

}
