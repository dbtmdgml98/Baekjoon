class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int a = denom1*denom2;  //분모
        int b = numer1*denom2 + numer2*denom1;  //분자
        
        int gdc = gdc(a,b);
        System.out.print(gdc);
        answer[0] = b/gdc;
        answer[1] = a/gdc;
        
        return answer;
    }
    
    //a와 b의 최대공약수 구하는 메소드
        public int gdc(int a, int b){
            return  b == 0 ?  a : gdc(b,a%b);
        }
}