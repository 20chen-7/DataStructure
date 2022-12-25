package Stacks;

import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
//        ArrayStack stack = new ArrayStack(10);
//        LinkStack stack = new LinkStack();
//        stack.push(new Employee("Jane", "Joe", 123));
//        stack.push(new Employee("John", "Doe", 4567));
//        stack.push(new Employee("Mary", "Smith", 22));
//        stack.push(new Employee("Mike", "Wilson", 3245));
//        stack.push(new Employee("Bill", "End", 78));
//
//        stack.printStack();
//
//        System.out.println("peeked: "+stack.peek());
//
//        System.out.println("popped: "+stack.pop());
//    }

                // should return true
        System.out.println(checkForPalindrome("abccba"));
                // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
                // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
                // should return false
        System.out.println(checkForPalindrome("hello"));
                // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {

        LinkedList<Character> stack = new LinkedList<>();
        StringBuilder strNoPunctuation = new StringBuilder(string.length());
        String lowerCase = string.toLowerCase();

        for (int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                strNoPunctuation.append(c);
                stack.push(c);
            }
        }
        StringBuilder reversedStr = new StringBuilder(stack.size());
        while (!stack.isEmpty()) {
            reversedStr.append(stack.pop());
        }
        return reversedStr.toString().equals(strNoPunctuation.toString());
    }

}
