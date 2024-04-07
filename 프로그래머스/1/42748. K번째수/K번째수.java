import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        // int comi = commands[][0];
        // int comj = commands[][1];
        // int comk = commands[][2];
        
        for(int n = 0 ; n < commands.length ; n++){
            int i = commands[n][0];
            int j = commands[n][1];
            int k = commands[n][2];
            
            //자르고 정렬
            int[] temp = Arrays.copyOfRange(array, i-1, j);
            Arrays.sort(temp);
            
            //temp 에서 k번째 수를 answer에 담기
            answer[n] = temp[k-1];
            
            //System.out.println(Arrays.toString(temp));
        }
        
        
        
        // System.out.println(array);
        return answer;
    }
}