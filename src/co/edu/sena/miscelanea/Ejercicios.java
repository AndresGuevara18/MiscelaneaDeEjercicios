package co.edu.sena.miscelanea;

public class Ejercicios {

    public double CalculateAreaTriangle(double n1, double n2){
        return (n1*n2/2);
    }

    public double AddTwoNumbers(double n1,double n2){
        return (n1+n2);
    }

    public double SquareNumber(double n1){
        return (Math.pow(n1, 2));
    }

    public double EurosToDollars(double n1){
        double dolarUni = 1.06;
        return (n1*dolarUni);
    }

    public double SquareArea(double n1){
        return (n1*n1);
    }

    public double SquarePerimeter(double n1){
        return (n1*4);
    }

    public  double CylinderArea(double n1, double n2){
        return (2 * Math.PI * n1 * (n1 + n2));
    }

    public  double CylinderVolume(double n1, double n2){
        return (Math.PI * (n1 * n1) * n2);
    }

    public  double CircleLength(double n1){
        return (2 * Math.PI * n1);
    }

    public double AreaCircle(double n1){
        return (Math.PI * (n1 * n1));
    }

    public  double CalculateAverage(double n1, double n2, double n3){
        return ((n1 + n2 + n3) / 3);
    }

}
