package ArrayToCollection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayToCollection {
    public static void main(String[] args) {
        //数组: int[]
        int[] arrayInt = new int[]{1, 2, 3, 4, 5, 6};
        printElement(arrayInt);

        //原生数组转包装类数组: int[] 2 Integer[]
        Integer[] arrayInter = Arrays.stream(arrayInt).boxed().toArray(Integer[]::new);
        printElement(arrayInter);

        //*包装类数组转List/ArrayList: Integer[] 2 List<Integer>
        List<Integer> listInter = Arrays.asList(arrayInter);
        printElement(listInter);

        //*List/ArrayList转包装类数组: List<Integer> 2 Integer[]
        Integer[] arrayInter2 = listInter.toArray(new Integer[listInter.size()]);
        printElement(arrayInter2);

        //包装类数组转原生数组: Integer[] 2 int[]
        int[] arrayInt2 = Arrays.stream(arrayInter2).mapToInt(Integer::valueOf).toArray();
        printElement(arrayInt2);

        //原生数组转List/ArrayList: int[] 2 List<Integer>
        List<Integer> listInter2 = Arrays.stream(arrayInt2).boxed().collect(Collectors.toList());
        printElement(listInter2);

        //List/ArrayList转原生数组： List<Integer> 2 int[]
        int[] arrayInt3 = listInter2.stream().mapToInt(Integer::valueOf).toArray();
        printElement(arrayInt3);

    }

    //原生数组遍历输出
    private static void printElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //包装类数组遍历输出
    private static void printElement(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //List遍历输出
    private static void printElement(List list) {
        Iterator iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }


    // int[] 2 integer[]
    @Test
    public void test1() {
        int[] tmp = {12, -4, 45, 46, 1};
        Integer[] integers = new Integer[tmp.length];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = tmp[i];
        }
    }

    // Integer[] 2 int[]
    @Test
    public void test2() {
        Integer[] tmp = {12, -4, 45, 46, 1};
        int len = tmp.length;
        int[] newInt = new int[len];
        for (int i = 0; i < tmp.length; i++) {
            newInt[i] = tmp[i];
        }
        intArrayPrint(newInt);

    }

    // Integer[] 2 List<Integer>
    @Test
    public void test3() {
        Integer[] tmp = {12, -4, 45, 46, 1};
        List<Integer> integers = Arrays.asList(tmp);
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\t");

        }
    }

    // List<Integer> 2 String[]
    @Test
    public void test4() {
        List<String> strings = new ArrayList<>();
        strings.add("Google");
        strings.add("Microsoft");
        strings.add("www.vip.com");
        Object[] objects = strings.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.print(objects[i] + "\t");
        }

    }

    public static int[] intArrayPrint(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        for (int data : arr) {
            System.out.print(data + "\t");
        }
        return arr;
    }

}
