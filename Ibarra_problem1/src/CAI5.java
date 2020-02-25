import java.util.*;
import java.security.SecureRandom;

public class CAI5 
{
	public static int MAX = 4;

	public static int DIFFMAX = 0;

	public static int MIN = 1;

	public static double RIGHT;

	public static double WRONG;

	public static int NUMBER = 10;

	public static int DIFFICULTY = 0;

	public static int ARITHMETIC = 0;


		public static void Quiz(){	

			generateQuestionArgument();
		
			readProblemType();

			SecureRandom sr = new SecureRandom();

			double percent = 0;

			RIGHT = 0;
			WRONG = 0;

			while(NUMBER > 0){

				int x = sr.nextInt(DIFFMAX);

				int y = sr.nextInt(DIFFMAX);

				askQuestion(x,y);

				NUMBER--;
			}

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
				switch(ARITHMETIC){
				case 1:
				System.out.println("How much is "+x+" plus "+y+"?");
				break;
				case 2:
				System.out.println("How much is "+x+" times "+y+"?");
				break;
				case 3:
				System.out.println("How much is "+x+" minus "+y+"?");
				break;
				case 4:
				System.out.println("How much is "+x+" divided by "+y+"?");
				break;
			}
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

			switch(ARITHMETIC){
				case 1:
					if(x+y == response)
						displayCorrectResponse(choice);
					else
						displayIncorrectResponse(choice);
				break;

				case 2:
					if(x*y == response)
						displayCorrectResponse(choice);
					else
						displayIncorrectResponse(choice);
				break;

				case 3:
					if(x-y == response)
						displayCorrectResponse(choice);
					else
						displayIncorrectResponse(choice);
				break;

				case 4:
					if(x == 0 | y == 0 && response == 0)
						displayCorrectResponse(choice);	
					else if(x/y == response)
						displayCorrectResponse(choice);	
					else
						displayIncorrectResponse(choice);	
				break;
			}

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

			public static int readDifficulty(){

				System.out.println("Please enter a difficulty level 1-4");
				Scanner s = new Scanner(System.in);

				int difficulty = s.nextInt();

				if(difficulty == 0){
					System.out.println("Please enter Valid Difficulty");
					readDifficulty();
				}

				return difficulty;


		}


		public static void displayCompletionMessage(int right, int wrong){

			RIGHT += right;
			WRONG += wrong;

		}

		public static void generateQuestionArgument(){

			DIFFICULTY = readDifficulty();

			if(DIFFICULTY == 1)
				DIFFMAX = 9;
			else if(DIFFICULTY == 2)
				DIFFMAX = 99;
			else if(DIFFICULTY == 3)
				DIFFMAX = 999;
			else if(DIFFICULTY == 4)
				DIFFMAX = 9999;

		}

		public static void readProblemType(){

			System.out.println("\nChoose Arthimetic\n1.)Additon\n2.)Multiplication\n3.)Subtraction\n4.)Division\n");

			Scanner s = new Scanner(System.in);

			ARITHMETIC = s.nextInt();

			if(ARITHMETIC == 0){
				System.out.println("Please enter a valid Arthimetic\n");
				readProblemType();
			}

		}


		public static void main(String[] args){

			Quiz();

		}

}
