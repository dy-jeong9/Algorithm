import java.util.*;

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        //String 배열에 담는다.
        //배열 길이의 -4만큼의 인덱스까지의 인자는 *로 바꾼다.
        //배열을 문자열로 변환한다.
        
        String[] num = phone_number.split("");
        
        for(int i = 0;i<num.length-4;i++){
            num[i] = "*";
        }
        
        for(int i=0; i<num.length; i++){
            answer += num[i] +"";
        }
        
        System.out.println(Arrays.toString(num));
        System.out.println(num.toString());
        System.out.println(answer);
        
        return answer;
    }
}