public class Quadrato {
    public double lato;

    public double area(){
        double area = Math.pow(this.lato, 2);
        return area;
    }

    public double perimetro(){
        double perimetro = this.lato*4;
        return perimetro;
    }
}
