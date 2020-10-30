package FormeGeometriche;

public class FormaGeometrica {

    double x, y;

    public FormaGeometrica(double x, double y){
        this.x=x;
        this.y=y;
    }

    public double getArea(){
        return (x*y);
    }

    public double getPerimeter(){
        return (x+y)*2;
    }

    public String toString(){
        return "";
    }
}
