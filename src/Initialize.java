import java.util.Collections;
import java.util.Arrays;

public class Initialize {
    public static void array(int size) {
        Integer[] idArray = new Integer[size];
        for (int i = 0; i  < idArray.length; i++) {
            idArray[i] = i;
        }
        Collections.shuffle(Arrays.asList(idArray));
        System.out.println(Arrays.toString(idArray));


    }
}
