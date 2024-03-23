class Solution {
    public int solution(int[] number) {
        //세 자리의 경우의 수 a, b, c
        int a = 0;
        int b = 0;
        int c = 0;
        int sum = 0; // 세 개의 수 합
        
        //포문 삼중으로 쓰기 : i,j,k 변수 사용
        //조건식은 다음 자리 수를 뺀기 위해 i는 길이-2까지, j는 길이 -1까지
        //sum이 0이 되면 answer ++
        int answer = 0;

        for(int i = 0; i<number.length-2; i++){
            a = number[i];
            //System.out.println("a" + i + ":" + a);
            
            for(int j = i+1; j<number.length-1; j++){
                b = number[j];
                //System.out.println("b" + j + ":" + b);
                
                for(int k = j+1; k<number.length; k++){
                    c = number[k];
                    //System.out.println("c" + k + ":" + c);
                    
                    sum = a + b + c;
                    if(sum == 0) answer++;
                    //System.out.println("sum: " + sum);
                }
            }
        }     
        
        return answer;
    }
}