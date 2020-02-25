import java.util.*;
import java.security.SecureRandom;

public class CAI3 
{
	public static int MAX = 4;

	public static int MIN = 1;

	public static double RIGHT;

	public static double WRONG;

	public static int NUMBER = 10;


		public static void Quiz(){	

			SecureRandom sr = new SecureRandom();

			double percent = 0;

			RIGHT = 0;
			WRONG = 0;

			while(NUMBER > 0){
				int x = sr.nextInt(9);

				int y = sr.nextInt(9);
				askQuestion(x,y);
				NUMBER--;
			}

			System.out.println("You got "+RIGHT+ " out of 10");

			percent = (RIGHT/10)*100;

			System.out.println("\nYour Score is "+percent+"%");

			if(percent>= 75){
				System.out.println("Congratulations, you are ready to go to the next level!");
			}

			else if(percent < 75){
				System.out.println("Please ask you teacher for extra help");
			}

			System.out.println("Would You Like To Try Another Problem Set? 1 for Yes: 2 for No");

			Scanner s = new Scanner(System.in);

			int answer = s.nextInt();

			if(answer == 1){
				NUMBER = 10;
				Quiz();
			}
		
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
			displayCompletionMessage(1,0);

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
			displayCompletionMessage(0,1);

		}


		public static void displayCompletionMessage(int right, int wrong){

			RIGHT += right;
			WRONG += wrong;

		}
		

		public static void main(String[] args){

			Quiz();

		}

}

