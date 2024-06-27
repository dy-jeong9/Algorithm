class Solution {
    public String solution(int[] food) {
        String answer = "0";
        
        // food의 높은 인덱스의 인자부터 꺼내서 /2 한 몫의 횟수만큼 0의 양 옆에 추가한다.
        
        for(int i = food.length -1; i > 0 ; i--){
           for(int j = 0 ; j < food[i]/2 ; j++){
               answer = i + answer + i ;
           }   
        }
        
        return answer;
    }
}