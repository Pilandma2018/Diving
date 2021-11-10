package LYT.Diving;
import java.util.*;
import java.util.ArrayList;
public class Dive {
	
static Scanner sc = new Scanner(System.in);


 public static double inputValidScore() {
	double score=0.0;

System.out.println("Input score from 1 judge: ");
score= sc.nextDouble();
System.out.println("Score is: " + score);

return score;
}	

public static void inputAllScores(ArrayList<Double> score) {	

	for(int j = 0; j < 7; j++) {
		

	double input = sc.nextDouble();
	score.add(input);
	}
	}

public static int highestNumber(ArrayList<Double> score) {
	double high = score.get(0);
	int i = 0;
	int highest = 0;
	for (i = 0; i < 7; i++) {
		if (score.get(i) > high) {
			high = score.get(i);
			highest = i;
		}
	}
	return highest; 
}

public static int lowestNumber(ArrayList<Double> score) {
	double low = score.get(0);
	int i = 0;
	int lowest = 0;
	for (i = 0; i < 7; i++) {
		if (score.get(i) > low) {
			low = score.get(i);
			lowest = i;
		}
	}
	return lowest; 
}
public static double addScore(ArrayList<Double> score, int highest, int lowest) {
	
	int i = 0;
	score.remove(highest);
	score.remove(lowest);
	double sum = 0;
	for (i = 0; i < score.size(); i ++) {
		sum += score.get(i);
		
	}
	return sum ;
	
}

public static void main( String[] args) {
		inputValidScore();
		System.out.println("Enter the 7 scores: ");
		
	ArrayList<Double> score = new ArrayList<Double>();
	inputAllScores(score);
	System.out.println("Enter the difficulty between 1.2 and 3.8");
	
	double difficulty = sc.nextDouble();
	
	int indexhigh = highestNumber(score);
	int indexlow = lowestNumber(score);
	double sum = addScore(score, indexhigh, indexlow);
	System.out.println("The total diver's score is : " + ((sum * difficulty) * 0.6));
}

/*public static double inputValidDegreeOfDifficulty(double degree) {

System.out.println("Input degree of difficulty: ");
degree= sc.nextFloat();

return degree;
}
*/	


}