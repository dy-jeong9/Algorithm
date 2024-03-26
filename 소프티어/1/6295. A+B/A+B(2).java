import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //테스트 케이스의 개수 T 만큼의 for문 실행
        //A와 B의 합은 길이가 T인 배열에 담는다.
        //케이스 번호와 결과 배열 출력
        Scanner sc = new Scanner(System.in);
   
        int T = sc.nextInt();
        int[] result = new int[T];

        for(int i = 0 ; i<T ; i++ ){
            int A = sc.nextInt();
            int B = sc.nextInt();
            result[i] = A + B ;
        }
        sc.close();
        
        for(int i = 1 ; i <= T ; i++ ){
            System.out.println("Case #" + i + ": " + result[i-1]);
        }
        
    }
}
