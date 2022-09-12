
/*

@author : Alexander Stellato
@date : 9 / 11 / 22

*/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class schoolUseful {

	public static void main(String[] args) {
		boolean running = true;
		Scanner consoleIn = new Scanner(System.in);

		HashMap<String, String> studySet = new HashMap<String, String>();
		String questionIn, answerIn;
		int score = 0;

		System.out.println("Welcome to study sets!");
		System.out.println("For help with commands type -help.");
		while (running) {
			System.out.print(": ");
			String nextInput = consoleIn.next() + consoleIn.nextLine();

			// Help Command (prints a list of all valid commands and what they do)
			if (nextInput.equals("-help")) {
				System.out.println("");
				System.out.println("-help [prints a list of all valid commands and what they do]");
				System.out.println("-quit [quits current session]");
				System.out.println("-addQuestion [adds a question and answer to the study set]");
				System.out.println("-quizSet [starts a quiz using the current study set]");
				System.out.println("-showSet [shows the study set]");
				System.out.println("-clearSet [clears the study set]");
				System.out.println("");
			}

			// Quit command (quits current session)
			if (nextInput.equals("-quit")) {
				running = false;
			}

			// addQuestion command (adds a question and answer to the study set)
			if (nextInput.equals("-addQuestion")) {
				System.out.print("Enter your question: ");
				questionIn = consoleIn.next() + consoleIn.nextLine();
				if (!(studySet.containsKey(questionIn))) {
					System.out.print("Enter the solution: ");
					answerIn = consoleIn.next() + consoleIn.nextLine();
					studySet.put(questionIn, answerIn);
					System.out.println("Successfully added question and answer!");
				} else {
					System.out.println("This question is already in the study set.");
				}
			}

			// showSet command (shows the study set)
			if (nextInput.equals("-showSet")) {
				if(studySet.size() != 0) {
					for (Map.Entry<String, String> entry : studySet.entrySet()) {
						System.out.println("Question: " + entry.getKey() + " | Answer: " + entry.getValue());
					}
				} else {
					System.out.println("| Empty Set |");
				}
			}

			// clearSet command (clears the study set)
			if (nextInput.equals("-clearSet")) {
				studySet.clear();
			}

			if (nextInput.equals("-quizSet")) {
				if (studySet.size() != 0) {
					for (Map.Entry<String, String> entry : studySet.entrySet()) {
						System.out.print(entry.getKey() + "\n-> ");
						answerIn = consoleIn.next() + consoleIn.nextLine();

						if (entry.getValue().equals(answerIn)) {
							score += 1; // Compound operator used to count score
						}
					}
					System.out.println("Here is your result!");
					System.out.println("Score: " + ((double) score / studySet.size() * 100) + "%"); // Casting to double
																									// due to possible
																									// decimal result
					score = 0;
				} else {
					System.out.println("Your study set is empty, add questions to start a quiz!");
				}
			}

		}
		consoleIn.close();
	}

}
