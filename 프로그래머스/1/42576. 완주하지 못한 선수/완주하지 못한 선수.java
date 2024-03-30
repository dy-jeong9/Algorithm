import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        //참가자 이름을 key로 map에 추가하면서 등장하면 value +1
        //완주자 이름을 key로 추가하면서 value -1
        //마지막에 value가 0이 아닌 key를 리턴
        
        Map<String, Integer> marathon = new HashMap<>();
        
        for(int i = 0 ; i < participant.length ; i++){
           marathon.put(participant[i], marathon.getOrDefault(participant[i], 0) + 1);
        }
        
        for(int i = 0 ; i < completion.length ; i++){
           marathon.put(completion[i], marathon.get(completion[i]) -1);
        }
        
        for (String key : marathon.keySet()) {
            if(marathon.get(key) != 0) {
                answer = key;
                break;
            }
        }
        return answer;
    }
}