package Snakenladder;

import java.util.Scanner;

public class SnakeNLadder {
	public static void main(String[] args) {
		int start = 0;
		System.out.println("Do you want to start the game yes or no?");
		Scanner scan = new Scanner(System.in);
		String ans = scan.next();

		if (ans.equals("yes")) {
			System.out.println("Game started at Position = " + start);
		} else {
			System.out.println("No Worries");
		}
	}
}