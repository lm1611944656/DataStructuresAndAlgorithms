package SpareArrays;

public class SparseArraysLearn {
    public static void main(String[] args) {
        // 创建一个二维数组
        int[][] myArrays = new int[11][11];

        // 二维数组赋值(1表示黑棋，2表示白棋)
        myArrays[2][3] = 1;
        myArrays[3][4] = 2;

        // 输出显示二维数组(记录二维数组中不为零的个数)
        int sum = 0;
        for (int i = 0; i < myArrays.length; i++) {
            for (int j = 0; j < myArrays[i].length; j++) {
                if (myArrays[i][j] != 0) {
                    sum++;
                }
                System.out.print(myArrays[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("二维数组中不为零的个数为：" + sum);

        // 定义一个稀疏数组
        int[][] sparseArray = new int[sum + 1][3];   // 不为零的个数都需创建一行数据并且加上二维数据的统计

        // 给稀疏数组赋值(二维数组共有11行 11列，共有sum个有效数字)
        sparseArray[0][0] = 11;
        sparseArray[0][1] = 11;
        sparseArray[0][2] = sum;

        // 遍历二维数组，将非零的数据传递给稀疏数组
        int count = 0;
        for (int i = 0; i < myArrays.length; i++) {
            for (int j = 0; j < myArrays[i].length; j++) {
                if (myArrays[i][j] != 0) {
                    count++;
                    sparseArray[count][0] = i;  // 二维数组中，不为零的数据所在二维数组中行位置
                    sparseArray[count][1] = j;
                    sparseArray[count][2] = myArrays[i][j];
                }
            }
        }

        // 显示二维数组
        for (int i = 0; i < sparseArray.length; i++) {
            for (int j = 0; j < sparseArray[i].length; j++) {
                System.out.print(sparseArray[i][j] + "\t");
            }
            System.out.println();
        }

        // 将稀疏数组转化为二维数组
        int[][] newArray = new int[sparseArray[0][0]][sparseArray[0][1]];
        for (int i = 1; i < sparseArray.length; i++) {
            newArray[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
        }

        // 显示稀疏数组转化为二维数组后数组
        System.out.println("稀疏数组到二维数组：");
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                System.out.print(newArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
