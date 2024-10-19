import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int k = 10;
        
        while(true){
            if(n/k==0){
                answer += n%k;
                break;
            }else{
                answer += n%k;
            n=n/k;
            }
        }
        return answer;
    }
}