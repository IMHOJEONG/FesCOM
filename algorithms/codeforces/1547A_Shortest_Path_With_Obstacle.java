import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class A_1547 {
 
	static BufferedReader br;
	
	static int toInt(String msg){
	    return Integer.parseInt(msg);
	}
	
	public static void main(String[] args) throws IOException{
		
		br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = toInt(br.readLine());
        
        for(int k = 0 ; k < t ; k++){
            br.readLine();
            
            int[] arr1 = new int[3]; 
            int[] arr2 = new int[3];
            for(int j = 0 ; j < 3 ;j++){
                
                StringTokenizer stk = new StringTokenizer(br.readLine());
                int a = toInt(stk.nextToken());
                int b = toInt(stk.nextToken());
                arr1[j] = a;
                arr2[j] = b;
            }
            
            int result = Math.abs(arr1[1]-arr1[0])+Math.abs(arr2[1]-arr2[0]);
            
            if(arr1[0] == arr1[1] && arr1[1] == arr1[2]){
                if(arr2[0] <= arr2[2] && arr2[2] <= arr2[1]){
                    result+=2;
                }
                else if(arr2[0] >= arr2[2] && arr2[2] >= arr2[1]){
                    result+=2;
                }
            }
            else if(arr2[0] == arr2[1] && arr2[1] == arr2[2]){
                if(arr1[0] <= arr1[2] && arr1[2] <= arr1[1]){
                    result+=2;
                }
                else if(arr1[0] >= arr1[2] && arr1[2] >= arr1[1]){
                    result+=2;
                    
                }
            }
            
            System.out.println(result);
            
            
            
            
        }
        
        

	}
	
}  
