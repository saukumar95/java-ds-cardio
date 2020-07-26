/*
* AABBEEEEWWTT
* A2B2E4W2T2
*/

import java.util.*;
public class ComputeClass {
  
    static void  computeString(String input) {
        char [] inputCharArray = input.toCharArray();
        HashMap<Character,Integer> characterMap = new HashMap<>();
        for(Character c : inputCharArray) {
            if(characterMap.containsKey(c)){
                characterMap.put(c, characterMap.get(c) + 1); 
            }else {
                characterMap.put(c,1);
            }
        }
       for(Map.Entry entry : characterMap.entrySet()){
           System.out.print(entry.getKey()+""+entry.getValue());
       }
        
    }  
  
    public static void main(String [] args) {
        computeString("LKSDHFYTYGIIIPOPOPOPKNKHGG");   
    }
}
