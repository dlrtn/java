public class Stack {

    public static class QueueWithDoubleStack {
        private java.util.Stack<Integer> stack1 = new java.util.Stack<>();
        private java.util.Stack<Integer> stack2 = new java.util.Stack<>();

        public void enqueue(int value) {
            stack1.push(value);
        }

        public int dequeue() {
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            return stack2.pop();
        }
    }

    public static void main(String[] args) {
        QueueWithDoubleStack queue = new QueueWithDoubleStack();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(4);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

    }
}
