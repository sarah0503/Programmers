import java.lang.System.Logger;
import java.util.ArrayList;

public class Solution {
	//private final Logger log = LoggerFactory.getLogger(getClass());
    public int[] solution(int[] progresses, int[] speeds) {
        int checkCount = progresses.length;
        int progressLength = progresses.length;
        ArrayList<Integer> answerArray = new ArrayList<>();
        Progress [] progressClasses = new Progress[checkCount];
       // int[] values = new int [progressLength];
        
        for(int i =0 ; i<checkCount; i++) {
        	progressClasses[i] = new Progress(progresses[i]);
        	progressClasses[i].calculate(speeds[i]);
        }
        
        while(checkCount >0){
        	int nowCount = progressLength - checkCount;
        	int answerCount = 1;
        	checkCount--;
        	for(int i = nowCount+1 ; i<progressLength; i++) {
        		if(progressClasses[i].getCheck() == false && progressClasses[nowCount].getValue() >= progressClasses[i].getValue()) {
        			answerCount++;
        			progressClasses[i].setCheck();
        			checkCount--;
        		}
        		else if (progressClasses[nowCount].getValue() < progressClasses[i].getValue()) {
        			break;
        		}
        	}
        	answerArray.add(answerCount);
        	}

    	int [] answer = new int[answerArray.size()];
    	int size = 0;
    	for(Integer temp: answerArray) {
    		answer[size++] = temp;
        }
        return answer;
    }
    
    public static void main(String[] args) {
		Solution s = new Solution();
		int [] progresses = {93, 30,55};
		int [] speeds = {1,30,5};
		int [] answer = s.solution( progresses, speeds);
		
		for(int i = 0;i <answer.length; i++) {
			System.out.println(answer[i]);
		}
	}
}

class Progress{
	private int work;
	private int day;
	private boolean check = false;
	private int value = 0; 
	
	Progress(int work){
		this.work = work;
	}
	
	public void calculate(int speed) {
		this.value =  (int) Math.ceil((100-work)/speed);
	}
	
	public int getValue() {
		return value;
	}
	
	public boolean getCheck() {
		return check;
	}
	
	public int getWork() {
		return work;
	}
	
	public void setCheck() {
		this.check = true;
	}
}
