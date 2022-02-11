
public class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        int min = 0;
        if(arr.length == 1) {
        	answer = new int[1];
        	answer[0] = -1;
        	return answer;
        }
		answer = new int[arr.length-1];
        for(int i = 0;i< arr.length;i++) {
        	if(arr[i] < arr[min]) min = i;
        }
        int j = 0;
        for(int i = 0; i<arr.length; i++) {
        	if(i == min) {
        		
        	}
        	else {
        	answer[j] = arr[i];
        	j++;
        	}
        }
        return answer;
    }
    
    public static void main(String[] args) {
		//int[] arr = {4,3,2,1};
		int[] arr = {10};
		Solution s = new Solution();
		int [] answer = s.solution(arr);
		for(int i=0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
	}
}
