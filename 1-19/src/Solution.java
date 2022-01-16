import java.util.Arrays;

public class Solution {

    int total = 0;
    int maxCount = 0;
    
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
        
        if(budget < total) {
        	System.out.println(maxCount + " " + total);
        	sub(d);
        	System.out.println(maxCount + " " + total );
        }
        
        return answer;
    }
    
//    public boolean check(int total, int budget, int[] target) {
//    	
//    }
    
	public void sub ( int[] target) {
    	total -= target[maxCount];
    	maxCount --;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int[] d = {1,3,2,5,4};
		int budget = 9;
		s.solution(d, budget);
	}
	

}
