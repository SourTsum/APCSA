/*
@author : Alexander Stellato
@date : 9 / 11 / 22
@class : APCSA
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SchoolUseful {

	public static void main(String[] args) {

		Scanner consoleIn = new Scanner(System.in); // Created Scanner
		HashMap<String, String> studySet = new HashMap<String, String>(); // Going Beyond: Used a Hash Map data structure

		// 1.2 Data typing (Declaring Variables)
		// boolean running = true; // Used for main loop

		int score = 0; // Used to keep score when quizzing someone
		String questionIn, answerIn; // Used for inputing key pair values into the studySet hashmap

		// 1.1 Output (Initial print our informing the user on how to receive help with
		// commands)
		System.out.println("Welcome to study sets!");
		System.out.println("For help with commands type -help.");

		// Going Beyond: Used while loop to continue the program till the user quits
		while (true) {
			// Prints out where the user should type collects user input in the nextInput
			// String
			System.out.print(": ");
			// Reads next command
			String nextInput = consoleIn.next();

			// Read to end of link and ignore extra characters
			consoleIn.nextLine();

			/* Going Beyond:
			 * 
			 * Used if statements as a form of event listeners for when
			 * the user inputs a specific String into nextInput
			*/
			// Help Command
			if (nextInput.equals("-help")) {
				
				// output 1.1 (prints a list of all valid commands and what they do)
				System.out.println("");
				System.out.println("-help [prints a list of all valid commands and what they do]");
				System.out.println("-quit [quits current session]");
				System.out.println("-addQuestion [adds a question and answer to the study set]");
				System.out.println("-startQuiz [starts a quiz using the current study set]");
				System.out.println("-showSet [shows the study set]");
				System.out.println("-clearSet [clears the study set]");
				System.out.println("");
				continue;
			}

			// Quit command (quits current session)
			if (nextInput.equals("-quit")) {
				// Sets running to false leading for the while loop to exit thus exiting the
				// program
				System.out.println("Good bye.");
				break;
			}

			// addQuestion command (adds a question and answer to the study set)
			if (nextInput.equals("-addQuestion")) {
				// Asks for question and sets the questionIn String variable to the inputed
				// question
				System.out.print("Enter your question: ");
				questionIn = consoleIn.next() + consoleIn.nextLine();

				// Checks if the question is already in the hashmap
				if (!(studySet.containsKey(questionIn))) {
					// If the question is not already in the hashmap
					System.out.print("Enter the solution: "); // The program will ask for the solution
					answerIn = consoleIn.next() + consoleIn.nextLine();
					studySet.put(questionIn, answerIn); // Then it will input the questionIn and answerIn variables as a
														// key pair value into the studySet hashmap
					System.out.println("Successfully added your question and answer!");
				} else {
					// If the question is in the hashmap the program will tell the user that the
					// question is already in the study set
					System.out.println("This question is already in the study set.");
				}
				continue;
			}

			/* Going Beyond:
			 * 
			 * Used if statements as a form of event listeners for
			 * when the user inputs a specific String into nextInput
			*/
			
			// showSet command (shows the study set)
			if (nextInput.equals("-showSet")) {
				// Checks if the hashmap is empty
				if (studySet.size() != 0) {
					// If not empty the program iterates through the map printing out each question
					// and answer that is currently in the study set
					for (Map.Entry<String, String> entry : studySet.entrySet()) {
						System.out.println("Question: " + entry.getKey() + " | Answer: " + entry.getValue());
					}
				} else {
					// If empty it the program will let the user know that their study set is empty
					System.out.println("Your study set is empty.  Use -addQuestion to add questions to your study set.");
				}
				continue;				
			}

			/* Going Beyond:
			 * 
			 * Used if statements as a form of event listeners for when the 
			 * user inputs a specific String into nextInput
			*/
			// clearSet command (clears the study set)
			if (nextInput.equals("-clearSet")) {
													
				// Checks if their studySet is empty
				if (studySet.size() > 0) {
					// If their study set isn't empty the program will prompt the user with a
					// message asking them if they want to clear their study set
					System.out.println("Are you sure that you want to clear the study set? (Y/N)");
					if (consoleIn.next().equals("Y")) {
						// If the user types "Y" their current study set will be cleared
						studySet.clear();
						System.out.println("Successfully cleared your study set.");
					}
				}
				continue;
			}

			/* Going Beyond:
			 * 
			 * Used if statements as a form of event listeners for
			 * when the user inputs a specific String into nextInput
			*/
			if (nextInput.equals("-startQuiz")) {
				// Checks if their study set is empty
				if (studySet.size() > 0) {
					// Scrolls the current screen to avoid showing answers to questions being quizzed on
					for(int i = 25; i > 0; i--) {
						// Prints out 10 new blank lines 25 times
						System.out.print("\n\n\n\n\n\n\n\n\n\n");						
					}
					
					// If their study set isn't empty then the program iterates through the study
					// set printing out each key in the studySet hashmap comparing the users input with
					// the value associated with each key
					for (Map.Entry<String, String> entry : studySet.entrySet()) {
						System.out.print("Question: " + entry.getKey() + "\nType your answer: ");
						answerIn = consoleIn.next() + consoleIn.nextLine();

						if (entry.getValue().equals(answerIn)) {
							// 1.3-1.4 Compounding Expressions: Compound operator used to count score
							score += 1;
						}
					}
					System.out.println("Here is your result!");
					
					// 1.5 Casting and limits: Casting to double due to possible decimal result
					// 1.2 Data typing: Declaring the double grade
					double grade = ((double) score / studySet.size() * 100);
					System.out.print("Grade: ");
					System.out.printf("%.2f", grade);
					System.out.println("%");
					score = 0;
				} else {
					System.out.println("Your study set is empty.  Use -addQuestion to add questions to your study set.");
				}
			continue;
			}			
			
			System.out.println("You entered an invalid command.");
			System.out.println("For help with commands type -help.");	
		}
		consoleIn.close();
	}
}
