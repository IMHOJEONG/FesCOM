import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class B_1325 {
 
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
            
            int[] arr = new int[2*n];
            
            for(int j = 0 ; j < 2 * n ; j++){
                
                arr[j] = toInt(stk.nextToken());
                
            }
            Arrays.sort(arr);
            for(int j = 0 ; j < 2*n; j+=2){
                
                int temp = 0; 
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                
            }
            
            int temp2 = 0; 
            temp2 = arr[0];
            arr[0] = arr[2*n-1];
            arr[2*n-1] = temp2;
            
            
            
            StringBuilder stb = new StringBuilder();
            for(int j = 0 ; j < 2*n; j++){
                
                stb.append(arr[j]+" ");

            }
            stb.setLength(stb.length()-1);
            
            System.out.println(stb);
            
            
     
            
        }
        

	}
	
}  
