package lesson8.stack;

import java.util.Arrays;
import java.util.Collections;

public class Runner {
    public static void main(String[] args) {
        SpecialStack stack = new SpecialStack();

        stack.push(10);
        stack.push(5);
        stack.push(7);
        stack.push(6);
        stack.push(1);
        stack.push(4);
        stack.push(4);

        stack.print();

        System.out.println(stack.getMin());
        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println(stack.getMin());
    }
}
