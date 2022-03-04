import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class A_1234 {
   
   public static int toInt(String msg){
       return Integer.parseInt(msg);
   }
    
   public static long toLong(String msg){
       return Long.parseLong(msg);
   }  
   public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = toInt(br.readLine());
        
        for(int i = 0 ; i < N; i++){
            
            int n = toInt(br.readLine());
            int[] arr = new int[n];
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int sum = 0;
 
            for(int j = 0 ; j < n ;j++){
                
                arr[j] = toInt(stk.nextToken());       
                sum += arr[j];    
            
            }
            double check = Math.ceil(((double)sum) / n);
            
            System.out.println((int)check);
                
        }

        
   }
	
}  
 