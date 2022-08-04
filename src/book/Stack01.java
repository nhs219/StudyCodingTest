package book;

import java.util.Stack;

public class Stack01 {
    public static void main(String[] args) {
        String str = "abcde";
        char[] charStr = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        
        for(char c : charStr) {
            stack.push(c);
        }

        int count = stack.size();

        for(int i=0; i<count; i++) {
            System.out.print(stack.pop());
        }
    }
}
