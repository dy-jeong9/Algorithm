import java.util.*;

class Solution {
    boolean solution(String s) {
        //s를 stack에 하나씩 넣으면서 괄호가 짝지어지면 pop
        //마지막에 stack이 비어 있으면 true, 아니면 false

        Stack<Character> stack = new Stack<>();
                
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
            } else if(s.charAt(i)==')'){
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}