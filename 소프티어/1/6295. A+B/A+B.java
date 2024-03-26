import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int[] results = new int[T];

        for(int testCase = 0 ; testCase < T ; testCase++){
            int A = sc.nextInt();
            if(A<1 || A>9){
                 System.out.println("1이상 9이하의 정수를 입력하세요");
                return;
            }
            int B = sc.nextInt();
            if(B<1 || B>9){
                 System.out.println("1이상 9이하의 정수를 입력하세요");
                return;
            }
            results[testCase] = A + B ;
        }

        for(int testCase = 1; testCase <=T; testCase++ ){
             System.out.println("Case #" + testCase + ": " + results[testCase - 1]);
        }
    }
}
