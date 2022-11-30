package lesson8.stack;

import java.util.Stack;

public class SpecialStack {
    //TODO:
    // Реализовать структуру данных SpecialStack, которая поддерживает все операции со стеком,
    // такие как push(), pop(), isEmpty(), … и дополнительную операцию getMin(),
    // которая должна возвращать минимальный элемент из SpecialStack.
    // *** Все эти операции SpecialStack должны быть O(1). Пространство O(n) ***

    private final Stack<Integer> stack = new Stack<>();

    public void push(int e) {
        stack.push(e);
    }

    public int pop() {

    }

    public int peek() {

    }

    public boolean empty() {

    }

    public int size() {

    }

    public int getMin() {

    }

}
