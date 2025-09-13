import java.util.Stack;
// Stack

public class Example {
    public static void main(String[] args) {
        Stack<Integer> stack =new Stack<>();
        stack.push(12);
        stack.push(66);
        stack.push(13);
        stack.push(80);
        stack.push(22);
        stack.push(21);
        System.out.println(stack.size());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.size());









    }
}
