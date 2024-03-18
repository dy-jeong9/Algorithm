import java.util.*;
class Solution {
    public String solution(int n) {
        String answer = "";
        String[] str = new String[n];

        for(int i = 0; i<n; i++){
            
            if(i%2==0) str[i] = "수";
            if(i%2==1) str[i] = "박";

        }
        answer = String.join("",str);
        return answer;
    }
}