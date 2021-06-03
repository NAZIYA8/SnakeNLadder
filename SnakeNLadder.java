package Snakenladder;

import java.util.List;
import java.util.Scanner;

public class SnakeNLadder {
	public static void main(String[] args) {
		int position = 0;
		System.out.println("Do you want to start the game? yes or no ");
		Scanner scan = new Scanner(System.in);
		String ans = scan.next();

		if (ans.equals("yes")) {
			System.out.println("Game started at Position = " + position);
		} else {
			System.out.println("No Worries");
		}
		List<Integer> ladders = List.of(2, 4, 9, 33, 52, 80);
		List<Integer> snakes = List.of(51, 56, 62, 92, 98);
		int player1Position = 0;
		int player2Position = 0;
		int maxPosition = 100;
		int iterations = 0;
		while (player1Position < maxPosition && player2Position < maxPosition) {
			iterations++;
			System.out.println("Player 1:");
			int dice = (int) (Math.random() * 6) + 1;
			System.out.println("Dice  " + dice);
			if ((player1Position + dice) <= maxPosition) {
				player1Position += dice;
				System.out.println("Position: " + player1Position);
				if (ladders.contains(player1Position)) {
					System.out.println("Ladder");
					player1Position += dice;
					System.out.println("Forward Position: " + player1Position);
				} else if (snakes.contains(player1Position)) {
					System.out.println("Snake");
					player1Position -= dice;
					System.out.println("Backward Position: " + player1Position);
				} else {
					System.out.println("No Play");
				}
				if (player1Position < 0) {
					player1Position = 0;
				}
			}
			else {
				System.out.println("Skipped");
			}
			System.out.println("----------------------\r\n");
			System.out.println("Player 2:");
			dice = (int) (Math.random() * 6) + 1;
			System.out.println("Dice  " + dice);
			if ((player2Position + dice) <= 100) {
				player2Position += dice;
				System.out.println("Position: " + player2Position);
				if (ladders.contains(player2Position)) {
					System.out.println("Ladder");
					player2Position += dice;
					System.out.println("Forward Position: " + player2Position);
				} else if (snakes.contains(player2Position)) {
					System.out.println("Snake");
					player2Position -= dice;
					System.out.println("Backward Position: " + player2Position);
				} else {
					System.out.println("No Play");
				}
				if (player2Position < 0) {
					player2Position = 0;
				}
			}
			else {
				System.out.println("Skipped");
			}
			System.out.println("----------------------\r\n\r\n");
			
		}
		System.out.println("Number of iterations: " + iterations);
		if(player1Position > player2Position) {
			System.out.println("The winner is: Player 1");
		}else {
			System.out.println("The winner is: player 2");
		}
	}
}
