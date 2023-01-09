public class PoligonoRegolare {
    public double lato;
    public int nLati;

    private double apotema(){
        double numeroFisso = 0, apotema;
        switch(this.nLati){
            case 3:
                numeroFisso = 0.289;
            case 4:
                numeroFisso = 0.5;
            case 5:
                numeroFisso = 0.688;
            case 6:
                numeroFisso = 0.866;
            case 7:
                numeroFisso = 1.038;
            case 8:
                numeroFisso = 1.207;
            case 9:
                numeroFisso = 1.374;
            case 10:
                numeroFisso = 1.539;
            case 12:
                numeroFisso = 1.866;
        }
        apotema = numeroFisso*this.lato;
        return apotema;
    }

    public double perimetro(){
        double perimetro = this.lato*this.nLati;
        return perimetro;
    }

    public double area(){
        double area = (perimetro()*apotema())/2;
        return area;
    }
}
