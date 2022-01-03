// 기본적인 시간을 줄일 수 있다면 최대한으로 줄이자
import java.util.*;
class Solution {
    static char[] arr = new char[8];
    static boolean[] used = new boolean[8];
    static int count; 
    public void perm(int cnt, char[] inputs, int n, String[] data){
        if(cnt == 8){
            
            boolean isOK = true;
            
            for(int i = 0 ; i < n ; i++){

                String condition = data[i];

                char firstChar = condition.charAt(0);

                char thirdChar = condition.charAt(2);

                char fourthChar = condition.charAt(3);

                char fifthChar = condition.charAt(4);

                int firstCharIndex = -1;
                int thirdCharIndex = -1;

                for(int j = 0; j < 8 ; j++){
                    if(firstChar == arr[j]){
                        firstCharIndex = j;
                    }
                    else if(thirdChar == arr[j]){
                        thirdCharIndex = j;
                    }
                }
                int diff = Math.abs(firstCharIndex - thirdCharIndex);

                if(fourthChar == '='){
                    isOK = (diff-1 == fifthChar-'0') ? isOK : false;
                }
                else if(fourthChar == '>'){
                    isOK = (diff-1 > fifthChar-'0') ? isOK : false;
                }
                else{           
                    isOK = (diff-1 < fifthChar-'0') ? isOK : false;
                }
                if(!isOK){
                    return;
                }
            }
            
            if(isOK){
                count++;
            }
            
            return;
        }
        for(int i = 0 ; i < 8 ; i++){
            if(used[i]) continue;
            
            used[i] = true;
            arr[cnt] = inputs[i];
            perm(cnt+1, inputs,n, data);
            used[i] = false;
        }
        
    }
    static char[] inputs = {'A','C', 'F', 'J', 'M', 'N', 'R', 'T'};
    public int solution(int n, String[] data) {
        
        count = 0;
        perm(0, inputs,n,data);
        
        return count;
    }
}