import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class A_1627A {
 
	static BufferedReader br;
	
	static int toInt(String msg){
	    return Integer.parseInt(msg);
	}
	
	public static void main(String[] args) throws IOException{
		
		br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = toInt(br.readLine());
        
        for(int k = 0 ; k < t ; k++){
            
            String[] arr = br.readLine().split("");
            
            Arrays.sort(arr);
            
            
            System.out.println(String.join("",arr));
            
        }
        
        

	}
	
}  
