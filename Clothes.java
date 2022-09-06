package HW7.Part3;

import java.util.*;

public class Clothes {
    private static Object clothes;
    public String brand;

    public Clothes(String name, String size, String brand) {

    }

    public static void main(String[] args) {

        int Object; clothes  = new clothes;
        int Clothes;
        Set<HW7.Part3.Clothes> set = new HashSet<>(Clothes);
        Clothes clothes1 = new Clothes("jaket", "xs", "Adidas");
        Clothes clothes2 = new Clothes("jaket", "xs", "Colins");
        Clothes clothes3 = new Clothes("pants", "42", "Colins");
        Clothes clothes4 = new Clothes("pants", "44", "Adidas");
        Clothes clothes5 = new Clothes("pants", "44", "Waikiki");
        Clothes clothes6 = new Clothes("skirt", "38", "Waikiki");
        Clothes clothes7 = new Clothes("hat", "22", "Channel");
        Clothes clothes8 = new Clothes("shirt", "l", "Colins");
        Clothes clothes9 = new Clothes("coat", "52", "Channel");
        Clothes clothes10 = new Clothes("t-shirt", "m", "Zara");
        Clothes clothes11 = new Clothes("t-shirt", "xl", "Nike");
        Clothes clothes12 = new Clothes("t-shirt", "xxl", "Puma");
        Clothes clothes13 = new Clothes("coat", "2xl", "Adidas");
        Clothes clothes14 = new Clothes("shirt", "36", "Waikiki");
        Clothes clothes15 = new Clothes("coat", "s", "Zara");
        Clothes clothes16 = new Clothes("hat", "24", "gucci");
        Clothes clothes17 = new Clothes("jaket", "m", "gucci");
        Clothes clothes18 = new Clothes("skirt", "36", "Colins");
        Clothes clothes19 = new Clothes("coat", "3xl", "Zara");
        Clothes clothes20 = new Clothes("pants", "40", "Puma");
        set.add(clothes1);
        set.add(clothes2);
        set.add(clothes3);
        set.add(clothes4);
        set.add(clothes5);
        set.add(clothes6);
        set.add(clothes7);
        set.add(clothes8);
        set.add(clothes9);
        set.add(clothes10);
        set.add(clothes11);
        set.add(clothes12);
        set.add(clothes13);
        set.add(clothes14);
        set.add(clothes15);
        set.add(clothes16);
        set.add(clothes17);
        set.add(clothes18);
        set.add(clothes19);
        set.add(clothes20);

        List<Clothes> listClothes = new ArrayList<Clothes>(set);

        Set<Clothes> clothesTreeset = new TreeSet<>();
        clothesTreeset.add(clothes1);
        clothesTreeset.add(clothes2);
        clothesTreeset.add(clothes3);
        clothesTreeset.add(clothes4);
        clothesTreeset.add(clothes5);
        clothesTreeset.add(clothes6);
        clothesTreeset.add(clothes7);
        clothesTreeset.add(clothes8);
        clothesTreeset.add(clothes9);
        clothesTreeset.add(clothes10);
        clothesTreeset.add(clothes11);
        clothesTreeset.add(clothes12);
        clothesTreeset.add(clothes13);
        clothesTreeset.add(clothes14);
        clothesTreeset.add(clothes15);
        clothesTreeset.add(clothes16);
        clothesTreeset.add(clothes17);
        clothesTreeset.add(clothes18);
        clothesTreeset.add(clothes19);
        clothesTreeset.add(clothes20);
    }

    private static class clothes {
    }
}
