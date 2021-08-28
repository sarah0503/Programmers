import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int [commands.length] ;
        int totalcount = 0;
        for(int i = 0 ;i <(commands.length);i++) {
        	int x = commands[i][0];
        	int y = commands[i][1];
        	int z = commands[i][2];
            int[] now = new int [y-x+1];
        	int count = 0; 
        	for(int j = (x-1) ; j<=y-1; j++) {
        		now[count] = array[j];
        		count ++;
        	}
        	Arrays.sort(now);
        	answer[totalcount] = now[z-1];
        	totalcount ++;
        }
        return answer;
    }
    

}

