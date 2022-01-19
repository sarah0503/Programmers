
public class Solution {
	
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String [n];
        int[][] arr1Bin = new int[n][n];
        int [][] arr2Bin = new int [n][n];
        
        //이진법으로 변환
        for(int i = 0; i < arr1.length; i++) {
        	int a1 = arr1[i];
        	int a2 = arr2[i];
        	System.out.println();
        	for(int j = n-1; j >= 0; j--) {
        		int b = (int) Math.pow(2, j);
        		if(a1 >= b) {
        			a1 -= b;
        			arr1Bin[i][n-j-1] = 1;
        		}
        		else{
        			arr1Bin[i][n-j-1] = 0;
        		}
        		

        		if(a2 >= b) {
        			a2 -= b;
        			arr2Bin[i][n-j-1] = 1;
        		}
        		else{
        			arr2Bin[i][n-j-1] = 0;
        		}
        	}
        }
        
        for (int i = 0; i<n;i ++) {
        	answer[i] = "";
        	for(int j = 0; j<n; j++) {
        		if(arr1Bin[i][j] == 1|| arr2Bin[i][j] == 1) {
        			//answer[i].concat("#");
        			answer[i] = answer[i] + "#";
        		}
        		else {
        			//answer[i].concat(" ");
        			answer[i] = answer[i] + " ";
        		}
        	}
        }
        return answer;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int [] arr1 = {46,33,33,22,31,50};
		int [] arr2 = {27,56,19,14,14,10};
		
//		int n = 5;
//		int [] arr1 = {9,20,28,18,11};
//		int [] arr2 = {30,1,21,17,28};
		
		Solution s = new Solution();
		String [] answer = s.solution(n, arr1, arr2);
		for(int i = 0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
		
	}

}
