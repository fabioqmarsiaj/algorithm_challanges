package leetcode;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        isValid("[()]");
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            // ! The stack.pop removes the last inserted character and compares with the current 'c'
            // ! stack.pop = ')' != '}' is TRUE, therefore returns false
            // * stack.pop = ')' != ')' is FALSE, therefore it does not return until stack.isEmpty()
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}
