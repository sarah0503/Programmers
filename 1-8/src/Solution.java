
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int length = nums.length;
       for(int i = 0; i<length; i++) {
    	   for(int j = 0; j<length; j++) {
    		   if(j==i) break;
    		   for(int k = 0; j<length; k++) {
    			   if(k==i || k==j) break;
    			   int now = nums[j] + nums[i] + nums[k];
    			   if(isPrime(now)) answer ++;
    		   }
    	   }
       }

        return answer;
    }

	private boolean isPrime(int now) {
		for(int i = 2; i<now ; i++) {
			if(now%i == 0) return false;
		}
		return true;
	}
}