package zadanie;

public class Rectangular implements Calculate {
    private double a;
    private double b;

    public Rectangular(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public void pole() {
        double area = a * b;
        System.out.println("Pole prostokata wynosi: " + area);
    }

    @Override
    public void obwod() {
        double circumference = 2 * a + 2 * b;
        System.out.println("Obwod prostokata wynosi: " + circumference);
    }
}
