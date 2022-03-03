import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class A_1541 {
   
   public static int toInt(String msg){
       return Integer.parseInt(msg);
   }
   
   public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = toInt(br.readLine());
        
        for(int i = 0 ; i < T; i++){
        
            int N = toInt(br.readLine());
            StringBuilder stb = new StringBuilder();
            
            if(N % 2 == 0){
                int index = 0; 
                for(int j = 2 ; index < (N/2) ; j+=2, index++){
                
                    stb.append(j+" ");
                    stb.append((j-1)+" ");
                    
                }
                
            }
            else {
                
                
                stb.append("3 1 2 ");
                
                int size = N-3;
 
                int index =0; 
                for(int j = 5; index < (size/2) ; j+=2, index++){
                    stb.append(j+" ");
                    stb.append((j-1)+" ");
                }
                
                
            }
            
            System.out.println(stb);
        }
        
        
        
   }
	
}  
 