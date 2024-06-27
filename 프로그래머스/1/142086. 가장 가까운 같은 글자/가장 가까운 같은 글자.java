import java.util.*;

class Solution {
    public List<Integer> solution(String s) {
        List<Integer> answer = new ArrayList<>();
        
        // s를 한 글자씩 이전에 등장했는지 확인하고 map에 인덱스와 추가
        // map에 존재하는 글자라면 더 큰 인덱스를 현재 인덱스에서 빼고 리스트에 추가
        
        char[] sArray = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < sArray.length; i++){
            char c = sArray[i];
            if(!map.containsKey(c)){
                answer.add(-1);
            } else {
                answer.add(i - map.get(c));
            }
            map.put(c, i);
        }
        
        return answer;
    }
}