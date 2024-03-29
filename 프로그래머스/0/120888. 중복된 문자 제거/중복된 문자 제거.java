import java.util.*;

class Solution {
    public String solution(String my_string) {
        Set<Character> mySet = new HashSet<>();
        StringBuilder builder = new StringBuilder();
        
        for(char c : my_string.toCharArray()){
            if(mySet.contains(c)) continue;
            mySet.add(c);
            builder.append(c);
        }
        return builder.toString();
    }
}