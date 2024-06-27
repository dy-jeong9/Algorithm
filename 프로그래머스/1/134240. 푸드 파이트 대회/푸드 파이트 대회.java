class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        // food의 인자를 하나씩 꺼내서 /2 의 값만큼 answer의 앞에서부터 추가
        // answer에 0을 추가하고 대칭해서 결과 리턴
        int i = 0;
        String ans = ""; // 임시 문자열
        for(int f : food){
            if(f/2 > 0){
                for(int count = 1; count <= f/2; count++){
                    ans += i;
                }
                i++;
                // System.out.println("f : " + f + " ans : " + ans + " i : " + i);
            } else {
                i++;
            }
            
        }
        StringBuffer ansBuffer = new StringBuffer(ans);
        String ansReverse = ansBuffer.reverse().toString();
        
        answer = ans + "0" + ansReverse;
        
        return answer;
    }
}