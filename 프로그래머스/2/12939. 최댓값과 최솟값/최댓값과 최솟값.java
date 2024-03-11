import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        //split " "해서 배열에 담기
        String[] sarr = s.split(" ");
        System.out.println(Arrays.toString(sarr));
        
        //int 배열로 바꿔담기
        int[] iarr = new int[sarr.length];
        for(int i = 0 ; i < sarr.length ; i++){
            iarr[i] = Integer.parseInt(sarr[i]);
        }
        
        //sorting 해서 min, max 구하기
        Arrays.sort(iarr);
        
        int min = iarr[0];
        int max = iarr[iarr.length-1];
        
        answer = min + " " + max;
        
        
        System.out.println(Arrays.toString(iarr));
        System.out.println(answer);

        return answer;
    }
}