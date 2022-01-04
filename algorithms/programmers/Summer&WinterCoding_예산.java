import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        // greedy 적으로 풀 수 있는가
        Arrays.sort(d);
        
        int result = 0;
        int count = 0; 
        for(int i = 0; i < d.length ; i++){
            if(result+d[i] > budget){
                
                break;
            }
            result += d[i];
            count++;
        }        
        return count;
    }
}