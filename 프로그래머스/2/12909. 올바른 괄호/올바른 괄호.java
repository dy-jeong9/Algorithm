class Solution {
    boolean solution(String s) {
        boolean answer = true;
        //stack 없이 풀기
        //'(' 이면 +1, ')'이면 -1, 
        //0이하가 되는 순간 false 또는 최종 sum 이 0이 아니면 false
        
        int sum = 0;
        
        for(int i = 0; i < s.length() ; i++){
            if(s.charAt(i) == '(') sum++;
            if(s.charAt(i) == ')') sum--;
            if(sum < 0) {
                answer = false;
                break;
            }
        }
        return answer = (sum != 0)? false : true ;
    }
}