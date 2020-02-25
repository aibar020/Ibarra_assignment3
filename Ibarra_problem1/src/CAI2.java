import java.util.*;
import java.security.SecureRandom;

public class CAI2 
{
	public static int MAX = 4;

	public static int MIN = 1;

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

			SecureRandom sr = new SecureRandom();

			int choice = sr.nextInt(MAX-MIN+1)+MIN;

			Scanner s = new Scanner(System.in);

			int response = s.nextInt();

			isAnswerCorrect(x,y,response,choice);
		}

		public static void isAnswerCorrect(int x, int y, int response,int choice){

			if(x*y == response)
				displayCorrectResponse(choice);
			else
				displayIncorrectResponse(choice);

		}

		public static void displayCorrectResponse(int choice){
			switch(choice){
				case 1:
				System.out.println("Very good!");
				break;
				case 2:
				System.out.println("Excellent!");
				break;
				case 3:
				System.out.println("Nice Work!");
				break;
				case 4:
				System.out.println("Keep up the good work!");
				break;
			}


		}

		public static void displayIncorrectResponse(int choice){

			switch(choice){
				case 1:
				System.out.println("No. Please try again");
				break;
				case 2:
				System.out.println("Wrong. Try once more");
				break;
				case 3:
				System.out.println("Dont give up!");
				break;
				case 4:
				System.out.println("No. Keep trying.");
				break;
			}
			Quiz();

		}

		public static void main(String[] args){

			Quiz();

		}

}

