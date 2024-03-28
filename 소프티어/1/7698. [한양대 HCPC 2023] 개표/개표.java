import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //T를 받는다
        //n을 5로 나눠서 몫(a) 만큼 ++++ 나머지(b)만큼 | 출력
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i = 0; i < T; i++){
            int n = sc.nextInt();
            int a = n / 5;
            int b = n % 5;
            for(int j = 0; j < a ; j++){
                System.out.print("++++ ");
            }
            for(int k = 0; k < b ; k++){
                System.out.print("|");
            }
            System.out.println("");
        }
    }
}
