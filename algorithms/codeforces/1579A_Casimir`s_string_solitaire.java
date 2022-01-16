import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class A_1579 {
 
	static BufferedReader br;
	
	static int toInt(String msg){
	    return Integer.parseInt(msg);
	}
	
	public static void main(String[] args) throws IOException{
		
		br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = toInt(br.readLine());
        
        for(int i = 0 ; i < t ; i++){
            
            char[] arr = br.readLine().toCharArray();
            int[] result = new int[3];
            for(int j = 0 ; j < arr.length ; j++){
            
                result[(arr[j]-65)]++;
            
            }
            
            if(result[1] == result[0]+result[2]){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
                
            }
            
            
                
            
        }
        
        

	}
	
}  
