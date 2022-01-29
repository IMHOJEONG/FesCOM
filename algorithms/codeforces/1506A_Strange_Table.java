import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class A_1506 {
 
	static BufferedReader br;
	
	static int toInt(String msg){
	    return Integer.parseInt(msg);
	}
	
	public static void main(String[] args) throws IOException{
		
		br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = toInt(br.readLine());
        
        for(int k = 0; k < t  ; k++){
             
            StringTokenizer stk = new StringTokenizer(br.readLine());
            
            long n = Long.parseLong(stk.nextToken());
            long m = Long.parseLong(stk.nextToken());
            long x = Long.parseLong(stk.nextToken());
                 
            long val = 0;
            
            long div = x / n;
            long left = x % n;
            
            if(left == 0){
                
                val += div + (n-1) * m;
                
                // val += (left-1) * m;
            }
            else {
                val += div+1;
                
                val += (left-1) * m;
            }
            
            System.out.println(val);
          
        }    
       
	}
	
}  
 