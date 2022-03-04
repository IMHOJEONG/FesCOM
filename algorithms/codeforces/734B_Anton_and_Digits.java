import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class B_734 {
   
   public static int toInt(String msg){
       return Integer.parseInt(msg);
   }
    
   public static long toLong(String msg){
       return Long.parseLong(msg);
   }  
   public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer stk = new StringTokenizer(br.readLine());
        
        int[] arr = new int[4];
        
        for(int i = 0 ; i < 4; i++){
            
            arr[i] = toInt(stk.nextToken());       
                
        }
        int result = 0;
        while(arr[0] > 0 && arr[2] > 0 && arr[3] > 0){
            
            result += 256;
            
            arr[0]--;
            arr[2]--;
            arr[3]--;
        }
        
        while(arr[0] > 0 && arr[1] > 0){
            
            result += 32;
            
            arr[0]--;
            arr[1]--;
            
        }
        
        System.out.println(result);
        
   }
	
}  
 