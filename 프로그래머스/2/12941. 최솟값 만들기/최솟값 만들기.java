import java.util.*;

class Solution{
    public int solution(int []A, int []B){
        int answer = 0;
        
        //각 배열에서 가장 큰 수와 작은 수가 곱해지도록 한다.
        //A,B배열을 정렬하고 루프를 서로 반대방향으로 돌면서 곱해지도록 한다.
        //곱해진 결과 값 누적하여 answer에 담는다.
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i = B.length -1, j = 0 ; i >= 0 ; i--, j++){
            answer += A[j] * B[i];
        }

        return answer;
    }
}