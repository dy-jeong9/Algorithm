class Solution {
    public int solution(int[] number) {
        //세 자리의 경우의 수
        int a = 0;
        int b = 0;
        int c = 0;
        int sum = 0;
        //포문 삼중으로 쓰기 : i,j,k
        //i는 길이-2까지, j는 길이 -1까지
        //sum이 0이 되면 answer ++
        int answer = 0;

        for(int i = 0; i<number.length-2; i++){
            a = number[i];
            //System.out.println("a"+i+":"+a);
            for(int j = i+1; j<number.length-1; j++){
                b = number[j];
                //System.out.println("b"+j+":"+b);
                for(int k = j+1; k<number.length; k++){
                    c = number[k];
                    //System.out.println("c"+k+":"+c);
                    sum = a + b + c;
                    if(sum == 0) {
                        answer++;
                    } 
                    //System.out.println(i + "sum:"+ sum);
                }
            }
        }     
        
        return answer;
    }
}