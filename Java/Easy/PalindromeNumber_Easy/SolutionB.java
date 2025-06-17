package Java.Easy.PalindromeNumber_Easy;

public class SolutionB {
    
    public static void main(String[] args) {
        SolutionA solution = new SolutionA();
        // solution.isPalindrome(101);
        println("Testing: " + args[0]);
        int input = Integer.parseInt(args[0]);
        println(solution.isPalindrome(input));
    }

    public boolean isPalindrom(int x){
        if(x < 0 || (x != 0 && x % 10 == 0)){
            return false;
        }
        int reversedHalf = 0;
        while(x > reversedHalf){
            reversedHalf = (reversedHalf * 10) + (x % 10);
            x /= 10;
        }
        return x == reversedHalf || x == reversedHalf / 10;
    }

    public static void println(Object obj){
        System.out.println(obj);
    }
}
