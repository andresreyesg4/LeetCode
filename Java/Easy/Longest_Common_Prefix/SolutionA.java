package Java.Easy.Longest_Common_Prefix;

import java.util.HashMap;

public class SolutionA {
    
    public static void main(String[] args) {
        SolutionA solution = new SolutionA();
        String[] strs = {"cir","car"};
        // String[] strs = {"bab","bcc"};
        solution.logestCommonPrefix(strs);

    }

    public String logestCommonPrefix(String[] strs){
        StringBuilder lcp = new StringBuilder();
        if(strs.length < 1 ){
            return "";
        }else{
            String smallest = strs[0];
            int smallestLength = strs[0].length();
            for(String str: strs){
                int temp = str.length();
                if(temp < smallestLength){
                    smallestLength = temp;
                    smallest = str;
                }
            }
            int numberOfHits = 0;
            for(int i = 0; i < smallest.length(); i++){
                for(int j = 0; j < strs.length; j++){
                    if(smallest == strs[j]){
                        continue;
                    }else{
                        if(smallest.charAt(i) == strs[j].charAt(i)){
                            numberOfHits++;
                        }else if(i == 0 && smallest.charAt(i) != strs[j].charAt(i)){
                            return "";
                        }else if(smallest.charAt(i) != strs[j].charAt(i)){
                            return lcp.toString();
                        }
                    }
                }
                if(numberOfHits == strs.length -1){
                    lcp.append(smallest.charAt(i));
                }
                numberOfHits = 0;
            }
        }
        println(lcp.toString());
        return lcp.toString();
    }

    public static void println(Object obj){
        System.out.println(obj);
    }
}
