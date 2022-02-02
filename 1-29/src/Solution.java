import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Solution {
	   public int[] solution(int [] arr) {
	        int [] answer = {};
	        LinkedList <Integer> list = new LinkedList<Integer>();
	        list.add(arr[0]);
	        for (int i = 1; i<arr.length;i++) {
	        	if(arr[i]!= list.getLast()) {
	        		list.add(arr[i]);
	        	}
	        }
	        Integer[] intArray = list.toArray(new Integer [list.size()]);
	        answer = Arrays.stream(intArray).mapToInt(Integer::intValue).toArray();
	        return answer;
	    }
	   
	   
	   public static void main(String[] args) {
		   Solution s = new Solution();
		   int [] arr = {1,1,3,3,0,1,1};
		  int[] newArr = s.solution(arr);
	}
}
