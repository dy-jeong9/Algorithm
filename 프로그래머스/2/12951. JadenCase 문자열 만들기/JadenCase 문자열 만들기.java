import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        //s를 모두 소문자로 바꾸고 문자열 배열에 하나씩 담는다.
        //배열의 인자를 하나씩 조건에 따라 stack에 넣는다
        //stack이 비어있으면 대문자로 바꿔넣고,
        //stack의 peek가 공백문자면 대문자로 바꿔넣는다.
        //그 외에는 모두 소문자로 넣는다.
        //stack을 문자열로 변환한다. = answer
        
        //전체 소문자로 바꾸고 배열로 만든다
        String[] arrS = s.toLowerCase().split("");
        //System.out.println(Arrays.toString(arrS));

        //배열의 인자를 하나씩 조건에 따라 stack에 넣는다
        //stack이 비어있으면 대문자로 바꿔넣고,
        //stack의 peek가 공백문자면 대문자로 바꿔넣는다.
        Stack<String> Ans = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            //stack이 비어있으면 대문자로 바꿔넣고,
            //stack의 peek가 공백문자면 대문자로 바꿔넣는다.
            if(Ans.isEmpty() || Ans.peek().equals(" ")){
                Ans.push(arrS[i].toUpperCase());
            } else {
                //그 외에는 모두 소문자로 넣는다.
                Ans.push(arrS[i]);
            }
        }
        //stack을 문자열로 변환한다. = answer
        answer = String.join("",Ans);
        //System.out.println(Ans.toString());
        
        return answer;
    }
}
