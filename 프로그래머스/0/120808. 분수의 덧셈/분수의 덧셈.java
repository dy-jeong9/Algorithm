class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = 0;
        int denom = 0;
        int max = 1;
        
        numer = numer1*denom2 + numer2*denom1;
        denom = denom1 * denom2 ;
        
        for(int i=1;i<=numer && i<=denom ;i++){
            if(numer%i == 0 && denom%i == 0 ){
                max = i ;
            }
        }
        
        numer = numer /max;
        denom = denom /max;
        
        int[] answer = {numer, denom};
        return answer;
    }
}