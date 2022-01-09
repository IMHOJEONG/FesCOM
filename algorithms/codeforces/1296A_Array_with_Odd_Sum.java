import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class A_1296 {
 
	static BufferedReader br;
	
	static int toInt(String msg){
	    return Integer.parseInt(msg);
	}

	public static void main(String[] args) throws IOException{
		
		br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = toInt(br.readLine());
        
        for(int i = 0 ; i < t ; i++){
            
            int n = toInt(br.readLine());
            
            StringTokenizer stk = new StringTokenizer(br.readLine());

            int odd = 0;
            int even = 0; 
            for(int j = 0 ; j < n ; j++){
                
                int bn = toInt(stk.nextToken());
                
                if(bn % 2 != 0){
                    odd++;
                }
                else{
                    even++;
                }
            }
            
            if(odd == n || even == n){
                if(odd == n && n%2 != 0 ){
                    
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                    
                }
            }
            else{
                System.out.println("YES");
            }
            
            
     
            
        }
        

	}
	
}  
