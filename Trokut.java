package Ucilica;

public class Trokut {
    private double a;
    private double b;
    private double c;

    public Trokut(double a,double b, double c) {
        this.a = a;
        this.b= b;
        this.c = c;
    }

    public  double izracunajPovrsinu() {
        double s = (a + b + c) / 2;

        // Calculate the area using Heron's formula
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    public double opseg() {
        return a + b + c;
    }
}
