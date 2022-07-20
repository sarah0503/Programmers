import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Solution {
	public String[] solution(String[] orders, int[] course) {
		ArrayList<String> answerList = new ArrayList<String>();

		for (int i = 0; i < course.length; i++) {
			HashMap<String, Integer> hashmap = new HashMap<String, Integer>();

			for (int j = 0; j < orders.length; j++) {
				String str = orders[j];
				boolean[] visited = new boolean[str.length()];

				ArrayList<String> addStrs = combination(str, visited, 0, i);

				for (int m = 0; m < addStrs.size(); m++) {
					String addStr = addStrs.get(m);
					System.out.println(str + ": " + addStr);
					if (hashmap.containsKey(addStr)) {
						hashmap.put(addStr, hashmap.get(addStr) + 1);
					} else {
						hashmap.put(addStr, 0);
					}
				}

			}

			Integer max = Collections.max(hashmap.values());

			for (HashMap.Entry<String, Integer> entry : hashmap.entrySet()) {
				String key = entry.getKey();
				if (hashmap.get(key) == max && hashmap.get(key) > 1) {
					answerList.add(key);
					System.out.println(key);
				}
			}

		}

		String[] answer = answerList.toArray(new String[answerList.size()]);

		return answer;
	}

	static ArrayList<String> combination(String str, boolean[] visited, int start, int r) {
		ArrayList<String> answer = new ArrayList<String>();
		if (r == 0) {
			String nowAnswer = "";
			for (int i = 0; i < str.length(); i++) {
				if (visited[i] == true) {
					nowAnswer = nowAnswer + (str.charAt(i));
				}
			}
			System.out.println(str + ":::" + nowAnswer);
			answer.add(nowAnswer);
			return answer;
		} else {
			for (int i = start; i < str.length(); i++) {
				visited[i] = true;
				answer = combination(str, visited, i + 1, r - 1);
				visited[i] = false;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		String[] orders = { "ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD" };
		int[] course = { 2, 3, 5 };
		String[] solution = s.solution(orders, course);
		for (int i = 0; i < solution.length; i++) {
			System.out.println("정답 : " + solution[i]);
		}
	}
}
