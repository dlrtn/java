import java.util.ArrayDeque;
import java.util.Queue;

public class QueueTest {

    public static class StackWithDoubleQueue {
        private Queue queue1 = new ArrayDeque();
        private Queue queue2 = new ArrayDeque();

        public void push(int value) {
            queue1.add(value);
        }

        public int pop() {
            if (queue1.isEmpty()) {
                throw new IllegalStateException("Stack is empty");
            }
            while (queue1.size() > 1) {
                queue2.add(queue1.remove());
            }
            int value = (int) queue1.remove();
            Queue temp = queue1;
            queue1 = queue2;
            queue2 = temp;
            return value;
        }
    }

    public static void main(String[] args) {
        StackWithDoubleQueue stack = new StackWithDoubleQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

}
