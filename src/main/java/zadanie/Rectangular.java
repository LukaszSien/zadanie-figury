package zadanie;

public class Rectangular extends Square implements Calculate {

    private double b;

    public Rectangular(double a, double b) {
        super(a);
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public void pole() {
        double area = getA() * b;
        System.out.println("Pole prostokata wynosi: " + area);
    }

    @Override
    public void obwod() {
        double circumference = 2 * getA() + 2 * b;
        System.out.println("Obwod prostokata wynosi: " + circumference);
    }
}
