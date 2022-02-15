
public class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new  int [arr1.length][arr1[0].length];
        for(int i = 0; i<arr1.length; i++) {
        	for(int j = 0; j<arr1[0].length; j++) {
        		answer[i][j] = arr1[i][j] + arr2[i][j];
        	}
        }
        return answer;
    }
    
    public static void main(String[] args) {
		Solution s = new Solution();
		int [][] arr1 = {{1},{2}};
		int [][] arr2 = {{3},{4}};
		int [][] answer = s.solution(arr1, arr2);
	}
}
