import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList <Integer> arrayList = new ArrayList<Integer> ();
        for(int i = 0; i<arr.length; i++) {
        	if(arr[i]%divisor == 0) {
        		arrayList.add(arr[i]);
        	}
        }
        
        if(arrayList.size() == 0) {
        	arrayList.add(-1);
        }
        
        Collections.sort(arrayList);
        
        int[] answer = new int[arrayList.size()];
        int size = 0;
        for(int temp : arrayList) {
        	answer[size++] = temp;
        }
        
        
        return answer;
    }
    
    public static void main(String[] args) {
		Solution s = new Solution();
		int [] arr = {5,9,1,10};
		int divisor = 5;
		s.solution(arr, divisor);
		}
	
}
