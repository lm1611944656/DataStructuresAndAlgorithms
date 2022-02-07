package 素数个数统计;
// 统计n以内的素数个数
/*
 * 素数：只能被1和本身整除的个数
 * 0,1除外
 * */

public class SuShu {
    public static void main(String[] args) {
        System.out.println(SuShu.bf(100));
    }

    //暴力法求解
    public static int bf(int n) {
        if (n == 1 || n == 0) {
            return -1;
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            count += isPrim(i) ? 1 : 0;
        }
        return count;
    }
    // 将循环内的数传递到
    private static boolean isPrim(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
