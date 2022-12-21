package Arrays.Recursion;

public class Factorial {
    public static void main(String[] args){
        System.out.println(iterativeFactorial(3));
        System.out.println(recursiveFactorial(3));
    }
    public static int recursiveFactorial(int num){
        if (num == 1){
            return 1;
        }
        return num * recursiveFactorial(num-1);
    }
    public static int iterativeFactorial(int num){
        if (num == 0){
            return 1;
        }
        int fact = 1;
        for (int i = 1; i <= num; i++){
            fact *= i;
        }
        return fact;
    }
}
