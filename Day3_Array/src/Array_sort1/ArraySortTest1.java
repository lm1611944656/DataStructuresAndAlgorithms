package Array_sort1;

import java.util.Arrays;

public class ArraySortTest1 {


    public static void main(String[] args) {
        int[] tmp = new int[]{98, 45, 3, -78};
        ArraySortTest1.sort1(tmp);

        ArraySortTest1.test2(tmp);


    }
    // 冒泡排序
    public static void sort1(int[] arr) {
        if (arr.length == 0) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {//外层循环控制排序趟数
            for (int j = 0; j < arr.length - i - 1; j++) {//内层循环控制每一趟排序多少次
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("冒泡排序的结果是：");
        for (int i : arr) {
            System.out.print(i + "\t");
        }

    }

    public static void test2(int[] arr1) {
        if(arr1.length == 0){
            return;
        }
        //直接将调用方法进行排序
        Arrays.sort(arr1);
        System.out.println("调用Arrays方法排序的结果是：");
        for(int i :arr1){
            System.out.print(i + "\t");
        }
        System.out.println();
        // 查找指定位置上的数
        int index = Arrays.binarySearch(arr1, 3);
        System.out.println("key = 3 的位置是："+index);
    }

}
