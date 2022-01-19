
public class Solution {
	
    public long solution(int price, int money, int count) {
        long answer = -1;
        long total = 0;
        for(int i = 1; i<count+1; i++) {
        	total += i*price;
        }
        answer = total - money;
        if(answer <= 0) return 0;
        return answer;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price = 3;
		int money = 20;
		int count = 4;
		Solution s = new Solution();
		System.out.println(s.solution(price, money, count));
	}

}
