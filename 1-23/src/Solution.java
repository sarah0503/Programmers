
public class Solution {
	
    public int solution(int n) {
        
        for(int i = 1; i<n; i++) {
        	if(n%i == 1)
        		return i;
        }
        return 0;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution s = new Solution();
		System.out.println(s.solution(10));
		
	}

}
