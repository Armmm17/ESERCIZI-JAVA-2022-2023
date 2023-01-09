import java.lang.Math;
public class TriangoloIsoscele {
    public double base;
    public double altezza;

    public double area(){
        double area;
        area = (this.base*this.altezza)/2;
        return area;
    }

    public double perimetro(){
        double perimetro, metaBase, ipotenusa;
        metaBase = this.base/2;
        ipotenusa = Math.sqrt(Math.pow(metaBase,2)+Math.pow(this.altezza,2));
        perimetro = this.base+(ipotenusa*2);
        return perimetro;
    }
}
