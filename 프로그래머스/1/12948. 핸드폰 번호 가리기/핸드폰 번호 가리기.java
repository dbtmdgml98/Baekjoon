class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int i = 0;
        
        for ( String s : phone_number.split("")) {
            if ( i >= phone_number.length() - 4) {
                answer += s;
            } else {
                answer += "*";
            }
            i++;
        }
        return answer;
    }
}