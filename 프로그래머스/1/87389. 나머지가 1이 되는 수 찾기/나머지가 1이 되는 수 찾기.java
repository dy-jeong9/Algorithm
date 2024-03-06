class Solution {
    public int solution(int n) {
        int answer = 0;
        //1. 제한 사항 내의 n이 주어진다.
        //2. 나머지가 1이 되는 x를 찾는 루프
        //3. 나머지가 1이 되면 i 반환

        if(3<=n && n<=1000000){
            for(int i =2;i<n;i++){
                if(n%i == 1) {
                    answer = i;
                    break;
                }
            }       
        }
        return answer;
    }
}