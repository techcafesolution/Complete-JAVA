package example.java.advance.Collection;

import java.util.LinkedList;
import java.util.Queue;

public class DemoQueue {
    public static void main(String[] args) {
        Queue<Integer> que=new LinkedList<>();
        que.add(1);
        que.add(2);
        que.add(3);
        Utility.print(que);
        System.out.println(que.peek());
        System.out.println(que.element());
        System.out.println(que.remove());
        System.out.println(que.poll());
        System.out.println(que.poll());
        System.out.println(que.poll());
        System.out.println(que.remove());
    }
}
