package edu.gcu.bootcamp.java.stephen.williams.example;

import java.util.Scanner;

public class Example {
	
	private static Scanner scanner = new Scanner(System.in);
	
	private static int getUserInput() {

		System.out.print("Enter a number from 1 to 5:  ");
		int input = scanner.nextInt();
		return input;
	}
	
	private static int getRandomInteger1To5() {
		
		double randomNum = Math.random();
		int num =  (int) (randomNum * 5 + 1);
		return num;
	}
	
	private static boolean compareInputWithRandomNum(int randomNum, int input) {
		
		return randomNum == input;
	}
	
	public static void main (String[] args) {
		
		boolean userChoseNumber = false;
		do {
			int userInput = getUserInput();
			int randomNum = getRandomInteger1To5();
			userChoseNumber = compareInputWithRandomNum(randomNum, userInput);
		} while(!userChoseNumber);
		
		System.out.println("Congratulations!  Free lifelong bagels care of Rob Loy!!");
		scanner.close();
	}
	
	 
}