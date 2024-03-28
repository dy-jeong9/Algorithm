import java.io.*;
import java.util.*;

public class Main {
        //전광판의 각 자리수와 각 전구 상태(배열)를 2차원 배열로 선언한다.
        //처음 숫자 A와 바뀐 숫자 B의 전구 상태 배열을 비교해서
        //달라진 배열 인자 수를 세어 달라진 전구의 갯수를 구한다.

        //전광판 표시 숫자를 전구 상태 배열로 만들어주는 메소드를 만든다
            //켜지면 1, 꺼지면 0이다.

    private static int[] getBulb(int number){
        int[] bulb = new int[7];
        switch(number){
                case 0 :
                    bulb = new int[] {1, 1, 1, 0, 1, 1, 1};
                    break;
                case 1 :
                    bulb = new int[] {0, 0, 1, 0, 0, 1, 0};
                    break;
                case 2 :
                    bulb = new int[] {1, 0, 1, 1, 1, 0, 1};
                    break;
                case 3 :
                    bulb = new int[] {1, 0, 1, 1, 0, 1, 1};
                    break;
                case 4 :
                    bulb = new int[] {0, 1, 1, 1, 0, 1, 0};
                    break;
                case 5 :
                    bulb = new int[] {1, 1, 0, 1, 0, 1, 1};
                    break;
                case 6 :
                    bulb = new int[] {1, 1, 0, 1, 1, 1, 1};
                    break;
                case 7 :
                    bulb = new int[] {1, 1, 1, 0, 0, 1, 0};
                    break;
                case 8 :
                    bulb = new int[] {1, 1, 1, 1, 1, 1, 1};
                    break;
                case 9 :
                    bulb = new int[] {1, 1, 1, 1, 0, 1, 1};
                    break;
                default :
                    bulb = null;
                    break;
        }

        return bulb;
    }

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(reader.readLine()); //테스트 케이스의 수
        for(int i = 0; i < T; i++){
            reader.readLine();
        }
       //String case1 = reader.nextLine();
               // String case2 = reader.nextLine();


        System.out.println(T);
        //System.out.println(case1);
        
        //int[][] display = new int[5][7]; //2차원 배열 선언
        
    }
}
