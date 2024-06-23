import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        for(int i = 0; i<a.length(); i++){
            char letter = a.charAt(i);
            if(Character.isLowerCase(letter)){
                letter = Character.toUpperCase(letter);
                System.out.print(letter);
            } else {
                letter = Character.toLowerCase(letter);
                System.out.print(letter);
            }
        }
        
    }
}