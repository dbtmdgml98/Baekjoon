class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        
        answer[0] = gcd(max, min); // 최대공약수
        answer[1] = (n*m)/answer[0]; // 최소공배수
        
        return answer;
    }
    
    // 유클리드 호제법을 사용해 최대공약수 구하는 재귀함수
    public int gcd(int a, int b){
        if (b==0) {
            return a;
        }
        return gcd(b,a%b);
    }
}