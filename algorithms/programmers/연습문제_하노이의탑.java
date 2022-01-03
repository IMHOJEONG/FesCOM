import java.util.*;
class Solution {
    public static ArrayList<int[]> list = new ArrayList<>();
    public static void hanoi(int n, int from,int to,int inter){
        
        if(n == 1){
            list.add(new int[]{from, to});    
            return;
        }
        
        hanoi(n-1, from, inter, to);
        list.add(new int[]{from, to});
        hanoi(n-1, inter, to, from);
        
    }
    
    public int[][] solution(int n) {
        int[][] answer = {};
        
        hanoi(n,1,3,2);
        answer = new int[list.size()][2];
        for(int i = 0; i < list.size() ; i++){
            
            answer[i] = list.get(i);
        }
        
        
        return answer;
    }
}