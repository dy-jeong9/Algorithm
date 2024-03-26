import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        //s를 stack에 하나씩 넣으면서 괄호가 짝지어지면 pop
        //마지막에 stack이 비어 있으면 true, 아니면 false
        
        Stack<Character> stack = new Stack<>();
        
        if(s.charAt(0)==')') answer = false;
        
        for(int i = 0 ; i < s.length() ; i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));  
            } else if(stack.peek()=='(' && s.charAt(i) ==')'){
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        return answer= stack.isEmpty();
    }
}