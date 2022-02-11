import java.util.ArrayList;

public class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int temp = x; 
        int count = 0;
        ArrayList<Integer> array = new ArrayList<Integer>();
        while(temp !=0){
        	count ++;
        	temp /=10;
        }
        temp = x;
       	for(int i =0; i<count; i++) {
       		array.add(temp%10);
       		temp /= 10;
       	}
       	int sum = array.stream().mapToInt(Integer::intValue).sum();
       	if(x%sum == 0) {
       		answer = true;
       	}
       	
        return answer;
    }

   
   public static void main(String[] args) {
	    
	   Solution s= new Solution();
	   boolean answer = s.solution(12);
	   System.out.println(answer);
}
}
