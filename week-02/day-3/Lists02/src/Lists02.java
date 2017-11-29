import java.util.*;
public class Lists02 {
    public static void main(String[] args) {
        ArrayList<String> far = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk"));
        // Add "a" to every string in the far list.

        for (int i = 0; i < 5; i++){
            String RTFM = far.get(i);
            RTFM = RTFM + "a";
            far.set(i, RTFM);
        }

        /*
        for (int i = 0; i < far.size(); i++){
            far(i) = far(i) + "a";
        } */
        System.out.println(far);
    }
}

