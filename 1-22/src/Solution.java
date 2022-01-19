
public class Solution {
	
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxWidth = 0;
        int maxHeight = 0;
        for(int i = 0; i < sizes.length; i++) {
        	if(sizes[i][0] > sizes[i][1]) {
        		int temp = sizes[i][0];
        		sizes[i][0] = sizes[i][1];
        		sizes[i][1] = temp;
        	}
//        	for(int j = 0; j<sizes[0].length; j++) {
//        		
//        	}
        	if(sizes[i][0] > maxWidth) maxWidth = sizes[i][0];
        	if(sizes[i][1] > maxHeight ) maxHeight = sizes[i][1];
        }
        
        answer = maxWidth * maxHeight;
        
        
        System.out.println(maxWidth);
        System.out.println(maxHeight);
        return answer;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution s = new Solution();
		int [] [] sizes = { {14,4}, {19,6}, {6,16}, {18,7}, {7,11}};
		System.out.println(s.solution(sizes));
	}

}
