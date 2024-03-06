class Solution {
    public int solution(int n) {
        int answer = 0;
        
        //1. 정수 n 입력받기
        //2. n의 약수 찾고 더하기
        for(int i =1; i<=n ;i++){
            if(n%i == 0){
                answer += i;
            }
        } 
        
        return answer;
    }
}