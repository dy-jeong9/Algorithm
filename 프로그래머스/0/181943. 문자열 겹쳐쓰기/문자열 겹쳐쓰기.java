class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
    String answer = "";
        for(int i = 0; i < my_string.length(); i++){
            if(i<s || i - overwrite_string.length() - s >= 0) {
                answer += my_string.toCharArray()[i];
            } else {
              answer += overwrite_string.toCharArray()[i-s];
            }
        }
        return answer;
    }
}