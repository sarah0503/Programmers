import java.util.ArrayList;
import java.util.stream.IntStream;

public class Solution {
	public int solution (int numbers[]) {
		int answer = 45;
		int sum =  IntStream.of(numbers).sum();
		answer -= sum;
		System.out.println(answer);
		return answer;
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		int numbers[] = {5,8,4,0,6,7,9};
		s.solution(numbers);
	}
}
