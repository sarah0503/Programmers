
class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int length = absolutes.length;
        for(int i = 0 ;i < length; i++) {
        	int now = 0;
        	if(signs[i] == true) now = absolutes[i];
        	else now = -absolutes[i];
        	answer += now;
        }

        return answer;
    }
}
