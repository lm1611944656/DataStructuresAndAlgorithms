package ArrayReverse1;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayReverse {

    public static void main(String[] args) {
        int[] tmp = {12, -4, 45, 46, 1};
        int[] test = test(tmp);
        System.out.print("反转后的数组：");
        for (int i : test) {
            System.out.print(i + "\t");
        }
    }

    public static int[] test(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        int[] arrNew = new int[arr.length];
        int count = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[count--];
        }
        return arrNew;
    }

    // 利用Collections.reverse();
    @Test
    public void test() {
        int[] tmp = {12, -4, 45, 46, 1};
        //  将基本数据类型转化为包装类
        int len = tmp.length;
        Integer[] integer = new Integer[len];
        for (int i = 0; i < integer.length; i++) {
            integer[i] = tmp[i];
        }
        // 将包装类
        List<Integer> integers = Arrays.asList(integer);
        Collections.reverse(integers);
        System.out.println("反转后的数组元素为：");
        for(Integer i:integer){
            System.out.printf("%d\t", i);

        }
    }
    public void test3(){

    }
}
