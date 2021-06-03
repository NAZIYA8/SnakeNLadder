package Snakenladder;

import java.util.List;
import java.util.Scanner;

public class SnakeNLadder {
	public static void main(String[] args) {
		int position = 0;
		System.out.println("Do you want to start the game yes or no?");
		Scanner scan = new Scanner(System.in);
		String ans = scan.next();

		if (ans.equals("yes")) {
			System.out.println("Game started at position = " + position);
		} else {
			System.out.println("no worries");
		}
		List<Integer> ladders = List.of(2, 4, 9, 33, 52, 80);
		List<Integer> snakes = List.of(51, 56, 62, 92, 98);
		int currentPosition = 0;
		int maxPosition = 100;
		int iterations = 0;
		while (currentPosition < maxPosition) {
			iterations++;
			int dice = (int) (Math.random() * 6) + 1;
			System.out.println("dice  " + dice);
			if (currentPosition + dice > 100) {
				System.out.println("Skipped....");
				continue;
			}
			currentPosition += dice;
			System.out.println("Position: " + currentPosition);
			if (ladders.contains(currentPosition)) {
				System.out.println("Ladder");
				currentPosition += dice;
				System.out.println("Forward Position: " + currentPosition);
			} else if (snakes.contains(currentPosition)) {
				System.out.println("Snake");
				currentPosition -= dice;
				System.out.println("Backward Position: " + currentPosition);
			} else {
				System.out.println("No Play");
			}
			if (currentPosition < 0) {
				currentPosition = 0;
			}
		}
		System.out.println("Number of iterations: " + iterations);
	}
}