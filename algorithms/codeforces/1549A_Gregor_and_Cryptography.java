import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class A_1549 {
 
	static BufferedReader br;
	
	static int toInt(String msg){
	    return Integer.parseInt(msg);
	}
	
	public static void main(String[] args) throws IOException{
		
		br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = toInt(br.readLine());
        
        for(int k = 0 ; k < t ; k++){
            
            int P = toInt(br.readLine());
            
            int target = P-1;
            
            if(target % 2 == 0){
                System.out.println(2+" "+(target));
            }
            else{
                target = target-1;
                System.out.println(2+" "+(target));
            }
            
           
            
        }
        
        

	}
	
}  
