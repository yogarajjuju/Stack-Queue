import java.util.ArrayList;
import java.util.Arrays;

public class StackMain {
    public static void main(String[] args)  throws StackException{
        CustomStack stack= new CustomStack(5);

        stack.push(50);
        stack.push(70);

        stack.push(54);
        stack.push(22);
        stack.push(81);
        stack.push(81);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.pop());




    }
}
