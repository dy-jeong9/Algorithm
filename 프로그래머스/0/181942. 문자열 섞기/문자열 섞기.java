class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        int n = str1.length();
        for(int i = 0; i<n; i++){
            String s1 = Character.toString(str1.charAt(i));
            String s2 = Character.toString(str2.charAt(i));
            answer += s1 + s2;
        }
        return answer;
    }
}