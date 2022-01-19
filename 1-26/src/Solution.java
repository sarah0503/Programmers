
public class Solution {
	
    public int solution(int n) {
        int answer = 0;
        int max = 0;
        int i = 0;
        while(true) {
        	if(n < Math.pow(3, i)) {
        		max = i ;
        		break;
        	}
        	i++;
        }
        
        int [] array = new int [max];
        int k = max; 
        
        while (true) {
        	int temp = (int) Math.pow(3 , k-1);
        	//System.out.println(temp + " " + n);
        	if(n >= temp) {
        		n -= temp;
        		array[k-1] ++;
        		//System.out.println("K : " + temp);
        	}
        	else {
        		k--;
        		//System.out.println("sd");
        	}
        	if(n <= 0) break;
        }
        
        for(i=0; i<array.length; i++) {
        	System.out.println(array[i]);
        	for(int j = 0 ;j<array[i];j++) {
        	answer += Math.pow(3, max - i - 1);
        	}
        }
        
        
        
        
        
        return answer;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 125;
		Solution s = new Solution();
		System.out.println(s.solution(n));
		
	}

}
