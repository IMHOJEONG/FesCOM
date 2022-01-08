import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class A_1370 {
 
	static BufferedReader br;
	
	static int toInt(String msg){
	    return Integer.parseInt(msg);
	}
	
	static int GCD(int a, int b){
	    if(b==0) return a;
	    
	    return GCD(b, a%b);
	}
	
	public static void main(String[] args) throws IOException{
		
		br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = toInt(br.readLine());
        
        for(int i = 0 ; i < t ; i++){
            
            int n = toInt(br.readLine());
            
            int val = n % 2 == 0 ? n : n-1;
            
            int a = val / 2;
            
            int b = val;
            
            System.out.println(GCD(a,b));
            
        }
        

	}
	
}  