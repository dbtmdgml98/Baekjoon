class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[(my_str.length()+n-1)/n]; // 올림
        
        int i;
        String str = my_str;
        
        for (i = 0; i < my_str.length()/n; i++) {
            answer[i] = str.substring(0,n);
            str = str.substring(n);
        }
        
        if ((my_str.length() % n) != 0) {
            answer[i++] = str;   
        }
        
        return answer;
    }
}