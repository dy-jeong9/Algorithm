import java.util.*;

class Solution {
    public Integer[] solution(int n) {        
        ArrayList<Integer> newList = new ArrayList<>();
        for(int i = 1; i<=n; i++) {
            if(i%2 != 0) newList.add(i);
        }
        Integer[] answer = newList.toArray(new Integer[0]);
        
        return answer;
    }
}