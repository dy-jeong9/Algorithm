class Solution {
    public int solution(int n) {
        int answer = 0;
        // n = 짝수 : 모든 약수 개수 / n =홀수 => 홀수 약수 개수
        
        for(int i = 1 ; i <= n ; i++){
            if(n%i == 0){
                if(n%2 == 0){ //짝수
                    if(i%2 == 1) answer++; //홀수면 +1
                } else { //홀수
                    answer++; //약수면 +1
                }
            }
        }
        return answer;
    }
}
