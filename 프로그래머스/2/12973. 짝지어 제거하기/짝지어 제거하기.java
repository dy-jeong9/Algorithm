import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        int answer = -1;
        //0. stack
        Stack<Character> stack = new Stack<>();
        
        //1. 문자열을 배열에 넣는다.
        char[] str = s.toCharArray();
        
        //2. 문자열 하나씩 스택이랑 비교, 같으면 pop 아니면 push
        for(char a : str){
            if(!stack.isEmpty() && stack.peek() == a){
                stack.pop();
            } else {
                stack.push(a);
            }
        }
        //3. 스택이 남아있지 않으면 1
        answer = (stack.isEmpty())? 1 : 0;

        return answer;
    }
}