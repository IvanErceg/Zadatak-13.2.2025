package Ucilica;

public class Pravokutnik {
    private double length;
    private double width;

    public Pravokutnik(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double povrsinaPravokutnik() {
        return length * width;
    }
    public double opsegPravokutnik() {
        return 2 * (length + width);
    }
}