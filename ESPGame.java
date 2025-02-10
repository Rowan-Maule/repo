/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: Create a color guessing game that reads from a file and uses random numbers
 * Due: 2/10/2025
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Rowan Maule
*/


package ESPGame;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class ESPGame 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String playAgain = "yes";
		int timesLooped = 0;
		int correct = 0;
		final int maxRounds = 3;
		
		while(playAgain.equals("yes"))
		{
			//header and menu
			System.out.println("Hello! Select one of these 4 options to begin: \n");
			System.out.println("1. read and display on the screen the first 16 names of colors from a file colors.txt, so the player can select one of them names of colors.");
			System.out.println("2. read and display on the screen the first 10 names of colors from a file colors.txt, so the player can select one of them names of colors.");
			System.out.println("3. read and display on the screen the first 5 names of colors from a file colors.txt, so the player can select one of them names of colors.");
			System.out.println("4. Exit from a program \n");
			
			
			int numOfColors = 0;
			int selection = 0;
			Random select = new Random();
			String fileName = "";
			final int choice1 = 16, choice2 = 10, choice3 = 5;
			
			System.out.println("Enter file path (Enter colors.txt if on IDE, enter file path if on cmd): ");
			fileName = input.next();
			
			//loop for input validation
			boolean validateInput = true; 
			boolean isExit = false;
			while(validateInput == true)
			{	
				System.out.print("Enter your choice: ");
				int menu = input.nextInt();
				//switch opens file to show the user the colors they can pick
				switch(menu)
				{
					case 1:
						numOfColors = choice1;
						try 
						{
							File colors = new File(fileName);
							Scanner fileScan = new Scanner(colors);
							System.out.println("Here are sixteen colors from a file: ");
							for(int a = 1; a <= numOfColors; a++)
							{
								System.out.println(a + " " + fileScan.nextLine());
							}
							
							validateInput = false;
							isExit = false;
							fileScan.close();
						} catch (FileNotFoundException e) {
							System.out.println("File not found!");
						}
						break;
						
					case 2:
						numOfColors = choice2;
						try 
						{
							File colors = new File(fileName);
							Scanner fileScan = new Scanner(colors);
							
							System.out.println("Here are ten colors from a file: ");
							for(int a = 1; a <= numOfColors; a++)
							{
								System.out.println(a + " " + fileScan.nextLine());
							}
							
							validateInput = false;
							isExit = false;
							fileScan.close();
						} catch (FileNotFoundException e) {
							System.out.println("File not found!");
						}
						break;
						
					case 3:
						numOfColors = choice3;
						try 
						{
							File colors = new File(fileName);
							Scanner fileScan = new Scanner(colors);
							
							System.out.println("Here are five colors from a file: ");
							for(int a = 1; a <= numOfColors; a++)
							{
								System.out.println(a + " " + fileScan.nextLine());
							}
							
							validateInput = false;
							isExit = false;
							fileScan.close();
						} catch (FileNotFoundException e) {
							System.out.println("File not found!");
						}
						break;
						
					case 4:
						isExit = true;
						playAgain = "false";
						validateInput = false;
						break;
						
					default:
						System.out.println("Error, please enter a number from 1 through 4! \n");
						validateInput = true;
						break;
				}
			}
			
			while(isExit == false)
			{
				//main part of game
				String selectedColor = " ";
				String userChoice = " ";
				int numCorrect = 0;
				
				for(int round = 1; round <= maxRounds; round++)
				{
					try 
					{
						File colors = new File(fileName);
						Scanner colorSelection = new Scanner(colors);
						
						selection = (select.nextInt(numOfColors) + 1);
						for(int x = 1; x < selection; x++)
						{
							colorSelection.nextLine();
						}
						
						selectedColor = colorSelection.nextLine();
						
						colorSelection.close();
					} catch (FileNotFoundException e) {
						System.out.println("File not found!");
					}
					
					System.out.println("\n Round " + round + "\n");
					System.out.println("I am thinking of a color. \n It is one of the colors above, but which one is it? \n Enter your guess: ");
					userChoice = input.next();
					userChoice = userChoice.toLowerCase();
					
					if(userChoice.equals(selectedColor))
					{
						numCorrect++;
					}
					System.out.print("\n I was thinking of ");
					
					//print first letter in color name as uppercase
					int colorWordLength = selectedColor.length();
					char firstChar = selectedColor.charAt(0);
					String firstCharacter = "" + firstChar;
					System.out.print(firstCharacter.toUpperCase());
					for(int wordLength = 2; wordLength <= colorWordLength; wordLength++)
					{
						System.out.print(selectedColor.charAt(wordLength - 1));
					}
					System.out.print(". \n");
				}
				System.out.println("Game Over. \nYou guessed " + numCorrect + " out of " + maxRounds + " correct.");
				
				//Play again
				System.out.println("Would you like to play again? (Yes/No)");
				playAgain = input.next();
				playAgain = playAgain.toLowerCase();
				
				while(!(playAgain.equals("yes")) && !(playAgain.equals("no")))
				{
					System.out.println("Please enter Yes or No!");
					playAgain = input.next();
					playAgain = playAgain.toLowerCase();
				}
				timesLooped++;
				isExit = true;
				correct = numCorrect;
			}
		}
		
		//ending
		if(timesLooped > 0)
		{
			System.out.print("Enter the due date: ");
			String dueDate = input.next();
			input.nextLine();
			System.out.print("Enter your name: ");
			String username = input.nextLine();
			System.out.print("Write a short description of yourself: ");
			String description = input.nextLine();
			System.out.print("Enter the date: ");
			String date = input.nextLine();
			
			System.out.println("Username: " + username + "\nUser description: " + description + "\nDate: " + date);
			
			//write ending to file
			try {
				PrintWriter results = new PrintWriter("EspGameResults.txt");
				results.println("Game over! \nYou guessed " + correct + " out of " + maxRounds + " colors correct!");
				results.println("Due date: " + dueDate + "\nUsername: " + username + "\nUser Description: " + description + "\nDate: " + date);
				results.close();
			} catch (FileNotFoundException e) {
				System.out.println("Error File could not be created");
			}
			input.close();
		}
	}
}
