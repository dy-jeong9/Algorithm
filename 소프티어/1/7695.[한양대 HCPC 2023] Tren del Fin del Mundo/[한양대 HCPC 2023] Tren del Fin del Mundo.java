import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //y좌표가 가장 남쪽(작은) 역의 좌표 출력하는 문제
        //역의 개수 N만큼 for문 실행
        //각 역의 y좌표를 비교하고 stack에 담는다.
        //stack이 비어있거나 peek이 지금 값보다 크면 push + 출력을 위해 x용 stack 별도 사용
        //for문 끝나면 peek값 출력

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // Deque<Integer> stack = new ArrayDeque<Integer>();
        Stack<Integer> yStack = new Stack<>();
        Stack<Integer> xStack = new Stack<>();


        for(int i = 0; i < N; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            if(yStack.isEmpty() || yStack.peek() > y) {
                yStack.push(y);
                xStack.push(x);
            }
            //System.out.println(x + " " + y);
        }
        System.out.println(xStack.peek() + " " + yStack.peek());
        sc.close();
    }
}
