import java.util.*;

public class Solution {
    public List<Integer> solution(int []arr) {      
        //arr를 하나씩 stack에 넣는다.
        //직전 값이랑 같으면 제거pop
        Stack<Integer> sInt = new Stack<>();
        List<Integer> answer = new ArrayList<>();
        
        for(int i =0; i<arr.length; i++){
            //stack이 비어있거나 직전 값이 넣으려는 값과 다르면 stack에 넣는다. 
            if(sInt.isEmpty() || sInt.peek()!=arr[i]) {
                sInt.push(arr[i]);
                //답에도 넣는다.
                answer.add(arr[i]);
            } 
            //같으면 그 다음 값으로 넘어간다.
        }

        //System.out.println(sInt);
        return answer;
    }
}