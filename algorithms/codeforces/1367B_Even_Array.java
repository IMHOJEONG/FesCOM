import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class B_1367 {
 
	static BufferedReader br;
	
	static int toInt(String msg){
	    return Integer.parseInt(msg);
	}
	
	public static void main(String[] args) throws IOException{
		
		br = new BufferedReader(new InputStreamReader(System.in));
    
        int t = toInt(br.readLine());
        
        for(int i = 0; i < t ; i++){
            
            int n = toInt(br.readLine());
           
            StringTokenizer stk = new StringTokenizer(br.readLine());
            
            int[] arr = new int[n];
            
            for(int j = 0 ; j < n ;j++){
                arr[j] = toInt(stk.nextToken());    
            }
            
            int even = 0;
            int odd = 0;
            
            for(int j = 0; j < n ; j++){
                if(j % 2 == 0 && arr[j] % 2 != 0){
                    even++;
                }
                if(j % 2 != 0 && arr[j] % 2 == 0){
                    odd++;
                }
            }
            
            if(even == odd){
                System.out.println(even);
            }
            else{
                System.out.println(-1);
            }
            
            
        }
        
 
	}
	
}  