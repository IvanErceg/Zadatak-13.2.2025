package Ucilica;

public class Krug {
      private double radius;
    public Krug(double radius) {
        this.radius=radius;
    }

    public  double povrsinaKrug(){
        return Math.PI * radius * radius;
    }

  public double opsegKrug() {
    return 2 * Math.PI * radius;
}
}