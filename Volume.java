package Part2;

public class Volume {
    private static final Object coca = null;
    static final Object cola = null;

    private static final Object getfanta = null;
    static final Object getFanta = null;

    static final Object sprite = null;
    static final Object getSprite = null;
    public Volume (Object brand) {
    }

    public static Object getCoca() {
        return coca;
    }

    public static Object getCola() {
        return cola;
    }

    int brand;
    String volume;

    public <brand, volume> Volume (brand sprite, volume volume) {
    }

    public int getBrand() {
        return brand;
    }

    public void setBrand(int brand) {
        this.brand = brand;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public Volume (int brand, String volume) {
        this.brand = brand;
        this.volume = volume;
    }
}




}
