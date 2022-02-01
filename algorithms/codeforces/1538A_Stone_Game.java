import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class A_1538 {
 
	static BufferedReader br;
	
	static int toInt(String msg){
	    return Integer.parseInt(msg);
	}
	
	public static void main(String[] args) throws IOException{
		
		br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = toInt(br.readLine());
        
        for(int i = 0; i < t ; i++){
            
            int n = toInt(br.readLine());
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            
            for(int j = 0; j < n ; j++){
                arr[j] = toInt(stk.nextToken());
            }
            
            double middle = (n%2!=0) ? (n / 2)+1 : n/2 + 0.5;
            int minIndex = -1; 
            int min = Integer.MAX_VALUE;
            int maxIndex = -1;
            int max = Integer.MIN_VALUE;
            for(int j = 0 ; j < n ; j++){
                
                if(min > arr[j]){
                    min = arr[j];
                    minIndex = j;
                }
                
                if(max < arr[j]){
                    max = arr[j];
                    maxIndex = j;
                }
            }
            minIndex+=1;
            maxIndex+=1;
            if(minIndex <= middle && maxIndex <= middle) {
                System.out.println(Math.max(maxIndex,minIndex));
            }
            else if(minIndex >= middle && maxIndex >= middle){
                System.out.println((arr.length+1) - Math.min(minIndex,maxIndex));
                
            }
            else{
                int min1 = Math.min(maxIndex, minIndex);
                int min2 = arr.length+1 - min1;
                int max1 = Math.max(maxIndex, minIndex);
                int max2 = max1;
                int left = min1 + ((arr.length+1) - max1);
                int result = Math.min(min2,Math.min(max2,left));
                
                System.out.println(result);
                
            }

        }
	}
	
}  
 