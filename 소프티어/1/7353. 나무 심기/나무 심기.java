import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine()); //주어진 위치의 개수
        String[] arrStrF = reader.readLine().split(" "); //주어진 토양의 비옥함 배열
        Integer[] arrIntF = new Integer[n];
        for(int i = 0; i < n; i++) arrIntF[i] = Integer.parseInt(arrStrF[i]);
        
        // System.out.println("n : " + n);
        // System.out.println("F : " + Arrays.toString(arrStrF));
        // System.out.println("F : " + Arrays.toString(arrIntF));

        //arrIntF를 sort한다.
        //[0]*[1] 와 [n-2]*[n-1]을 비교해서 큰 수 출력
        //n이 2라면 [0]*[1] 출력

        Arrays.sort(arrIntF);
        // System.out.println("F : " + Arrays.toString(arrIntF));

        if(n == 2){
            System.out.println(arrIntF[0]*arrIntF[1]);
        } else {
            if(arrIntF[0]*arrIntF[1] >= arrIntF[n-1]*arrIntF[n-2]){
                System.out.println(arrIntF[0]*arrIntF[1]);
            } else {
                System.out.println(arrIntF[n-1]*arrIntF[n-2]);
            }
        }
    }
}
