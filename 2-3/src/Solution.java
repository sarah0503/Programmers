
public class Solution {
	public long solution(long w, long h) {
		long answer = 1;
		answer = (w * h) - (w + h - gcd(w, h));
		return answer;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int w = 8;
		int h = 12;
		System.out.println(s.solution(w, h));
	}

	public long gcd(long w, long h) {
		long n;
		if (w < h) {
			long temp = w;
			w = h;
			h = temp;
		}
		while (h != 0) {
			n = w % h;
			w = h;
			h = n;
		}
		return w;
	}

}
