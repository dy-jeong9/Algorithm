class Solution {
    public int solution(int n) {
        int answer = 1; // pizza
        
        if(n % 6 == 0){
            answer = n/6;
        } else {
            while ((answer * 6) % n != 0) {
            answer ++;
            }
        }
        
        return answer;
    }
}