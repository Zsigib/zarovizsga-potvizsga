package hu.nive.ujratervezes.zarovizsga.cleaning;

public class House  implements Cleanable {

    private String address;

    private int area;

    public House(String address, int area) {
        this.address = address;
        this.area = area;
    }

    public int clean() {
        int clean = area *  80;
        return clean;
    }

    @Override
    public String getAddress() {
        return null;
    }
}
