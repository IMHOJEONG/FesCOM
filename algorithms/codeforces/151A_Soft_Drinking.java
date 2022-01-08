import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class A_151 {
 
	static BufferedReader br;
	
	static int toInt(String msg){
	    return Integer.parseInt(msg);
	}
	
	public static void main(String[] args) throws IOException{
		
		br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer stk = new StringTokenizer(br.readLine());
        
        int n = toInt(stk.nextToken());
        int k = toInt(stk.nextToken());
        int l = toInt(stk.nextToken());
        int c = toInt(stk.nextToken());
        int d = toInt(stk.nextToken());
        int p = toInt(stk.nextToken());
        int nl = toInt(stk.nextToken());
        int np = toInt(stk.nextToken());
        
        int drink = (k*l) / nl;
        
        int limes = c * d;
        
        int salt = p / np;
        
        int answer = Math.min(drink, Math.min(limes, salt)) / n;

        System.out.println(answer);

	}
	
}  