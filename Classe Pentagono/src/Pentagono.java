public class Pentagono {
    private int latoPentagono;
    private double PHI = 1.72;
    private double NUMERO_FISSO_PENTAGONO = 0.688;

    public void setLatoPentagono(int latoPentagono) {
        this.latoPentagono = latoPentagono;
    }

    public int calcolaPerimetro(int latoPentagono){
        int perimetro = 5*latoPentagono;
        return perimetro;
    }

    public double calcolaArea(int latoPentagono){
        double area = latoPentagono*latoPentagono*PHI;
        return area;
    }

    private double calcolaApotema (int latoPentagono) {
        double apotema = latoPentagono * NUMERO_FISSO_PENTAGONO;
        return apotema;
    }

    public double calcolaAreaApotema(int latoPentagono){
        double area = (calcolaPerimetro(latoPentagono)*calcolaApotema(latoPentagono))/2
    }
}
