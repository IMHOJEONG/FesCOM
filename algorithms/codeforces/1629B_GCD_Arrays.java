import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class B_1629 {
 
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
            
            if(a==b){
                if(a==1){
                    System.out.println("NO");
                }
                else{
                    System.out.println("YES");
                }
            } 
            else{
                int result = 0;
                
                if(a%2 != 0 && b%2 !=0){
                    int val = (b-a+1) / 2;
                    
                    int even = val;
                    int odd = val+1;
                    odd -= c;
                    if(odd <= 0){
                        System.out.println("YES");
                    }
                    else{
                        System.out.println("NO");
                    }
                    
                }
                else if(a%2 == 0 && b%2 ==0){
                    int val = (b-a+1) / 2;
                    
                    int even = val+1;
                    int odd = val;
                    odd -= c;
                    if(odd <= 0){
                        System.out.println("YES");
                    }
                    else{
                        System.out.println("NO");
                    }
                    
                }
                else{
                    int val = (b-a+1) / 2;
                    
                    int even = val;
                    int odd = val;
                    odd -= c;
                    if(odd <= 0){
                        System.out.println("YES");
                    }
                    else{
                        System.out.println("NO");
                    }
                }
                
                
                
            }
           
           
           
           
            
        }
        
        

	}
	
}  
