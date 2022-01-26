import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Solution {
	   public int[] solution(int [] arr) {
	        int [] answer = {};
	        //List<Integer> arrayList = Arrays.asList(arr);
	        //Set<int[]> set = new HashSet<> (arrayList);
	        
	        ArrayList <Integer> arrayList = new ArrayList<>(Arrays.asList((Integer[])arr));
	        	
	        Iterator<int[]> it = set.iterator();
	        
	        int i = 0;
	        while(it.hasNext()) {
	        	//answer[i] = it.next();
	        	System.out.println(it.next());
	        	i++;
	        }
	       
	        return answer;
	    }
	   
	   
	   public static void main(String[] args) {
		   Solution s = new Solution();
		   int [] arr = {1,1,3,3,0,1,1};
		  int[] newArr = s.solution(arr);
		  for(int i = 0; i<newArr.length; i++) {
			  //System.out.println(newArr[i]);
		  }
	}
}
