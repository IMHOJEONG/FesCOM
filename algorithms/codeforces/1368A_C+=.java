import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class A_702 {
   
   public static int toInt(String msg){
       return Integer.parseInt(msg);
   }
   
   public static long toLong(String msg){
       return Long.parseLong(msg);
   }
   public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = toInt(br.readLine());
        
        for(int i = 0 ; i < T ; i++){
                
            StringTokenizer stk = new StringTokenizer(br.readLine());
            
            long a = toLong(stk.nextToken()); 
            long b = toLong(stk.nextToken());
            long n = toLong(stk.nextToken());
            
            
            long result = 0;
            while(a<=n && b<=n){
                
                long max = Math.max(a,b);
                 
                if(max == a){
                           
                    b += a;
                }
                else {
                    a += b;
                }
                result++;
            }            
            
            System.out.println(result);
                
        }
    
   }
	
}  
 