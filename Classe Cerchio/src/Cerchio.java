public class Cerchio {
    public double raggio;
    public static double PI = 3.14159;

    public void saluta(){
        System.out.println("Ciao sono un cerchio");
    }

    public double areaCerchio(){
        double areaC;
        areaC = this.raggio*this.raggio*this.PI;
        return areaC;
    }

    public double areaSpicchio(double angolo){
           double areaSp = (areaCerchio()/360)*angolo;
           return areaSp;
    }

    public double areaCornicione(double angoloFetta, double raggioCondimento){
        double areaCornicioneSpicchio = ((areaCerchio() - (raggioCondimento*raggioCondimento*this.PI))/360)*angoloFetta;
        return areaCornicioneSpicchio;
    }

}
