package org.example;

import java.util.Stack;

public class BaseballGame682 {

    public static void main(String[] args) {
        String[] operations ={"5","2","C","D","+"};
        System.out.println(calPoints(operations));
    }

    public static int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for (String operation : operations) {
            switch (operation) {
                case "C": {
                    stack.pop();
                    continue;
                }
                case "D": {
                    stack.push(stack.peek() * 2);
                    continue;
                }
                case "+": {
                    int x = stack.pop();
                    ;
                    int y = stack.peek() + x;
                    stack.push(x);
                    stack.push(y);
                    continue;
                }
                default: {
                    stack.push(Integer.valueOf(operation));
                    continue;
                }

            }

        }
        int record =0;
        while (stack.iterator().hasNext()){
            record =record+stack.pop();
        }
        return record;
    }
}
