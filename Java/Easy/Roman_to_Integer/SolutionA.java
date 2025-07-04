package Java.Easy.Roman_to_Integer;

import java.util.HashMap;
import java.util.Map;

public class SolutionA {
    

    public static void main(String[] args) {
        HashMap<String,Integer> romanNumerals = new HashMap<>();
        romanNumerals.put("I", 1);
        romanNumerals.put("V", 5);
        romanNumerals.put("X", 10);
        romanNumerals.put("L", 50);
        romanNumerals.put("C", 100);
        romanNumerals.put("D", 500);
        romanNumerals.put("M",1000);

        int romanNumber = generateRomanNumeral(romanNumerals, "MCMXCIV");
        println(romanNumber);
    }

    public static int generateRomanNumeral(HashMap map, String rm){
        int result = 0;
        if(map.get(rm) != null){
            result = (int)map.get(rm);
        }else{
            for(int i = 0; i < rm.length(); i++){
                int currentValue = (int)map.get(String.valueOf(rm.charAt(i)));

                if(i + 1 < rm.length() && (int)map.get(String.valueOf(rm.charAt(i +1))) > currentValue){
                    result -= currentValue;
                }else{
                    result += currentValue;
                }
            }    
        }
        return result;
    }

    public static void println(Object obj){
        System.out.println(obj);
    }
   

}
