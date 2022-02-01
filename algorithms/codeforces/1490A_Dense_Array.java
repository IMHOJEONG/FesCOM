import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class A_1490 {
 
	static BufferedReader br;
	
	static int toInt(String msg){
	    return Integer.parseInt(msg);
	}
	
	static int recur(int min,int max){
	    int result = 0;
	    int diff = max / min;
        int diff_left = max % min;
        if((diff > 2) || ( diff == 2 && diff_left != 0)){
            if(max % 2 != 0){
                
                max = max / 2+1;
            }
            else{
                max = max / 2;
            }
            
            min *= 2;
            if(max <= min){
                return result+1;
            }
            else{
                return result+2+recur(min,max);
            }
        }
        return result;
	    
	}
	
	public static void main(String[] args) throws IOException{
		
		br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = toInt(br.readLine());
        
        for(int i = 0; i < t ; i++){
            
            int n = toInt(br.readLine());
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            
            for(int j = 0; j < n ; j++){
                arr[j] = toInt(stk.nextToken());
            }
            int result = 0;
            for(int j = 0 ; j < n-1 ; j++){
                int next = arr[j+1];
                int now = arr[j];
                int max = Math.max(next,now);
                int min = Math.min(next,now);
                
                result += recur(min,max);
            }
            System.out.println(result);
            
            
        }
	}
	
}  
 