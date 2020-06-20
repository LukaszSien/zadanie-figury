package zadanie;

public class Circle implements Calculate{
    private double diameter;

    public Circle(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public void pole() {
        double area = PI * (diameter/2);
        System.out.println("Pole okregu wynosi: " + area);
    }

    @Override
    public void obwod() {
        double circumference = 2 * PI * (diameter/2);
        System.out.println("Obwod okregu wynosi: " + circumference);
    }
}
