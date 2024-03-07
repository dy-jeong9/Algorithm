class Solution {
    public long solution(long a, long b) {
        long answer = 0;
        long num = Math.abs(a-b);

        if(a == b){
            answer = a;
        } if(a<b) {
            for(long i = 0; i <= num ; i++){
               long sum = 0;
                answer += a + i;
            }
        } if(a>b) {
            for(long i = 0; i <= num ; i++){
                answer += b + i;
            }
        }
        
        return answer;
        
    }
}