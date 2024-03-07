class Solution {
    public long[] solution(long x, int n) {
        long[] answer = {};
        answer = new long[n];
        
        if((-10000000<=x&&x<=10000000)&&(1<=n&&n<=1000)){
            for(int i=1;i<=n;i++){
                answer[(i-1)] = x * (i);
            }
        }
        
        return answer;
    }
}