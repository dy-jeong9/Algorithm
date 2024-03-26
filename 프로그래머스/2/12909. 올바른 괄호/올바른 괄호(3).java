import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        //문자열 s를 조건에 따라 하나씩 stack에 넣는다.
        //'('이면 stack에 push
        //')'이고 stack이 비었으면 false
        //')'이고 stack에 값(='(')이 있으면 pop
        //stack의 empty 여부
        
        Stack<Character> stack = new Stack<>();
        
        if(s.charAt(0)==')') answer = false; //s의 시작이 ')'이면 무조건 false
        
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '('){
                stack.push(s.charAt(i));  
            } else if (s.charAt(i) == ')'){
                if(stack.isEmpty()) return false; //'('가 들어간 적 없으면 false
                stack.pop();
            }
        }
        return answer = stack.isEmpty();
    }
}
