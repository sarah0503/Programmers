import java.util.HashMap;
import java.util.Map;

public class Solution {
	public String[] solution(String[] records) {
		String[] answer = {};
		int count = 0;

		// 아이디 닉네임 쌍
		Map<String, String> nicknames = new HashMap<String, String>();

		for (int i = 0; i < records.length; i++) {
			String[] record = records[i].split(" ");
			if (record[0].equals("Enter")) {
				if (nicknames.containsKey(record[1])) {
					nicknames.replace(record[1], record[2]);
				} else {
					nicknames.put(record[1], record[2]);
				}
				count++;

			} else if (record[0].equals("Change")) {
				if (nicknames.containsKey(record[1])) {
					nicknames.replace(record[1], record[2]);
				} else {
					nicknames.put(record[1], record[2]);
				}
			} else {
				count++;
			}
			answer = new String[count];
		}

		for (int i = 0; i < records.length; i++) {
			String[] record = records[i].split(" ");
			String nickname = nicknames.get(record[1]);
			if (record[0].equals("Enter")) {
				answer[i] = nickname + "님이 들어왔습니다.";
			} else if (record[0].equals("Leave")) {
				answer[i] = nickname + "님이 나갔습니다.";
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		String[] record = { "Enter uid1234 Muzi", "Enter uid1234 Muzi", "Enter uid1234 Muzi", "Enter uid1234 Muzi",
				"Enter uid1234 Muzi", "Enter uid1234 Muzi", "Enter uid1234 Muzi", "Enter uid1234 Muzi",
				"Enter uid1234 Muzi", "Enter uid1234 Muzi", "Enter uid1234 Muzi", "Enter uid1234 Muzi",
				"Enter uid1234 Muzi", "Enter uid1234 Muzi", "Enter uid1234 Muzi", "Enter uid1234 Muzi",
				"Enter uid1234 Muzi", "Enter uid1234 Muzi", "Enter uid1234 Muzi", "Enter uid1234 Muzi",
				"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo",
				"Change uid4567 Ryan" };
		Solution s = new Solution();
		String[] answer = s.solution(record);
		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}

	}
}
