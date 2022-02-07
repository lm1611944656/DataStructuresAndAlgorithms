package LinkedTest;

public class Node {
    public int value;
    public Node next;
    public Node(int value){
        this.value = value;
    }

    public Node reverseList(Node head) {
        // 初始化两个指针
        Node pre = null;
        Node curr = head;

        while (curr != null) {
            // 首先将curr.next的值保存起来
            next = curr.next;


            // 将curr
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;

    }
}
/*
    特判，对于数组长度 nn，如果数组为 nullnull 或者数组长度小于 33，返回 []。
    对数组进行排序。
    遍历排序后数组：
    若 nums[i]>0nums[i]>0：因为已经排序好，所以后面不可能有三个数加和等于 00，直接返回结果。
    对于重复元素：跳过，避免出现重复解
    令左指针 L=i+1L=i+1，右指针 R=n-1R=n−1，当 L<RL<R 时，执行循环：
    当 nums[i]+nums[L]+nums[R]==0nums[i]+nums[L]+nums[R]==0，执行循环，判断左界和右界是否和下一位置重复，去除重复解。并同时将 L,RL,R 移到下一位置，寻找新的解
    若和大于 00，说明 nums[R]nums[R] 太大，RR 左移
    若和小于 00，说明 nums[L]nums[L] 太小，LL 右移
    复杂度分析
    时间复杂度：O\left(n^{2}\right)O(n
    2
     )，数组排序 O(N \log N)O(NlogN)，遍历数组 O\left(n\right)O(n)，双指针遍历 O\left(n\right)O(n)，总体 O(N \log N)+O\left(n\right)*O\left(n\right)O(NlogN)+O(n)∗O(n)，O\left(n^{2}\right)O(n
    2
     )
    空间复杂度：O(1)O(1)
 */
