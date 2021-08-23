class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0,0};
        int count = 6;
        int unknown = 0;
        for(int i = 0; i<count; i++) {
        	if(lottos[i] == 0) unknown ++;
        }
        int min = 7; 
        int max = 0;
        for(int i = 0; i<count; i++) {
        	int now = lottos[i];
        	for(int j = 0; j<count ; j++) {
        		if(now == win_nums[j]) min--;
        	}
        }

        if(min > 6)min = 6;
        max = min - unknown;
        if(max < 1) max = 1;
        answer[0] = max;
        answer[1] = min;
        return answer;
        
    }
    
    public static void main(String[] args) {
		Solution s = new Solution();
		int[] lottos = {0,0,0,0,0,0};
		int[] win_nums = {31,10,45,1,6,19};
		int []answer  = s.solution(lottos, win_nums);
		System.out.println(answer[0]);
		System.out.println(answer[1]);
	}
}

