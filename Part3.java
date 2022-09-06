package HW7.Part3;
import java.util.*;

public class Part3 {
    public static Collection<? extends HW7.Part3.Clothes> Clothes;

    public static class Clothes implements Comparable<HW7.Part3.Clothes> {
        private final int name;
        private final String size;
        private final String brand;

        public Clothes(int name, String size, String brand) {
            this.name = name;
            this.size = size;
            this.brand = brand;
        }
        @Override
        public String toString() {
            return "Clothes{" +
                    "name=" + name +
                    ", size='" + size + '\'' +
                    ", brand='" + brand + '\'' +
                    '}';
        }
        @Override
        public int compareTo(HW7.Part3.Clothes clothes) {
            return this.size.compareTo(clothes.size);
        }
        @Override
        public int compareTo(HW7.Part3.Clothes clothes) {
            return this.brand.compareTo(clothes.brand);
        }
}
