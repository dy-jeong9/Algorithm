import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //마을 사이 거리를 담은 배열 arrDis
        //arrDis의 min
        //min과 같은 인자 수 구하기 = answer

        int min = 0; //가장 짧은 거리
        int count = 0;

        Scanner sc = new Scanner(System.in);

        //n, arrVil[] 입력받기
        int n = Integer.parseInt(sc.nextLine());
        int[] arrVil = new int[n]; // 마을의 위치
        int[] arrDis = new int[n-1]; // 마을 사이 거리 배열
        
        String strVil = sc.nextLine();
        String[] arrStrVil = strVil.split(" ");
        
        for(int i=0;i<arrStrVil.length;i++){
            arrVil[i] = Integer.parseInt(arrStrVil[i]);
        }

        //arrDis 담기
        for(int i=0;i<arrDis.length;i++){
            arrDis[i] = arrVil[i+1] - arrVil[i];
        }

        //arrDis 중 가장 작은 값 찾기
        Arrays.sort(arrDis);
        min = arrDis[0];

        //min과 같은 arrDis[i] 갯수 구하기
        for(int i =0;i<arrDis.length;i++){
            if(arrDis[i] == min) count++;
        }
        
        sc.close();
        System.out.println(count);
    }
}
