package questions;

import java.util.Random;
import java.util.Scanner;

class game {
	public int number;
	public int inputNumber;
	public int noOfGuesses = 0;

	public int getNoOfGuesses() {
		return noOfGuesses;
	}

	public void setNoOfGuesses(int noOfGuesses) {
		this.noOfGuesses = noOfGuesses;
	}

	game() {
		Random rand = new Random();
		this.number = rand.nextInt(100);
	}

	void takeuserinput() {
		System.out.println("Guess the number");
		Scanner sc = new Scanner(System.in);
		inputNumber = sc.nextInt();
	}

	boolean iscorrectnumber() {
		noOfGuesses++;
		if (inputNumber == number) {
			System.out.println("Yes you guessed it correct and the number is : -->" + number + "in-->" + noOfGuesses
					+ "times of guess");

		} else if (inputNumber < number) {
			System.out.println("Too Low");
		} else if (inputNumber > number) {
			System.out.println("Too High");
		}

		return false;

	}
}

public class Game_1 {

	public static void main(String[] args) {
		game g = new game();
		boolean b = false;
		while (!b) {
			g.takeuserinput();
			b = g.iscorrectnumber();

		}

	}

}
