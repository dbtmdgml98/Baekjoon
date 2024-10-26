class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int originValue = x;
        
        // 각 자리수 합 구하기
        int sum = 0;
        while (x != 0) {
            sum += (x % 10);
            x /= 10;
        }
        
        if(originValue % sum == 0){
            answer = true; 
        }else{
            answer = false;
        }
        
        return answer;
    }
}