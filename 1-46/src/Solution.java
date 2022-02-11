
public class Solution {
	
    public long solution(long n) {
        long answer = -1;
        float temp = (float) Math.sqrt(n);
        if(temp - (int)temp == 0.0) {
        	answer = (long)( Math.pow(temp+1, 2));
        }
        return answer;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution s = new Solution();
		long answer = s.solution(144);
		System.out.println(answer);
		answer = s.solution(42);
		System.out.println(answer);
	}

}
