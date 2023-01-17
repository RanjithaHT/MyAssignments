package week3.Day7;

import java.util.HashMap;
import java.util.Map;

public class FindMostDuplicateNumber {
 public static void main(String[] args) {
	

        Map<Character, Integer> map= new HashMap<Character, Integer>();
        String str="abbaba";
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
 
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }
            else {
                map.put(c, 1);
            }
        }
 
        for (Map.Entry<Character, Integer> entry :
             map.entrySet()) {
 
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey()+ " : " + entry.getValue());
            }
        }
    }
	 
 }  


