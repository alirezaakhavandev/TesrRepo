import java.util.Stack;

public class StackLIFO {
    //Used for redo & undo and........
    public void start(){
        Stack<String> stack = new Stack<>();
        stack.push("John");
        stack.push("Walter");
        stack.push("Hannibal");
        stack.push("Tyler");
        stack.push("Edward");
        int size = stack.size();
        System.out.println(stack);
        for (int i = 0; i < size; i++) {
            System.out.println(stack.pop() + " is coming back from the school!");
        }
        System.out.println("----------------------------------------------------------------------------------------------");
        Queue<String> queue = new LinkedList<>();
        queue.offer("John");
        queue.offer("Walter");
        queue.offer("Hannibal");
        queue.offer("Tyler");
        queue.offer("Edward");
        int sizeQ = queue.size();
        System.out.println(queue);
        for (int i = 0; i < sizeQ; i++) {
            System.out.println(queue.poll() + " is coming back from the school!");
        }
    }
}
