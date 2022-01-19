
public class Solution {
	
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        int[] arr1Bin = new int[arr1.length];
        int [] arr2Bin = new int [arr2.length];
        
        //이진법으로 변환
        for(int i = 0; i < arr1.length; i++) {
        	
        }
        return answer;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n = 6;
//		int [] arr1 = {46,33,33,22,31,50};
//		int [] arr2 = {27,56,19,14,14,10};
		
		int n = 5;
		int [] arr1 = {9,20,28,18,11};
		int [] arr2 = {30,1,21,17,28};
		
		Solution s = new Solution();
		String [] answer = s.solution(n, arr1, arr2);
		for(int i = 0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
		
	}

}
