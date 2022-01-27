import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class A_1567 {
 
	static BufferedReader br;
	
	static int toInt(String msg){
	    return Integer.parseInt(msg);
	}
	
	public static void main(String[] args) throws IOException{
		
		br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = toInt(br.readLine());
        
        for(int k = 0; k < t  ; k++){
             
            int size = toInt(br.readLine());
            char[] arr = br.readLine().toCharArray();
            char[] result = new char[size];
            
            for(int i = 0 ; i < arr.length ; i++){
                
                if(arr[i] == 'U'){
                    result[i] = 'D';
                }
                else if(arr[i] == 'D'){
                    result[i] = 'U';
                }
                if(arr[i] == 'L'){
                    result[i] = 'L';
                }
                if(arr[i] == 'R'){
                    result[i] = 'R';
                }
            }
            
            System.out.println(String.valueOf(result));
          
        }    
       
        
    
        

	}
	
}  
 