package exercise;

// BEGIN
class Cottage implements Home {

    private double area;
    private int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    public String toString() {
        return "Коттедж площадью " + area + " метров, в " + floorCount + " этажей";
    }
    public int compareTo(Home another) {
        return 1;
        return -1;
        return 0;
    }
}
// END
