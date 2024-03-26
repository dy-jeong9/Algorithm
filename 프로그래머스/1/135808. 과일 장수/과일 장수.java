import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        // score를 sort한다.
        // 마지막부터 m개째 마다 stack에 담으면 stack에는 각 상자의 가장 낮은 점수의 사과가 담긴다.
        // stack에 담긴 점수를 사과수 만큼 곱해서 합한다.
        
        int scoreLength = score.length; // 사과 갯수
        
        Stack<Integer> stack = new Stack<>();
        
        Arrays.sort(score);
        for(int i = scoreLength - m ; i >= 0 ; i-=m){
              stack.push(score[i]);
        }
        
        for(int i = 0; i<scoreLength/m ; i++){
            answer += stack.pop() * m;
        }

        return answer;
    }
}