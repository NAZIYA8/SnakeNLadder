package Snakenladder;

import java.util.Scanner;

public class SnakeNLadder {
	public static void main(String[] args) {
		int position=0;
	System.out.println("Do you want to start the game yes or no?");
	Scanner scan = new Scanner(System.in);
	String ans = scan.next();
	
	if (ans.equals("yes")) {
		System.out.println("Game started at position =  " + position);
	}
	else {
		System.out.println("No Worries");
	}
	int dice = (int) (Math.random()*6) + 1;
    System.out.println("Dice  " + dice);
	
	}
}