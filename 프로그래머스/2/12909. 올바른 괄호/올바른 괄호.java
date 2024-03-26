import java.util.*;

class Solution {
    boolean solution(String s) {
        //문자열 s를 조건에 따라 하나씩 stack에 넣는다.
        //'('이면 stack에 push
        //')'이고 stack이 비었으면 false
        //')'이고 stack에 값(='(')이 있으면 pop
        //stack의 empty 여부

        Stack<Character> stack = new Stack<>();
                
        for(int i = 0 ; i < s.length(); i++){
            //'('는 stack에 넣는다. 
            if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
            //')'일 때
            } else if(s.charAt(i)==')'){
                //stack이 비어 있으면 false
                if(stack.isEmpty()) return false;
                //비어있지 않으면 = '(' 가 있으면 -> pop
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
