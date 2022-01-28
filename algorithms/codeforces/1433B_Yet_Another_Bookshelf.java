import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class B_1433 {
 
	static BufferedReader br;
	
	static int toInt(String msg){
	    return Integer.parseInt(msg);
	}
	
	public static void main(String[] args) throws IOException{
		
		br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = toInt(br.readLine());
        
        for(int k = 0; k < t  ; k++){
             
            int size = toInt(br.readLine());
            String[] result = br.readLine().split(" ");
            
            int left = -1;
            int right = -1;
            for(int i = 0 ; i < size ; i++){
               
                if(result[i].equals("1")){
                    left = i;
                    break;
                }
            }
            for(int i = size-1 ; i >= 0 ; i--){
               
                if(result[i].equals("1")){
                    right = i;
                    break;
                }
                
            }
            int val = 0;
            for(int i = left ; i <= right ; i++){
               
                if(result[i].equals("0")){
                    val++;
                }
                
            }
            
            
            System.out.println(val);
          
        }    
       
	}
	
}  
 