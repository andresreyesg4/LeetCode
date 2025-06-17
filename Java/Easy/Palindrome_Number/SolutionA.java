package Java.Easy.Palindrome_Number;

public class SolutionA {
    
    public static void main(String[] args) {
        SolutionA solution = new SolutionA();
        // solution.isPalindrome(101);
        println("Testing: " + args[0]);
        int input = Integer.parseInt(args[0]);
        solution.isPalindrome(input);
    }

     public boolean isPalindrome(int x) {
        char[] numberArray = Integer.toString(x).toCharArray();
        if(numberArray.length < 2){
            println(x + " is a palindrome");
            return true;
        }
        int head = 0;
        int tail = numberArray.length - 1;
        if(numberArray[head] != numberArray[tail]){
            println(x + " is not a palindrome");
            return false;
        }
        while(head < tail){
            if(numberArray[head] != numberArray[tail]){
                println(x + " is not a palindrome");
                return false;
            }
            head++; tail--;
        }
        println(x + " is a palindrome");
        return true;
    }

    public static void println(Object obj){
        System.out.println(obj);
    }
}
