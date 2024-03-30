import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        //참가자, 완주자 목록에서 모두 짝수번 등장해야 완주
        //참가자와 완주자를 순차적으로 map에 먼저 넣고, 등장할 때마다 put, remove
        //마지막에 남은 사람(key) 리턴
        
        Map<String, Boolean> marathon = new HashMap<>();
        
        for(int i = 0 ; i < participant.length ; i++){
            if(marathon.containsKey(participant[i])){
                marathon.remove(participant[i]);
            } else {
                marathon.put(participant[i], true);
            }
        }
        
        for(int i = 0 ; i < completion.length ; i++){
            if(marathon.containsKey(completion[i])){
                marathon.remove(completion[i]);
            } else {
                marathon.put(completion[i], true);
            }
        }
        
        for (String key : marathon.keySet()) {
            //System.out.println(key);
            answer = key;
            break;
        }

        
        return answer;
    }
}
