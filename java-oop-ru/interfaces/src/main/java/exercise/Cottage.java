package exercise;

// BEGIN
public class Cottage implements Home {

    private int area;
    private int floorCount;

    public Cottage(int area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    @Override
    public int getArea() {
        return area;
    }

    @Override
    public int compareTo(Home another) {
        return Double.compare(this.getArea(), another.getArea());
    }

    @Override
    public String toString() {
        return floorCount + " этажный коттедж площадью " + area + " метров";
    }
}
// END
