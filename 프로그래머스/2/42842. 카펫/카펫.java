class Solution {
    public int[] solution(int brown, int yellow) {

        //yellow 의 세로 l, 가로 yellow/l
        int l = 1;
        //answer = {yellow/l+2, l+2}
        //brown = 2(yellow/l) + 2l + 4
        //yellow의 인수를 하나씩 넣어서 brown 식 충족하면 answer이다
        
        //yellow의 인수 배열 만들기
        //배열 길이 lengYell부터
        int lengYell = 0;
        for(int i = 1; i<=yellow; i++){
            if(yellow%i == 0) lengYell++;
        }
        System.out.println(lengYell);

        int[] yel = new int[lengYell]; //yellow의 인수 배열
        int n =0;
        for(int i =1; i<=yellow; i++){
            if(yellow%i == 0){
                yel[n] = i;
                n++;
            }
        }
        //yellow 인자 배열에서 하나씩 꺼내서 l에 대입하고 brown을 충족하는지 확인한다.
        for(int i =0;i<lengYell; i++){
            if(brown == (2*yellow/yel[i] + 2*yel[i] + 4)){
                l = yel[i];
                break;
            } 
        }
       int[] answer = {yellow/l+2,l+2};
        
        return answer;
    }
}