package ArrayMinMax;

import java.util.*;

public class ArrayMinMaxTest {
    public static void main(String[] args){
        int[] tmp = {45,12,-78,16,1,34};
        test1(tmp);
    }

    // 取数组中最大最小值
    public static void test1(int[] arr) {
        if (arr == null) {
            return;
        }
        Integer[] integers = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            integers[i] = arr[i];
        }

        List<Integer> integers1 = Arrays.asList(integers);
        ArrayList<Integer> integers2 = new ArrayList<>(integers1);
        System.out.println(Collections.min(integers2));
        System.out.println(Collections.max(integers2));

    }
}
