
import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {

	
	public static int randInt(int min, int max) {
	    Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}
	
	public static void main(String args[]){
		int randNum;
		int count = 1;
		int userGuess;
		
		randNum = randInt(1, 1000);
		Scanner scan = new Scanner(System.in);
		System.out.println("Guess a number between 1 and 1000");
		userGuess = scan.nextInt();
		
		while(userGuess < 1){
			System.out.println("Too low, try again");
			userGuess = scan.nextInt();
		}
		
		while(userGuess > 1000){
			System.out.println("Too high, try again");
			userGuess = scan.nextInt();
		}
		
		while(userGuess != randNum){
			System.out.println("Nope! Try again");
			userGuess = scan.nextInt();
			while(userGuess < 1){
				System.out.println("Too low, try again");
				userGuess = scan.nextInt();
			}
			
			while(userGuess > 1000){
				System.out.println("Too high, try again");
				userGuess = scan.nextInt();
			}
			count++;
		}
		
		if(userGuess == randNum){
			System.out.println("Congratulations! You guessed the number. It took you " + count + " tries to find it");
		}
		
	}
	
}
