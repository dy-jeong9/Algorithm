import java.util.*;
class Solution {
    public long solution(long n) {
        //n을 10으로 자릿수 만큼 나눠서 배열에 담는다.
        //배열을 정렬한다.
        //배열을 역순으로 정렬한다.
        //Long타입으로 리턴한다.
        long answer = 0;
        String N = n + ""; //n의 길이를 사용하기 위해 string 타입으로 변환
        long[] arrayN = new long[N.length()]; //N을 담을 배열
        
        String k = "";
        
        for(int i = 0 ; i < N.length() ; i++){
            arrayN[i] = n % (long)10;
            n /= 10;
        }
        Arrays.sort(arrayN);
        
        for(int i = N.length()-1 ; i >= 0 ; i--){
            k += arrayN[i];
        }
        answer = Long.parseLong(k);
        return answer;
    }
}