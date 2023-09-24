package Pilha;
import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();
        
        System.out.println(stack.isEmpty());
        stack.push(1);
        stack.push(2);
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        System.out.println(stack);
        stack.pop();
        System.out.println(stack.size());
        System.out.println(stack);

    }

} 