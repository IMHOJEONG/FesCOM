import java.util.*;
class Solution {
    
    public int manhathon(int[] before, int[] after) {
        return Math.abs(before[0]-after[0]) + Math.abs(before[1]-after[1]);
    }
    static int[] dr = {-2,2,0,0,-1,-1,+1,+1};
    static int[] dc = {0,0,-2,2,-1,+1,+1,-1};
    
    public boolean check(String[] room, ArrayList<int[]> players) {
        
        if(players.size() == 0){
            return true;
        }
        
        int size = players.size();
        
        for(int i = 0; i < size-1 ; i++){
            
            int[] before = players.get(i);
            
            for(int j = i+1; j < size ; j++){
                
                int[] after = players.get(j);
                
                int dist = manhathon(before, after);
                
                if(dist > 2)
                    continue;
                
                if(dist < 2) {
                    return false;
                }
                
                if(dist == 2){
                    
                    for(int move = 0 ; move < 8 ; move++){
                        
                        int nr = before[0] + dr[move]; 
                        int nc = before[1] + dc[move];
                        
                        if(nr == after[0] && nc == after[1]){
                            if(move == 0){
                                if(room[before[0]-1].charAt(before[1]) != 'X'){
                                    return false;
                                }
                            }
                            else if(move == 1){
                                if(room[before[0]+1].charAt(before[1]) != 'X'){
                                    return false;
                                }
                            }
                            else if(move == 2){
                                if(room[before[0]].charAt(before[1]-1) != 'X'){
                                    return false;
                                }
                            }
                            else if(move == 3){
                                if(room[before[0]].charAt(before[1]+1) != 'X'){
                                    return false;
                                }
                            }
                            else if(move == 4){
                                if(room[before[0]-1].charAt(before[1]) != 'X' || room[before[0]].charAt(before[1]-1) != 'X'){
                                    return false;
                                }
                            }
                            else if(move == 5){
                                if(room[before[0]-1].charAt(before[1]) != 'X' || room[before[0]].charAt(before[1]+1) != 'X'){
                                    return false;
                                }
                            }
                            else if(move == 6){
                                if(room[before[0]+1].charAt(before[1]) != 'X' || room[before[0]].charAt(before[1]+1) != 'X'){
                                    return false;
                                }
                            }
                            else if(move == 7){
                                if(room[before[0]+1].charAt(before[1]) != 'X' || room[before[0]].charAt(before[1]-1) != 'X'){
                                    return false;
                                }
                            }
                        }
                        
                    } 
                    
                }
                
                
            }    
        }
        return true;
        
    }
    
    public int[] solution(String[][] places) {
        int[] answer = new int[5];
        
        int waitRoom_count = places.length;
        for(int i = 0 ; i < waitRoom_count ; i++){
            
            String[] room = places[i];
            ArrayList<int[]> players = new ArrayList<>();
            
            for(int j = 0 ; j < room.length ; j++){
                
                String str = room[j];
                
                for(int k = 0 ; k < str.length() ; k++){
                    
                    char point = str.charAt(k);
                    
                    if(point == 'P') {
                        players.add(new int[]{j,k});
                    }
                }
                
            }
            
            if(check(room, players)){
                answer[i] = 1;
            }
            else {
                answer[i] = 0;   
            }
            
        }
        
        
        return answer;
    }
}