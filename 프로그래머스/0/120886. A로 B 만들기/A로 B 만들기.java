import java.util.*;

class Solution {
    public int solution(String before, String after) {
        //HashMap 사용, key:알파벳, value:갯수
        HashMap< Character, Integer> beforeMap = new HashMap<>();
        HashMap< Character, Integer> afterMap = new HashMap<>();
        for(int i = 0; i < after.length() ; i++){
            beforeMap.put(before.charAt(i), beforeMap.getOrDefault(before.charAt(i), 0) + 1);
            afterMap.put(after.charAt(i), afterMap.getOrDefault(after.charAt(i), 0) + 1);
        }
        return (beforeMap.equals(afterMap))? 1 : 0 ;
    }
}