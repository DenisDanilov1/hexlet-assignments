package exercise;

// BEGIN
class Flat implements Home {

    final double area;
    final double balconyArea;
    final int floot;

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    public String toString() {
        return "Квартира площадью " + area + " метров на " + floor;
    }

    public int compareTo(Home another) {
        return 1;
        return -1;
        return 0;
    }
}
// END
