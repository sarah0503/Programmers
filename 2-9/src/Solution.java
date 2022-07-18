
public class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = {};
        int[][] numbers = new int[columns][rows];
        
        for(int i = 0; i< columns; i++) {
        	for(int j = 0; j<rows; j++) {
        		numbers[i][j] = (i*rows) + j +1;
        	}
        }
        
        for(int i = 0; i<queries.length; i++) {
        	System.out.println("s");
        }
        
        return answer;
    }

    public static void main(String[] args) {
		Solution s = new Solution();
		int rows = 6;
		int columns = 5;
		int [][] queries = {{2,2,5,4}, {3,3,6,6}, {5,1,6,3}};
		
		s.solution(rows, columns, queries);
	}
}
