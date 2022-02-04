import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

// 1: 5분 20초
public class BOJ_2920{
   
   public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] arr = br.readLine().split(" ");
        
        StringBuilder stb = new StringBuilder();
        
        for(String val : arr){
            stb.append(val);
        }
        
        if(stb.toString().equals("12345678")){
            System.out.println("ascending");
        }
        else if(stb.toString().equals("87654321")){
            System.out.println("descending");
        }
        else{
            System.out.println("mixed");
        }
   }
	
}  

 