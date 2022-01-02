// https://programmers.co.kr/learn/courses/30/lessons/12901#
class Solution {
    
    static int[] months = {31,29, 31,30,31,30,31,31,30,31,30,31};
    static String[] days = {"SUN","MON","TUE", "WED", "THU", "FRI", "SAT"};
    public String solution(int a, int b) {
        
        int start = 5; 
        
        for(int i = 0; i < a ; i++){
            
            int leftDays = months[i];
            int day = 0;    
            for(int j = 0; j < leftDays ; j++){
                
                if(day == b-1 && i == a-1){

                   return days[start];
                }

                day = day + 1;
                start = (start+1) % 7;
            }
        
        }
        return "FRI";
    }
}