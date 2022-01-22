package Array_Queue;

import java.util.Scanner;

public class ArrayQueueLearn {
    public static void main(String[] args) {

        // 实例化队列
        ArrayQueue queue = new ArrayQueue(3);

        // 创建一个菜单选项
        char key = ' ';   // 接受用户输入
        Scanner scanner = new Scanner(System.in);
        boolean isFlag = true;  // 定义一个标志位
        while (isFlag) {
            System.out.println("s(show):显示队列");
            System.out.println("e(exit):退出程序");
            System.out.println("a(add):添加数据到队列");
            System.out.println("g(get):获取队列中的数据");
            System.out.println("h(head):查看队列的头部数据");
            System.out.print("请用户做出选择：");
            key = scanner.next().charAt(0);   // 接受一个字符
            switch (key){
                case 's':
                    queue.showQueue();
                    break;
                case 'a':
                    System.out.print("请输入一个整数：");
                    int value = scanner.nextInt();
                    queue.addQueue(value);
                    break;
                case 'g':
                    // 由于取数据的时候，如果数据为空就会抛出异常，所以现在抛出异常后我们就抓取异常，并且处理
                    try {
                        int result = queue.getQueue();
                        System.out.printf("取出的数据是%d\n",result);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h':
                    try {
                        int headResult = queue.showHead();
                        System.out.printf("队列的头部数据是：%d\n",headResult);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e':
                    // 退出程序时先关闭scanner
                    scanner.close();

                    // 并且要把标志位置位
                    isFlag = false;
                    break;
            }
        }
        System.out.println("程序退出");
    }

}

// 使用数组模拟队列(栈是先入后出，后入先出)
class ArrayQueue {
    private int maxSize;  // 表示数组的最大长度
    private int rear;       // 指向队列的尾部(当输入数据是，该指针向后移)
    private int front;      // 指向队列的头部(当取出数据时，该指针向前移)
    private int[] arr;      // 模拟队列的数组

    // 定义一个构造器
    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;   // 指定队列的容量
        arr = new int[maxSize];   // 也就是数组的容量
        rear = -1;
        front = -1;
    }

    // 判断队列是否是空
    public boolean isNull() {
        return rear == front;
    }

    // 判断队列是否为空
    public boolean isFull() {
        return rear == maxSize - 1;
    }

    // 增加数据到队列中
    public void addQueue(int n) {
        // 首先判断队列是否已近满了
        if (isFull()) {
            System.out.println("队列已近满了，不能在加入了");
        }
        rear++;   // 如果没有满的话，先将rear指针后移一位
        arr[rear] = n;
    }

    // 从队列中取出数据
    public int getQueue() {
        // 判断数据是否为空；
        if (isNull()) {
            // 通过抛出异常来处理
            throw new RuntimeException("数据为空，不能在获取数据了");
        }
        front++;
        return arr[front];

    }

    // 显示一个队列数据
    public void showQueue() {
        //首先也是要判断队列是否为空
        if (isNull()) {
            System.out.println("队列为空了，还要我怎么显示");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            // 按照格式化输出
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }


    }
    // 显示对列的前一个数据
    public int showHead(){
        // 判断
        if(isNull()){
            throw new RuntimeException("数组为空，内部没有数据了");
        }
        return arr[front+1];
    }
}