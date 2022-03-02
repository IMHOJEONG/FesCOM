import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class A_1527 {
   
   public static int toInt(String msg){
       return Integer.parseInt(msg);
   }
   
   public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = toInt(br.readLine());
        
        for(int i = 0; i < T ; i++){
            
            int val = toInt(br.readLine());
            int n = 0;
            while((1<<n) <= val){
                n++;
            }
            

                
            System.out.println((1<<(n-1))-1);
            
            
            
        }
        
   }
	
}  
 