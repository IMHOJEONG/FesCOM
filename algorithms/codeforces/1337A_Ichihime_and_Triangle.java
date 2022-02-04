import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class A_1337 {
 
	static BufferedReader br;
	
	static int toInt(String msg){
	    return Integer.parseInt(msg);
	}
	
	public static void main(String[] args) throws IOException{
		
		br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = toInt(br.readLine());
        
        for(int i = 0; i < t ; i++){
            
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int[] arr = new int[4];
            for(int j = 0 ; j < 4 ; j++){
                arr[j] = toInt(stk.nextToken());
            }
            
            
            StringBuilder stb = new StringBuilder();
            stb.append(arr[1] +" ");
            stb.append(arr[2] +" ");
            stb.append(arr[2] +" ");
            stb.setLength(stb.length()-1);
            System.out.println(stb);
    
        }
	}
	
}  