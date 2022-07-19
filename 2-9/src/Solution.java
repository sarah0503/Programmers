
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
            int min = rows  * columns;
            int k = queries[i][3] - queries[i][1];
            int z = queries[i][2] - queries[i][0];

            int temp1 = 0;
            int temp2 = 0;
            
        	temp1 = numbers[queries[i][0] - 1][queries[i][1] - 1 ];
            System.out.println();
        	
        	if(temp1 <= min) min = temp1;
            
            for (int x = 1; x < k+1; x ++) {
            	temp2 = numbers[queries[i][0] - 1][queries[i][1] - 1 + (x)];
            	numbers[queries[i][0] ][queries[i][1] - 1 + (x)] = temp1;
            	if(temp1 <= min) min = temp1;
            	temp1 = temp2;
            }
            
            
            for (int y = 1; y<z+1; y++) {
            	temp2 = numbers[queries[i][0] - 1 +(y)][queries[i][3] - 1 ];
            	numbers[queries[i][0]- 1 +(y)][queries[i][3] - 1 ] = temp1;
            	if(temp1 <= min) min = temp1;
            	temp1 = temp2;
            			
            }
            
            for (int x = 1; x < k+1; x ++) {
            	temp1 = numbers[queries[i][2]- 1][queries[i][1]- 1 + (k-x)];
            	numbers[queries[i][2]- 1][queries[i][1] - 1 + (k-x)] = temp1;
            	if(temp1 <= min) min = temp1;
            	temp1 = temp2;
            }
            
            for (int y = 1; y<z+1; y++) {
            	temp1 = numbers[queries[i][0]- 1 +(z-y)][queries[i][1] - 1] ;
            	numbers[queries[i][0] - 1 +(z-y)][queries[i][1] - 1 ] = temp1;
            	if(temp1 <= min) min = temp1;
            	temp1 = temp2;
            			
           
        }

            System.out.println("KKKKKKK");
            
            for(int q = 0; q< columns; q++) {
            	for(int j = 0; j<rows; j++) {
            		System.out.println(numbers[q][j]);
            	}
            	System.out.println();
            }

            
            System.out.println("min " + min);
        }
        return answer;
        
    }

    public static void main(String[] args) {
		Solution s = new Solution();
		int rows = 6;
		int columns = 6;
		int [][] queries = {{2,2,5,4}, {3,3,6,6}, {5,1,6,3}};
		
		s.solution(rows, columns, queries);
	}
}
