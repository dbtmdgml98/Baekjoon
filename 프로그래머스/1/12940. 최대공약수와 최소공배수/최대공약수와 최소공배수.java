class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        // 최대 공약수
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        
        while (min != 0) {
            int r = max % min;
            max = min;
            min = r;
            
        }
        
        // 최소 공배수 = 두 수의 곱 / 최대 공약수
        min =  (n * m) / max;
        
        answer[0] = max;
        answer[1] = min;
        
        return answer;
    }
}