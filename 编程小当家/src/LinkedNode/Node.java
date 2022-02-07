package LinkedNode;
// 将链表反转
public class Node {
    public int value;
    public Node next;

    public Node(int data) {
        this.value = data;
    }

    public Node reserveList(Node head) {
        Node pre = null;
        Node next = null;
        while (head != null) {
            next = head.next;   // 链表的的下一个数保存起来
            head.next = pre;    // 将链表的下一个指向指针掉头
            pre = head;
            head = next;
        }
        return pre;
    }
}
