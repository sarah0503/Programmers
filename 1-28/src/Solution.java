
public class Solution {
	
    public int solution(String dartResult) {
        int answer = 0;
        String [] results = dartResult.split("\\d");
        String dartNums = dartResult.replaceAll("[^0-9]", "");
        System.out.println(dartNums.charAt(1));
        
        for(int i = 0; i<4 ; i++) {
        	System.out.println(results[i]);
        }
        
        //for(String s: results) {
        for(int i = 0; i<3; i++) {
        	String s = results[i+1];
        	System.out.println(s + " ");
        	//if(s.length() == 1) {
        		answer += square(Character.toString(s.charAt(0)), Integer.parseInt(Character.toString(dartNums.charAt(i))));
        		//i++;
        	//}
        }
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dartResult = "1S2D*3T";
		Solution s = new Solution();
		System.out.println();
		System.out.println(s.solution(dartResult));
	}
	
	public int square(String s, int num) {
		if( s.equals("S")) {
			System.out.println(num);
			return num;
		}
		else if(s.equals("D")) {
			System.out.println(num*num);
			return num*num;
		}
		else {
			System.out.println(num*num*num);
			return num*num*num;
		}
	
	}

}
