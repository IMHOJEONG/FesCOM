import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class A_750 {
 
	static BufferedReader br;
	
	static int toInt(String msg){
	    return Integer.parseInt(msg);
	}
	
	public static void main(String[] args) throws IOException{
		
		br = new BufferedReader(new InputStreamReader(System.in));
		
        StringTokenizer stk = new StringTokenizer(br.readLine());
    
        int n = toInt(stk.nextToken());
        
        int k = toInt(stk.nextToken()); 
        
        int[] arr = new int[n];
        
        for(int i = 0; i < n ; i++){
            arr[i] = (i+1) * 5;
        }
        
        int left = 240-k;
        int result = 0; 
        int minutes = 0;
        for(int i = 0; i < n ; i++){
            
            if(minutes > left){
                break;
            }
            result++;
            minutes+=arr[i];
        }
        
        if(minutes <= left){
            
            System.out.println(result);
        }
        else{
            System.out.println(result-1);
            
        }
        
 
	}
	
}  