import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String N = n + ""; //n을 String 타입으로 만들어준다
        String[] arrN = N.split(""); //N을 배열에 담는다
        
        String reverse = ""; //큰것부터 작은 순으로 정렬한 새로운 문자열
        
        Arrays.sort(arrN); // 오름차순 정렬
        
        for(int i = N.length()-1; i >= 0 ; i--){ //내림차순 해주기 위한 반복문
            reverse += arrN[i];
        }

        answer = Long.parseLong(reverse); // Long타입으로 변환
        
        
        return answer;
    }
}