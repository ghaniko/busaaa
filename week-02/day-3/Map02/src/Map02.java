import java.util.*;
public class Map02 {
    public static void main(String[] args) {
        ArrayList<Map<String, Object>> map = new ArrayList<Map<String, Object>>();

        // Given this list of hashmaps...

        Map<String, Object> row0 = new HashMap<String, Object>();
        row0.put("name", "Rezso");
        row0.put("age", 9);
        row0.put("candies", 2);
        map.add( row0 );

        Map<String, Object> row1 = new HashMap<String, Object>();
        row1.put("name", "Gerzson");
        row1.put("age", 10);
        row1.put("candies", 1);
        map.add( row1 );

        Map<String, Object> row2 = new HashMap<String, Object>();
        row2.put("name", "Aurel");
        row2.put("age", 7);
        row2.put("candies", 3);
        map.add( row2 );

        Map<String, Object> row3 = new HashMap<String, Object>();
        row3.put("name", "Zsombor");
        row3.put("age", 12);
        row3.put("candies", 5);
        map.add( row3 );

        Map<String, Object> row4 = new HashMap<String, Object>();
        row4.put("name", "Olaf");
        row4.put("age", 12);
        row4.put("candies", 7);
        map.add( row4 );

        Map<String, Object> row5 = new HashMap<String, Object>();
        row5.put("name", "Teodor");
        row5.put("age", 3);
        row5.put("candies", 2);
        map.add( row5 );

        /* Map<String, Object> subMap1 = new HashMap<String, Object>();
        subMap1 = map.get(0);
        System.out.println(subMap1.get("candies"));

        Map<String, Object> subMap2 = new HashMap<String, Object>();
        subMap2 = map.get(1);
        System.out.println(subMap2.get("candies"));

        Map<String, Object> subMap3 = new HashMap<String, Object>();
        subMap3 = map.get(2);
        System.out.println(subMap3.get("candies"));

        Map<String, Object> subMap4 = new HashMap<String, Object>();
        subMap4 = map.get(3);
        System.out.println(subMap4.get("candies"));

        Map<String, Object> subMap5 = new HashMap<String, Object>();
        subMap5 = map.get(4);
        System.out.println(subMap5.get("candies"));

        Map<String, Object> subMap6 = new HashMap<String, Object>();
        subMap6 = map.get(5);
        System.out.println(subMap6.get("candies")); */

        for (int i = 0; i < 6; i++) {
            if ((int) map.get(i).get("candies") > 4) {
                System.out.println(map.get(i).get("name"));
            }
        }
        int sum = 0;
        for (int j = 0; j < 6; j++) {
            if((int)map.get(j).get("candies") < 5) {
                sum = sum + (int)map.get(j).get("age");
            }
        }
        System.out.println(sum);



        //map.toString();
        //System.out.println(map);
        // Display the following things:
        //  - Who has got more candies than 4 candies
        //  - Sum the age of people who have less than 5 candies
    }
}
