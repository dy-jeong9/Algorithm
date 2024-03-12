import java.util.*;

class Solution {
    public int solution(int n) {
        
        //피보나치 수 담을 배열 arr
        //arr의 길이
        //for문으로 arr 인자 만들어 arr에 담기
        //n번째 인자 나누기 & 리턴
        
        // int[] arr = {0,1,1,2,3,5};
        int answer = 0;
        if(2<=n && n<=100000){
            int leng = n + 1;
            int[] arr = new int[leng];
            arr[0] = 0;
            arr[1] = 1;

            for(int i=2; i<leng; i++){
                //(A + B) % C = ( ( A % C ) + ( B % C) ) % C
                int f = arr[i-1] + arr[i-2];
                arr[i] = f % 1234567;
            }

            answer = arr[n];

        }
        
        return answer;
    }
}