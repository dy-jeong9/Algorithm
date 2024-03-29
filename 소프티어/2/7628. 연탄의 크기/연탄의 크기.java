import java.io.*;
import java.util.*;

public class Main {
    //각 집의 난로 반지름 길이를 담은 배열을 만든다.
    //난로의 반지름의 약수를 구하고 약수를 해시맵의 키로, 약수가 등장하면 벨류를 +1해준다.
    //각 약수들(키)을 카운팅 해서 가장 큰 수를 출력한다!

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //집의 수
        int[] house = new int[n]; //각 집 난로의 반지름 배열
        for(int i = 0 ; i < n ; i++){
            house[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> count = new HashMap<>(); // key = 약수, value = 등장횟수
        for(int i = 0; i < n ; i++){
            for(int j = 2; j <= house[i] ; j++){ // 1은 모든 수의 약수이므로 제외
                if(house[i] % j == 0){
                    count.put( j, count.getOrDefault(j, 0) + 1);
                }
            }
        }
        //System.out.println(count);
        int maxR = Collections.max(count.values()); // 약수의 등장횟수 중 가장 큰 값(value) 출력
        System.out.println(maxR); 
    }
}
