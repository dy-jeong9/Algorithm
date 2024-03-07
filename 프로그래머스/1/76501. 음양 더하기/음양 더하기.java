class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 123456789;
        int tsum = 0;
        int fsum = 0;

        for(int i =0;i<signs.length ;i++){
            if(signs[i]){
                int a = absolutes[i];
                tsum += a;
            } else {
                int a = absolutes[i];
                fsum -=a;
            } 
        }
        answer = tsum + fsum;
        return answer;
    }
}