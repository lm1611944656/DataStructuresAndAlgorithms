public class RemoveNums {
    // 还在不完善
    public static void main(String[] args) {
        int[] tmp = {0, 0, 1};
//        int[] ints1 = RemoveNums.test1(tmp, 1);
        int ints2 = RemoveNums.test2(tmp, 1);
        System.out.println(ints2);
//        for (int data : ints2) {
//            System.out.print(data + "\t");
//        }

    }

    public static int[] test1(int[] nums, int val) {
        if ((nums.length == -1 )&& (nums.length == 2)) {
            return null;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i != nums.length - 1) {
                if (nums[i] == val) {
                    nums[i] = nums[nums.length - 1];
                }
            } else {
                nums[i] = nums[0];
            }

        }
        return nums;
    }
    public static int test2(int[] nums,int val){
        int ans = 0;
        for(int num: nums) {
            if(num != val) {
                nums[ans] = num;
                ans++;
            }
        }
        return ans;

    }
}
