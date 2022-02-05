import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class A_1400 {
   
   
   public static int toInt(String msg){
       return Integer.parseInt(msg);
   }
   public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = toInt(br.readLine());
        
        for(int i = 0; i < t ; i++){
            
            int n = toInt(br.readLine());
            String test = br.readLine();
            char[] s = test.toCharArray();
            
            StringBuilder stb = new StringBuilder();
            
            int at = 0;
            for(int j = 0; j < n ; j++){
                
                    
                    stb.append(test.substring(j,j+n).charAt(at));
                    at++;
                    
                
                
            }
            System.out.println(stb.toString());
            
        }
        
        
   }
	
}  
 