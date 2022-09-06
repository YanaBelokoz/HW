package HW7.Part1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main1 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        List<String> lists = new ArrayList<>();
        String name = in.nextLine();
        while (!Objects.equals(name,"Volume")){
            lists.add(name);
            name = in.nextLine();
        }

        for(String element : lists){
            if (element.startsWith("c")) {
                ;
            }
            }
        for (String element : lists){
            if (element.length()>2);
        }
    }

}
