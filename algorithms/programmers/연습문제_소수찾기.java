class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int target = 2 ; target <= n ; target++){
               
            if(target == 2){
                answer++;
                //System.out.println(target);
                continue;
            }
            
            double end = Math.sqrt(target);
            boolean isok = true;
            
            for(int i = 2; i <= end ; i++){
                if(target % i == 0){
                    isok = false;
                    break;
                }
            }
            if(isok){
                answer++;
                //System.out.println(target);
            }
            
        }
        
        
        return answer;
    }
}