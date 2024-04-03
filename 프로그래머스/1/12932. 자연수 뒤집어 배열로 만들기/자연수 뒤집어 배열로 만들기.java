class Solution {
    public long[] solution(long n) {
        //n을 10으로 나눈 나머지를 answer에 하나씩 담는다.

        String N = n +""; //n의 길이를 사용하기 위해 string으로 변환
        long[] answer = new long[N.length()];        
        
        for(int i = 0 ; i < N.length() ; i++){
            answer[i] = n % (long) 10 ;
            n = n / (long) 10;
        }
        
        return answer;
    }
}