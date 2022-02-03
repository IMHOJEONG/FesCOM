import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class A_1372 {
 
	static BufferedReader br;
	
	static int toInt(String msg){
	    return Integer.parseInt(msg);
	}
	
	public static void main(String[] args) throws IOException{
		
		br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = toInt(br.readLine());
        
        for(int i = 0; i < t ; i++){
            
            int n = toInt(br.readLine());
            int[] arr = new int[n];
            int val = 1;
            for(int j = 0 ; j < n ; j++){
                arr[j] = val;
            }
            
            StringBuilder stb = new StringBuilder();
            for(int j = 0 ; j < n ; j++){
                stb.append(arr[j] +" ");
            }
            stb.setLength(stb.length()-1);
            System.out.println(stb);
    
        }
	}
	
}  
 