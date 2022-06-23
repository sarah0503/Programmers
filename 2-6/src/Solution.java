import java.util.PriorityQueue;

public class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(Integer i : scoville) {
        	queue.add(i);
        }
        int spicy = 0;
        while (queue.peek() < K){
        	if(queue.size() == 1) return -1;
            spicy = queue.poll() + (queue.poll()*2);
            queue.add(spicy);
            answer ++;
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
		int [] scoville = {1,2,3,9,10,12};
		int k = 7;
		Solution s= new Solution();
		int answer = s.solution(scoville, k);
		System.out.println(answer);
	}
}
