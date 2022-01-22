import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class B_1560 {
 
	static BufferedReader br;
	
	static int toInt(String msg){
	    return Integer.parseInt(msg);
	}
	
	public static void main(String[] args) throws IOException{
		
		br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = toInt(br.readLine());
        
        for(int k = 0 ; k < t ; k++){
            
            StringTokenizer stk = new StringTokenizer(br.readLine());
        
            int a = toInt(stk.nextToken());
            int b = toInt(stk.nextToken());
            int c = toInt(stk.nextToken());
            
            
            int min = Math.min(a,b);
            int max = Math.max(a,b);
            
            int diff = max - min;
            
            int all = diff*2;
            
            
            if(1 <= min && max <= all &&
            1 <= c && c <= all){
               
               if(c <= diff){
                    System.out.println(c+diff);
               }  
               else{
                    System.out.println(c-diff);
               }
                 
            }
            else {
                System.out.println(-1);
            }
            
            
            
              
             
           
           
           
           
            
        }
        
        

	}
	
}  
