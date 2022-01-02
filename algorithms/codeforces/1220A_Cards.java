import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class A_1220 {
 
	static BufferedReader br;
	
	public static void main(String[] args) throws IOException{
		
		br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		char[] arr = br.readLine().toCharArray();
		int r_count = 0;
		int n_count = 0;
		
		for(int i = 0; i < arr.length ; i++){
		    if(arr[i] == 'r'){
		        r_count++;
		    }   
		    else if(arr[i] == 'n'){
		        n_count++;
		    }   
		}
		
		StringBuilder stb = new StringBuilder();
		
		for(int i = 0 ; i < n_count ;i++){
		    stb.append(1+" ");
		}
		for(int i = 0 ; i < r_count ;i++){
		    stb.append(0+" ");
		}
		stb.setLength(stb.length()-1);
		System.out.println(stb);
	}
	
} 