class Solution {
    public String solution(String s) {
        String answer = "";
        
        //s 길이*1/2 결과값 n
        //홀수라면 substring n, n+1
        //짝수라면 substring n-1,n+1 
        
        int n = s.length() * 1/2;
        
        answer = (s.length()%2 == 1)? s.substring(n,n+1) : s.substring(n-1,n+1) ;
        
        return answer;
    }
}