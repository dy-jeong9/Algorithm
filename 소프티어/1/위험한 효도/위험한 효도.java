import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //술래에게 가는 길과 갔다가 돌아오는 길을 나눠서 생각한다.
        //가는 길과 돌아오는 길에 술래가 움직이는 횟수를 각각 n,m으로 둔다.
        //가는 길에 술래가 앞을 본 시간 = b * n
        //돌아오는 길에 술래가 앞을 본 시간 = a * m
        //총 시간 = 2d + am + bn
        //a, b가 d보다 큰 경우 n, m 은 0;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int d = sc.nextInt();
        sc.close();
        int t = 0; //걸린 시간
        int n = (d>a)? d / a : 0; //가는 길에 술래가 돌아본 횟수
        int m = (d>b)? d / b : 0; //돌아오는 길에 술래가 돌아본 횟수

        t = 2 * d + a * m + b * n;

        //System.out.println(a + "" + b + "" + d);
        System.out.print(t);
        
    }
}
