package Java.Easy.Valid_Parenthesis;

import java.util.ArrayList;
import java.util.Stack;


public class SolutionA {
    
    public static void main(String[] args) {
        SolutionA solution = new SolutionA();
        println("Should be false");
        boolean isvalid = solution.isValid("({}))(");
        println(isvalid);

        println("Should be true");
        println(solution.isValid("((()))"));

        println("Should be false");
        println(solution.isValid(")()"));

        println("Should be true");
        println(solution.isValid("({}[])"));
    }

    public boolean isValid(String s) {
        // Create an ArrayList as the Stack
        Stack<Character> stack = new Stack();

        // Iterate through the String
        for(int i = 0; i < s.length(); i++){
            // Add all the open bracket types to the stack
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }else{
                // Check for the closing bracket types
                if(stack.size() == 0){
                    return false;
                }
                int top = stack.size() -1;
                switch (s.charAt(i)) {
                    case ')':
                        if(stack.get(top) !='('){
                            return false; // if the top of the stack is not the complement of the closing character, return false
                        }
                        stack.pop();
                        break;
                    case '}':
                        if(stack.get(top) != '{'){
                            return false;
                        }
                        stack.pop();
                        break;
                    case ']':
                        if(stack.get(top) != '['){
                            return false;
                        }
                        stack.pop();
                        break;
                    default:
                        break;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void println(Object obj){
        System.out.println(obj);
    }
}
