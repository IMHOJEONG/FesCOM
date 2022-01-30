import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class A_1506 {
 
	static BufferedReader br;
	
	static int toInt(String msg){
	    return Integer.parseInt(msg);
	}
	
	public static void main(String[] args) throws IOException{
		
		br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = toInt(br.readLine());
        
        for(int k = 0; k < t  ; k++){
            
            int n = toInt(br.readLine()); 
            StringTokenizer stk = new StringTokenizer(br.readLine());

            int[] arr = new int[n];
            for(int i = 0; i < n ;i++){
                arr[i] = toInt(stk.nextToken());
            }
            
            Arrays.sort(arr);
            
            int min = arr[0];
            int val = 0;
            for(int i = 0; i < n ; i++){
                if(arr[i] == min){
                    val++;
                }
            }
            
            if(arr.length == val) {
                
                System.out.println(0);
            }
            else{
                
                System.out.println(arr.length-val);
                
            }
            
          
        }    
       
	}
	
}  
 