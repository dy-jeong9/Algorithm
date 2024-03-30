import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        int N = nums.length; // 총 포켓몬 수
        int my = N/2; //내가 고를 포켓몬 수
        
        //포켓몬 종류 key, 마리수 value를 HashMap에 넣는다.
        //key의 수와 my를 비교해서 작거나 같은 수 리턴
        
        Map<Integer, Integer> poketmons = new HashMap<>();
        for(int i = 0; i < N; i++){
            poketmons.put(nums[i], poketmons.getOrDefault(nums[i], 0) + 1);   
        }
        
        answer = Math.min(poketmons.size(),N/2);

        return answer;
    }
}