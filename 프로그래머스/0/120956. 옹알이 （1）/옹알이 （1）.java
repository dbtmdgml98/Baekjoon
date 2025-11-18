class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for (int i = 0; i < babbling.length; i++) {
            String s = babbling[i];
            
            s = s.replace("aya", "1");
            s = s.replace("ye", "1");
            s = s.replace("woo", "1");
            s = s.replace("ma", "1");
            s = s.replace("1", "");
            
            if (s.isEmpty()) {
                answer++;
            }
        }
        
        return answer;
    }
}