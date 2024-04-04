import java.util.*;
class Solution {
    public long solution(long n) {
        //n을 10으로 자릿수 만큼 나눠서 배열에 담는다.
        //배열을 정렬한다.
        //배열을 역순으로 정렬한다.
        //Long타입으로 리턴한다.
        long answer = 0;
        int length = (n == 0)? 1 : (int)Math.log10(n)+1;
        Long[] arrayN = new Long[length]; //N을 담을 배열
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0 ; i < length ; i++){
            arrayN[i] = n % (long)10;
            n /= 10;
        }
        
        Arrays.sort(arrayN, Collections.reverseOrder());
        
        for(Long l : arrayN){
            sb.append(l);
        }
        answer = Long.parseLong(sb.toString());
        return answer;
    }
}