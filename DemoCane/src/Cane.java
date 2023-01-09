public class Cane {

    public String nome;
    public String razza;
    public int anni;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRazza(String razza) {
        this.razza = razza;
    }

    public void setAnni(int anni) {
        this.anni = anni;
    }


    public void scriviOutput(){
        System.out.println("Nome: " + nome);
        System.out.println("Razza: " + razza);
        System.out.println("Anni: " + anni);
    }

    public int getEtaInAnniUmani(){
        int etaUmana = 0;
        if(anni <= 2){
            etaUmana = anni * 11;
        } else {
            etaUmana = 22 + ((anni - 2) * 5);
        }
        return etaUmana;
    }

    /*
    @Override
    public String toString(){
        return "Nome: " + nome + "\n Razza: " + razza + "\n Anni: "+ anni;
    }

     */
}
