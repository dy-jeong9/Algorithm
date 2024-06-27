import java.util.*;

class Solution {
    public int[] solution(String s) {
        List<Integer> answer = new ArrayList<>();  // ArrayList로 수정
        Map<Character, Integer> map = new HashMap<>();  // 문자와 인덱스를 저장할 맵

        char[] sArray = s.toCharArray();
        
        for (int i = 0; i < sArray.length; i++) {
            char c = sArray[i];
            if (!map.containsKey(c)) {
                answer.add(-1);
            } else {
                answer.add(i - map.get(c));  // 현재 인덱스에서 이전 인덱스를 뺀 값을 추가
            }
            map.put(c, i);  // 현재 문자의 인덱스를 맵에 저장
        }
        
        // List를 배열로 변환
        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        
        return result;
    }
}