import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        // array의 인자를 key로, 등장 횟수를 value로 담기
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : array){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        // 가장 많은 등장 횟수(value)
        int maxValue = Collections.max(map.values());

        // 최대 등장 횟수와 value가 같은 key 찾고
        // 최대 등장 횟수가 중복인지 확인, 중복이면 check 값 증가
        int maxKey = 0;
        int check = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == maxValue) {
                maxKey = entry.getKey();
                check ++;
            }
        }
        // System.out.println("check : " + check + "/ maxKey : " + maxKey + "/ map.size() " + map.size());
        
        // check = 1인 경우, 중복 없는 최대값
        if(check == 1){
            answer = maxKey;
        } else {
            // array의 모든 인자가 같은 경우(check != 1이라 위의 조건에서 빠져나옴) 처리
            if(map.size() == 1){
                answer = maxKey;
            }
            // 최빈값이 여러개인 경우
            else {
                answer = -1;                
            }
        }
        
        return answer;
    }
}