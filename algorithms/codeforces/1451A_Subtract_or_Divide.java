import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
// 이 문제는 너무 어렵게 생각한듯 - 간단하게 생각하자
public class A_1451 {
 
	static BufferedReader br;
	
	static int toInt(String msg){
	    return Integer.parseInt(msg);
	}
	
	public static void main(String[] args) throws IOException{
		
		br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = toInt(br.readLine());
        
        for(int i = 0 ; i < t ; i++){
            
            int n  = toInt(br.readLine());
            
            int result = 0; 
            // System.out.println("----- "+ n);
            int target = (int)Math.sqrt(n);
            if(n == 1){
                System.out.println(0);  
            }
            else if(n==2){
                System.out.println(1);  
            }
            else if(n == 3){
                System.out.println(2);  
            }
            else if(n%2!=0){
                System.out.println(3);  
            }
            else{
                System.out.println(2);
            }
            
            // System.out.println(result);
            
        }
        
        

	}
	
}  
