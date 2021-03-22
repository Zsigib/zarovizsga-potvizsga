package hu.nive.ujratervezes.zarovizsga.cleaning;

public class Office implements Cleanable{

    private String address;

    private int area;

    private int floor;

    public Office(String address, int area, int floor) {
        this.address = address;
        this.area = area;
        this.floor = floor;
    }

    public int clean() {
        int clean = area * floor * 100;
        return clean;
    }

    @Override
    public String getAddress() {
        return null;
    }

}
}
