
class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int sum = 0;
        int day = 0;
        String[] Weeks = {  "THU", "FRI","SAT", "SUN", "MON", "TUE", "WED" };
        int [] lastDays = { 31,29,31,30,31,30,31,31,30,31,30,31};
        
        
        if(a == 1) {
        	//firstDay = 5;
        	day = (b % 7)  ;
        	answer = Weeks[day];
        }
        else {
        	a--;
            for(int i = 0; i<a; i++) {
            	sum += lastDays[i];
            }
            b = b + sum;
            day = (b % 7)  ;
            answer = Weeks[day];
            
        }
        return answer;
    }
    
    public static void main(String[] args) {
		Solution s = new Solution();
		String answer = s.solution(5, 24);
		System.out.println(answer);
	}
}