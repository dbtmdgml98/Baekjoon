class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int count = 0;
        
        // 약수 구하기
        for (int j = left; j <= right; j++) {
            for (int i = 1; i <= j  ; i++) {
                if (j % i == 0) {
                    count++;
                }
            }
            
            if (count % 2 == 0) {
                answer += j;
            } else {
                answer -= j;
            }
            count = 0;
        }
        
        return answer;
    }
}