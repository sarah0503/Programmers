import java.util.ArrayList;
import java.util.Iterator;

public class Solution {

	public int solution(String dartResult) {
		int answer = 0;
		int answers[] = new int[3];
		String[] results = dartResult.split("[0-9]");
		ArrayList <String> resultList = new ArrayList <String>();
		
		for(int i = 0; i<results.length ;i++) {
			if(!results[i].equals("")) {
				resultList.add(results[i]);
			}
		}
		String[] dartNums = dartResult.split("[A-Z]");
		for(int i = 0; i<dartNums.length; i++) {
			dartNums[i] = dartNums[i].replaceAll("[^0-9]", "");
		}
		
		Iterator iter = resultList.iterator();

		for (int i = 0; i < 3; i++) {
			String s = (String) iter.next();
			answers[i] = square(Character.toString(s.charAt(0)),
					Integer.parseInt((dartNums[i]
							)));
			
			if (s.length() >= 2) {
				if ((Character.toString(s.charAt(1))).equals("*")) {
					answers[i] = 2 * answers[i];
					if (i >= 1) {
						answers[i - 1] *= 2;
					}
				}
				if ((Character.toString(s.charAt(1))).equals("#")) {
					answers[i] -= 2*answers[i];
				}

			}
		}
		
		for(int i = 0; i<3; i++) {
			answer += answers[i];
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dartResult = "1D2S#10S";
		Solution s = new Solution();
		System.out.println(s.solution(dartResult));
	}

	public int square(String s, int num) {
		if (s.equals("S")) {
			return num;
		} else if (s.equals("D")) {
			return (int) Math.pow(num,2);
		} else {
			return (int) Math.pow(num, 3);
		}

	}

}
