package lesson8.stack;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;

public class SpecialStack {
    //TODO:
    // Реализовать структуру данных SpecialStack, которая поддерживает все операции со стеком,
    // такие как push(), pop(), isEmpty(), … и дополнительную операцию getMin(),
    // которая должна возвращать минимальный элемент из SpecialStack.
    // *** Все эти операции SpecialStack должны быть O(1). Пространство O(n) ***

    private final Stack<Integer> stack = new Stack<>();
    int min = Integer.MAX_VALUE;

    public void push(int e) {
        min = Math.min(min, e);
        stack.push(e);
    }

    public int pop() {
        int value = stack.pop();
        min = stack.stream().min(Comparator.naturalOrder()).orElse(Integer.MAX_VALUE);

        return value;
    }

    public int peek() {
        return stack.peek();
    }

    public boolean empty() {
        return stack.empty();
    }

    public int size() {
        return stack.size();
    }

    public void print() {
        System.out.println(stack);
    }

    public int getMin() {
        if (empty()) {
            return -1;
        }
        return min;
    }

}
