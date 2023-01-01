package Queues;


import java.util.LinkedList;

public class Main {

    public static void main(String[] args){
//        Employee janeJones = new Employee("Jane", "Jones", 123);
//        Employee johnDoe = new Employee("John", "Doe", 4567);
//        Employee marySmith = new Employee("Mary", "Smith", 22);
//        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
//        Employee billEnd = new Employee("Bill", "End", 78);
//
//        ArrayQueue queue = new ArrayQueue(5);
//        queue.add(janeJones);
//        queue.add(johnDoe);
////        queue.remove();
//        queue.add(marySmith);
////        queue.remove();
//        queue.add(mikeWilson);
//        queue.add(billEnd);
//        queue.remove();
//        queue.remove();
//        queue.remove();
//        queue.remove();
//        queue.remove();
////        queue.remove();
//        queue.add(mikeWilson);
//        queue.printQueue();
//
////        queue.printQueue();
////        System.out.println(queue.peek());
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
        LinkedList<Character> queue = new LinkedList<>();
        LinkedList<Character> stack = new LinkedList<>();
        String lowercase = string.toLowerCase();
        for (int i = 0; i < lowercase.length(); i++){
            char c = lowercase.charAt(i);
            if ( c >= 'a' && c <= 'z' ){
                stack.push(c);
                queue.addLast(c);
            }
        }
        while (!stack.isEmpty()){
            if (!stack.pop().equals(queue.removeFirst())){
                return false;
            }
        }
        return true;
    }
}

