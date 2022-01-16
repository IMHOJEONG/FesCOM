import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class A_822 {
 
	static BufferedReader br;
	
	static int toInt(String msg){
	    return Integer.parseInt(msg);
	}
	
    static int fac(int n){
        if(n==1) return 1;
        
        return n*fac(n-1);
    }
	public static void main(String[] args) throws IOException{
		
		br = new BufferedReader(new InputStreamReader(System.in));
        int index = 1;
        StringBuilder stb = new StringBuilder();
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int A = toInt(stk.nextToken());
        int B = toInt(stk.nextToken());
        int min = Math.min(A,B);
        
        System.out.println(fac(min));
        

	}
	
}  
