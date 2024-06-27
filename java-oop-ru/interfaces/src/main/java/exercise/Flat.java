package exercise;

// BEGIN
public class Flat implements Home {
    private double area;
    private double floor;
    private double totalArea;

    public Flat(double area, double balconyArea, double floor) {
        this.area = area;
        this.floor = floor;
        this.totalArea = area + balconyArea;
    }

    @Override
    public double getArea() {
        return totalArea;
    }

    @Override
    public int compareTo(Home another) {
        if (this.getArea() == another.getArea()) {
            return 0;
        } else if (this.getArea() > another.getArea()) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Квартира площадью " + totalArea + " метров на " + floor + " этаже";
    }
}
// END
