import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int pleng = p.length(); //p길이
        int arrleng = t.length() - pleng + 1; //substring 담은 배열의 길이
        long[] strArr = new long[arrleng]; //substring을 int로 담은 배열
        long pval = Long.parseLong(p);
        
        //t를 p길이만큼 자른 문자열 배열
        //배열 인자들 숫자로 변환
        //배열 인자들을 p와 비교
        for(int i =0; i<arrleng ; i++){
            strArr[i] = Long.parseLong(t.substring(i,i+pleng));
            if(pval >= strArr[i] ) answer++;
        }
        
        return answer;
    }
}