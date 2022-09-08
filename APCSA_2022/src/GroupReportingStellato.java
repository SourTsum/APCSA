import java.util.Scanner;

public class GroupReportingStellato{
	public static void main(String[] args) {
		
		Scanner consoleIn = new Scanner(System.in);
        
        double slope, pointX, pointY;
        
        System.out.println("In this lesson we will learn how to find the slope intercpet.");
        System.out.println("Slope intercept form looks like such y = mx + b");
        System.out.println("To solve for the slope intercpet (aka. b) we will need the slope and a point on the line");
        
        System.out.println("Please input a slope: ");
        slope = consoleIn.nextDouble();
        
        System.out.println("y = " + slope + "x + b");
        
        System.out.println("Next we need to input a point on the line (x,y)\nPlease input a x: ");
        pointX = consoleIn.nextDouble();
        System.out.println("(" + pointX + ",y)\nPlease input a y: ");
        pointY = consoleIn.nextDouble();
        System.out.println("(" + pointX + "," + pointY + ")");
        
        System.out.println("Now that we have our slope and point we can subsitute the x , y , and slope into our equation.");
        System.out.println("This will look something like this " + pointY + " = " + slope + " x " + pointX +" + b");
        
        System.out.println("Now all thats left is to solve for b");
        
        double multiplyPortion = 1;
        multiplyPortion *= pointX; // Compound Operators
        multiplyPortion *= slope; // Compound Operators
        
        System.out.println("First we multiply -> " + pointY + " = " + multiplyPortion + " b");
        System.out.println("Lastly we subtract -> " + (pointY - multiplyPortion) + " = b");
        System.out.println("our b is " + (pointY - multiplyPortion));
        
        
        
        
        consoleIn.close();
	}
}
