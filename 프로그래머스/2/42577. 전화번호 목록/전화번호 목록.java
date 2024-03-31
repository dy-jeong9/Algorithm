import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        //phone_book의 인자를 모두 key로, value는 true 저장 //key만 저장하면됨.
        //key가 phone_book의 전화번호의 substring을 포함하는지 확인.
        //포함한다면 false 리턴
        
        Map<String, Boolean> keyNum = new HashMap<>(); //phone_book의 key를 담을 map
        
        for(String key : phone_book){
            keyNum.put(key, true);
        }
        
        for(String phoneNum : phone_book){
            for(int i = 0; i < phoneNum.length(); i++){
                if(keyNum.containsKey(phoneNum.substring(0, i))){ //keyNum의 key에 phoneNum의 substring 포함 여부 체크
                    answer = false;
                    break;
                }
            }
        }
        
        return answer;
    }
}