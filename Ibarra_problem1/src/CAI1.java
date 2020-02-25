import java.util.Scanner;
import java.security.SecureRandom;
public class CAI1
{	
	public static void Quiz(){	

		SecureRandom sr = new SecureRandom();

		int x = sr.nextInt(9);

		int y = sr.nextInt(9);
		
		askQuestion(x,y);

	}
	public static void repeatQuiz(int x, int y){
		askQuestion(x, y);
	}

	public static void askQuestion(int x, int y){
		System.out.println("How much is "+x+" times "+y+"?");
		readResponse(x,y);
	}

	public static void readResponse(int x, int y){

		Scanner s = new Scanner(System.in);

		int response = s.nextInt();

		isAnswerCorrect(x,y,response);
	}

	public static void isAnswerCorrect(int x, int y, int response){

		if(x*y == response)
			displayCorrectResponse();
		else
			displayIncorrectResponse(x, y);

	}

	public static void displayCorrectResponse(){

		System.out.println("Very good!");

	}

	public static void displayIncorrectResponse(int x, int y){

		System.out.println("No. Please try again");
				
		repeatQuiz(x, y);

	}


	public static void main(String[] args){

		Quiz();

	}

}

