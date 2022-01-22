package SparseArray;

/*
    1. 原始的二维数组到稀疏数组的转化
    2.稀疏数组到二维数组的转化
 */
public class SparseArrayLearn {
    public static void main(String[] args) {
        // 0:表示没有棋子；1：表示黑色棋子；2:表示蓝色棋子
        int[][] chessArray = new int[11][11];
        chessArray[1][1] = 1;
        chessArray[2][1] = 2;
        // 生成一个二维数组的形状
        for (int[] row : chessArray) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }
        // 将二维数组转化为稀疏数组（遍历二维数组中非零元素）
        int count = 0;   // 定义一个变量，记录二维数组中非零元素的个数
        for (int i = 0; i < chessArray.length; i++) {
            for (int j = 0; j < chessArray[i].length; j++) {
                if (chessArray[i][j] != 0) {
                    count++;
                }
            }
        }
        System.out.println("非零元素的个数为：" + count);
        // 创建稀疏数组
        int[][] sparseArr = new int[count + 1][3];
        // 给稀疏数组赋值
        for (int i = 0; i < chessArray.length; i++) {
            for (int j = 0; j < chessArray[i].length; j++) {
                sparseArr[0][0] = chessArray.length;
                sparseArr[0][1] = chessArray[i].length;
                sparseArr[0][3] = count;
            }
        }

//        for(int i = 0;i){}

    }
}
