import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class A_894 {
   
   public static int toInt(String msg){
       return Integer.parseInt(msg);
   }
   
   public static long toLong(String msg){
       return Long.parseLong(msg);
   }
   public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        char[] arr = br.readLine().toCharArray();
        
        int result = 0;
    
        for(int i = 0; i < arr.length ; i++){
            
            if(arr[i] == 'A') {
                
                int isok1 = 0;
                int isok2 = 0;
                
                for(int j = 0; j < i ; j++){
                    
                    if(arr[j] == 'Q') {
                        
                        isok1++;
                        
                    }
                    
                }
                
                for(int j = i+1; j < arr.length ; j++){
                    
                    if(arr[j] == 'Q') {
                        
                        isok2++;
                        
                    }
                    
                }
                
                result += isok1 * isok2;
                
            }
            
        }
        
        System.out.println(result);
        
   }
	
}  
 