import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class A_1196 {
   
   public static int toInt(String msg){
       return Integer.parseInt(msg);
   }
    
   public static long toLong(String msg){
       return Long.parseLong(msg);
   }  
   public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = toInt(br.readLine());
        
        
        
        for(int i = 0 ; i < n; i++){
            long result = 0;
            StringTokenizer stk = new StringTokenizer(br.readLine());
           
            
            for(int j = 0 ; j < 3 ; j++){
                result+=toLong(stk.nextToken());
            }
            System.out.println(result/2);
            
        }
        
        
        
        
   }
	
}  
 