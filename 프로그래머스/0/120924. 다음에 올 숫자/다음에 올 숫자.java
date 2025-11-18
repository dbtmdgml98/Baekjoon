class Solution {
    public int solution(int[] common) {
        int answer = 0;
    
        int r1 = common[1] - common[0];
        int r2 = common[2] - common[1];
        
        if (r1 == r2) {
                answer = common[common.length - 1] + r1;
                
        } else {
                answer = common[common.length - 1] * (common[2] / common[1]);
        }
            
        return answer;
    }
}