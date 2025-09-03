package JAVA;
import java.util.Arrays;
import java.util.Collections;


public class Sort_Descending {
    public static void main(String[] arags){
        Integer[] A={5,3,2,4,1};
        Arrays.sort(A,Collections.reverseOrder());
        System.out.println(Arrays.toString(A));
    }
}
