import java.util.*;
public class Lists03 {
    public static void main(String[] args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));
        ArrayList<String> order = new ArrayList<String>();

        // Join the two lists by matching one girl with one boy in the order list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        for (int i = 0; i < girls.size(); i++){
            order.add(girls.get(i));
            order.add(boys.get(i));
        }
        order.add("[poor Jeff is a geek, no girl for him]");

        /* System.out.println(order);for (int i = 0; i < girls.size(); i++){
            String forGirls = girls.get(i);
            String forBoys = boys.get(i);
            order.add(forGirls);
            order.add(forBoys);
        }
        order.add("Jeff"); */

        System.out.println(order);
    }
}
