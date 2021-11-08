package LYT.Diving;
import java.util.*;
public class Dive {
static void inputValidScore() {
	float score;
Scanner sc = new Scanner(System.in);
System.out.println("Input score from 1 judge: ");
score= sc.nextFloat();
System.out.println("Valid score is: " + score);
}	

public static void inputAllScores() {
Scanner sc = new Scanner(System.in);	
	
	System.out.print("Enter the number of judges: ");
	int i=sc.nextInt();
	float[] scores = new float[i];
	int[] array = new int[i];
	
	System.out.println("Enter the scores: ");
	for(int j=0; j<i; j++)
		{
		scores[j] = sc.nextFloat();
		}
	
System.out.println("List of scores: ");

	for (int j=0; j<i; j++)
	{
		System.out.println(scores[j]);
return;
	
}
}
static void inputValidDegreeOfDifficulty() {
	
	float degree;
Scanner sc = new Scanner(System.in);
System.out.println("Input degree of difficulty: ");
degree= sc.nextFloat();
System.out.println("Degree of difficulty is: " + degree);
}	

static void calculateScore() {

}

	public static void main( String[] args) {
inputValidScore();
inputAllScores();
inputValidDegreeOfDifficulty();	
	
}

}
