import java.util.Arrays;

public class Solution {

    int total = 0;
    int maxCount = 0;
    boolean check = false;
    
    public int solution(int[] d, int budget) {
        int answer = 0;
        maxCount = d.length-1;
        for(int i =0; i<d.length; i++) {
        	total += d[i];
        }
        
        if(budget >= total) {
        	return d.length;
        }
        
        //배열정렬
        Arrays.sort(d);
        
        while(check == false) {
        		Sub(d);
            	Check(budget);
        }
        
        return maxCount +1;
    }
    
	public void Sub ( int[] target) {
    	total -= target[maxCount];
    	maxCount --;
    	System.out.println(total + " " + maxCount);
    }
	
	public void Check(int budget) {
		if(budget >= total)
			check = true;
		else
			check = false;
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int[] d = {1,3,2,5,4};
		int budget = 9;
		System.out.println(
				s.solution(d, budget));
	}
	

}
