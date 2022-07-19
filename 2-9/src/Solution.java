
public class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int [queries.length];
        int[][] numbers = new int[columns][rows];
        
        for(int i = 0; i< rows; i++) {
        	for(int j = 0; j<columns; j++) {
        		numbers[j][i] = (i*columns) + j +1;
        	}
        }
        

        
        for(int i = 0; i<queries.length; i++) {
            int min = rows  * columns;
            int k = queries[i][3] - queries[i][1];
            int z = queries[i][2] - queries[i][0];

            int temp1 = 0;
            int temp2 = 0;
            
        	temp1 = numbers[queries[i][1] - 1 ][queries[i][0] - 1];
        	
        	if(temp1 <= min) min = temp1;
         
        	for(int x = 1; x<=k; x++) {
        		temp2 = numbers[queries[i][1] -1 + (x)][queries[i][0] -1 ];
        		numbers[queries[i][1] -1 + (x)][queries[i][0] -1 ]  = temp1;
        		temp1 = temp2;
        		if(temp1 <= min) min = temp1;
        	}
        	
        	for(int x =1; x<=z; x++) {
        		temp2 = numbers[queries[i][3]-1][queries[i][0] -1 +(x)];
        		numbers[queries[i][3]-1][queries[i][0] -1 +(x)] = temp1;
        		temp1 = temp2;
        		if(temp1 <= min) min = temp1;
        	}
        	
        	for(int x = 1; x<=k; x++) {
        		temp2 = numbers[queries[i][1] -1 + (k-x)][queries[i][2] -1 ];
        		numbers[queries[i][1] -1 + (k-x)][queries[i][2] -1 ]  = temp1;
        		temp1 = temp2;
        		if(temp1 <= min) min = temp1;
        	}
        	
        	for(int x =1; x<=z; x++) {
        		temp2 = numbers[queries[i][1]-1][queries[i][0] -1 +(z-x)];
        		numbers[queries[i][1]-1][queries[i][0] -1 +(z-x)] = temp1;
        		temp1 = temp2;
        		if(temp1 <= min) min = temp1;
        	}
        	
        
            			
            System.out.println("min = " + min);
            answer[i] = min;
        }

          
        return answer;
        
    }

    public static void main(String[] args) {
		Solution s = new Solution();
//		int rows = 6;
//		int columns = 6;
//		int [][] queries = {{2,2,5,4}, {3,3,6,6}, {5,1,6,3}};
		
//		int rows = 3;
//		int columns = 3;
//		int [][] queries = {{1,1,2,2}, {1,2,2,3},{2,1,3,2}};
		
		int rows = 100; 
		int columns = 97;
		int[][] queries = {{1,1,100,97}};
		
		s.solution(rows, columns, queries);
	}
}
