
public class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};
        int lcm = 1; //최소공배수 
        int gcd = 0; //최대공약
        int tempN = n;
        int tempM = m;
    	int i = 2; 
        while(true) {
    		if(i>n || i>m) {
    			lcm *= n;
    			lcm *= m;
    			System.out.println("Qn");
    			break;
    		}
        	if((n%i) == 0 && (m%i) == 0) {
        		System.out.println("뿡");
        		lcm *= i;
        		n /= i;
        		m /=i;
        		System.out.println(lcm);
        		i=1;
        	}
        	i++;
        }
        
        System.out.println(lcm);
        return answer;
    }
    
    public static void main(String[] args) {
		Solution s = new Solution();
		s.solution(3,12);
	}
}
