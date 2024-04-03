class Solution {
    boolean solution(String s) {
        boolean answer = true;
        //s 모두 소문자화
        //p, y 갯수 세기
        //비교하기
        
        //1. s 모두 소문자
        s = s.toLowerCase();
        
        //2. s에서 p, y 개수 세기
        int countP = 0 , countY = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == 'p') countP++;
            if(s.charAt(i) == 'y') countY++;
        }
        
        //3. 둘의 값이 다르면 false
        if(countP != countY) answer = false;
        //3-1. 초기값이 이미 0, answer는 true라 생략 가능
        if(countP + countY == 0) answer = true;

        return answer;
    }
}