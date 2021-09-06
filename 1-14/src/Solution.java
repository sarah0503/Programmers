import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet <Integer> Nums = new HashSet <Integer> ();
        for (int i = 0; i<nums.length ; i++) {
        	Nums.add(nums[i]);
        }
        //Collections.sort(Nums);
        int select = nums.length/2;
        int count = Nums.size();
        answer = (select<count? select : count);
        return answer;
    }
}