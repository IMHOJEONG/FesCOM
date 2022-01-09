import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class A_1462 {
 
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
            
            int[] arr = new int[n];
            
            int[] result = new int[n];
            int start = 0;
            int end = n-1;
            for(int j = 0 ; j < n ; j++){
                
                int bn = toInt(stk.nextToken());
                
                arr[j] = bn;

            }
            for(int j = 0 ; j < n ; j++){
                
                
                if(j % 2 == 0){
                    result[j] = arr[start]; 
                    start++;
                }
                else{
                    result[j] = arr[end];        
                    end--;
                }
            
            }
            
            StringBuilder stb = new StringBuilder();
            
            for(int j = 0 ; j < n ; j++){
                stb.append(result[j]+" ");
            }
            stb.setLength(stb.length()-1);
            
            System.out.println(stb);
            
        }
        

	}
	
}  
