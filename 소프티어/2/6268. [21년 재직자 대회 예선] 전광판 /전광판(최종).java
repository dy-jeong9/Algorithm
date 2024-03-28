import java.io.*;
import java.util.*;

public class Main {
    //전광판 숫자 5자리 수를 길이 5인 배열에 담는다.
    //처음 숫자 A의 배열과 바뀐 숫자 B의 배열의 각 인자를 비교해 바뀐 인자를 찾는다.
    //바뀐 인자의 전, 후 숫자의 전구 상태를 비교해 바뀐 전구를 카운트한다.
    
    //전광판 표시 숫자를 전구 상태 배열로 만들어주는 메소드를 만든다
        //켜지면 1, 꺼지면 0이다.
    
    //전광판 숫자를 입력하면 전구 상태 배열을 반환하는 메소드
    private static int[] getBulb(int number){
        int[] bulb = new int[7];
        switch(number){
                case -1 :
                    bulb = new int[] {0, 0, 0, 0, 0, 0, 0}; //실제 존재하지 않는 0
                    break;
                case 0 :
                    bulb = new int[] {1, 1, 1, 0, 1, 1, 1}; //실제 존재하는 0
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

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int count = 0; //하나의 숫자를 바꾸기 위해 전구 switch 변경 횟수
        
        for(int i = 0; i < T; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            //System.out.println("A: " + A +" , B: " + B); // 잘 받아왔는지 확인

            //A와 B를 5자리 배열로 만들어준다. 존재하지 않는 0은 -1을 담는다.
            int[] arrA = new int[5];
            int[] arrB = new int[5];
            //각 배열에 숫자 넣어주기
            for(int j = 4; j >= 0 ; j--){
                if(A != 0 ){
                    arrA[j] = A % 10;
                    A /= 10;
                } else if(A == 0){ //비어있는 0이 시작되면 -1을 인자로 넣는다.
                    arrA[j] = -1;
                }
                if(B != 0){
                    arrB[j] = B % 10;
                    B /= 10;
                } else if(B == 0){ //비어있는 0이 시작되면 -1을 인자로 넣는다.
                    arrB[j] = -1;
                }

                //arrA와 arrB 배열의 각 인자가 다르다면 달라진 숫자의 switch 변경 횟수를 count++한다.
                if(arrA[j] != arrB[j]){
                    for (int k = 0; k < 7 ; k++){
                        if(getBulb(arrA[j])[k] != getBulb(arrB[j])[k]){
                            count++;
                        }
                    }
                    //System.out.println("count" + j + ":" + count);
                }
            }
            //System.out.println(Arrays.toString(arrA));   //입력값이 배열로 잘 변환되었는지 확인
            //System.out.println(Arrays.toString(arrB));
            System.out.println(count);
            count = 0; // 다음 케이스를 위해 0으로 설정
        }

    }
}
