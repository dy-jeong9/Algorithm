//문제 링크 : https://softeer.ai/practice/6253
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); //A의 주행거리
        int B = sc.nextInt(); //B의 주행거리

        String answer = "";
        if(A == B){
            answer = "same";
        } else {
            answer = (A > B)? "A" : "B";
        }

        System.out.println(answer);
        
    }
}
