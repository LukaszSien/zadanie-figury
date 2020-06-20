package zadanie;

public class Square implements Calculate{
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public void pole() {
        double area = a * a;
        System.out.println("Pole kwadratu wynosi: " + area);
    }

    @Override
    public void obwod() {
        double circumference = 4 * a;
        System.out.println("Obwod kwadratu wynosi: " + circumference);
    }
}
