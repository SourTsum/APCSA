
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class usefulSchool {
	public static void main(String[] args) {
		boolean running = true;
		Scanner consoleIn = new Scanner(System.in);
		String nextInput = "";
		Map<String, Double> assignmentMap = new HashMap<String,Double>();
		
		
		String assignmentName;
		String points;
		
		System.out.println("Welcome to the priority calculator!");
		System.out.println("For help with commands please type -help");
		
		
		
		while(running) {
			System.out.print(": ");
			nextInput = consoleIn.next();
			
			
			// QOL Commands
			if(nextInput.equals("-quit")) {
				running = false;
			}
			if(nextInput.equals("-help")) {
				System.out.println();
				System.out.println("-help [prints out the list of commands]");
				System.out.println("-quit [quits the program]");
				System.out.println("-clear [clears the console]");
				System.out.println("-inputFormative [inputs formative into the calculator (assignment name,points)]");
				System.out.println();
			}
			if(nextInput.equals("-clear")) {
				System.out.println("\n\n\n\n\n\n\n\n\n\n");
			}
			
			// Main Commands
			
			if(nextInput.equals("-inputFormative")){
				
				System.out.println("Please input the assignment name: ");
				assignmentName = consoleIn.next();
				System.out.println("Please input the points: ");
				points = consoleIn.next();
			}
		}
		consoleIn.close();
	}
}

