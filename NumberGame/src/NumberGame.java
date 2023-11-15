import java.util.Random;
import java.util.Scanner;

public class NumberGame {
	
	static int gameCount = 1;
	static int winCount = 0;
	
	static void numberGame() {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int randomNumber = random.nextInt(101);
		int attempt = 5;
		int attemptCount=1;
		
		System.out.println("\n\tLets play ");
		
			for(attemptCount=1;attemptCount<=attempt;attemptCount++) {
				
				System.out.println("Enter the number to guess: attempt "+attemptCount);
				
				int userGuess = scanner.nextInt();
				
				if(randomNumber==userGuess) {
					
					System.out.println("\nCongratulations.. Your guess is correct..");
					winCount++;
					System.out.println("You guessed number in "+attemptCount+" attempts.");
					System.out.println("Your score is "+(120-(20*attemptCount))+"/100");
					break;
				}
				else if(randomNumber>userGuess) {
					System.out.println("Oops.. The number entered by you is too small ");
				}
				else {
					System.out.println("Oops.. The number entered by you is too large ");
				}
			}
			if(attemptCount==6) {
				
				System.out.println("\n\tYou ran out of attempts"
						+ "\t..GAME_OVER..");
				System.out.println("\tThe number was "+randomNumber);
			}
			
		playAgain();
	}
	
	static void playAgain(){
			
		System.out.println("\nDo you want to play again ?"
				+ "\nif YES type y or Y || if NO type n or N");

		Scanner scanner = new Scanner(System.in);
		
		char choice = scanner.next().charAt(0);
		
		switch(choice) {
		
		case 'y':
			gameCount++;
			numberGame();
			
		case 'Y':
			gameCount++;
			numberGame();
			
		case 'n':
			System.out.println("Games You Won : "+winCount+"/"+gameCount);
			System.exit(0);
			
		case 'N':
			System.out.println("Games You Won : "+winCount+"/"+gameCount);
			System.exit(0);
				
		default:
			System.out.println("Invalid Choice.. Enter y or Y to YES || n or N to NO");
			playAgain();
		}
	}
	public static void main(String[] args) {
		
		System.out.println("~ Welcome to the Number Guessing Game ~"
				+"\n"
				+ "\nThis is a simple guessing game where you supposed to guess a number between 1 to 100 in a maximum of 5 attempts."
				+ "\nThe game will end after 5 attempts and if you able to guess the number correctly then you will win the game, "
				+ "\nOtherwise you will loose the game.");
		
		numberGame();	
	}
}

//generate a random number-done
//get guess number from user-done
//print if correct high or low-done
//repeat until user guess the number right -done
//
//limit number of attempt -done
//play again -done
//display score of user based on number of attempts taken or rounds won -done


//attempt -done
//attemptCount -done
//gameCount -done
//game over -done
//the number was -done