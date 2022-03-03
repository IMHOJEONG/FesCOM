import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class B1_1551 {
   
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
        
            char[] arr = br.readLine().toCharArray();
            int[] check = new int[26];
            
            for(char j : arr){
                check[j-97]++;
            }
            int result = 0; 
            for(int j = 0; j < 26 ; j++){
                if(check[j] > 2){
                    result+=2;
                }
                else{
                    result+=check[j];
                }
            }
            System.out.println(result/2);
            
        }
        
        
        
        
   }
	
}  
 