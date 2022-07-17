
public class Solution {

	public int solution(String s) {
		int answer = -1;

		String str = s;
		String newStr = "";
		int count = 0;

		System.out.println(str);
		while (true) {
			str = delStr(str);
			System.out.println(str);
			if (str == "")
				return 1;
			if (str.equals("-1"))
				return 0;

			if (count == -1)
				break;
		}
		return answer;
	}

	String delStr(String str) {
		String string = "-1";
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				if (str.length() == 0) {
					string = "";
					break;
				}
				string = str.substring(0, i) + str.substring(i + 2);
				break;
			}

		}
		return string;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int answer = s.solution("baabaa");
		System.out.println("answer = " + answer);
	}
}
