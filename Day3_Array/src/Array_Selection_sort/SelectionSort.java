package Array_Selection_sort;

public class SelectionSort {
    public static void main(String[] args){
        int[] myArray = {12,45,35,-78,1,46,3,-7};
        selectionSort(myArray);
    }
    // 选着排序算法
    public static void selectionSort(int[] list) {
        if(list == null|| list.length<2){
            return;
        }

//        for (int i = 0; i < arr.length - 1; i++) {
//            int min = i;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[min] > arr[j]) {
//                    min = j;
//                    int tmp = arr[min];
//                    arr[min] = arr[i];
//                    arr[i] = tmp;
//                }
//            }
//        }
        // list[N] 为存储待排序序列的数组

            int length = list.length;
            int i, j;
            // 从第 1 个元素开始遍历，直至倒数第 2 个元素
            for (i = 0; i < length - 1; i++) {
                int min = i; // 事先假设最小值为第 i 个元素
                // 从第 i+1 个元素开始遍历，查找真正的最小值
                for (j = i + 1; j < length; j++) {
                    if (list[j] < list[min]) {
                        min = j;
                    }
                }
                // 如果最小值所在位置不为 i，交换最小值和第 i 个元素的位置
                if (min != j) {
                    int temp = list[min];
                    list[min] = list[i];
                    list[i] = temp;
                }
            }

        for(int data:list){
            System.out.print(data + "\t");
        }
    }
}
