import java.util.Scanner;
public class mathEquationStellato{
	public static void main(String[] args) {
		
		Scanner consoleIn = new Scanner(System.in);
		
		int direction;
		int xComponent = 0, yComponent = 0; 
		double magnitude;
		
		
		
		
		System.out.println("In todays class we will learn how to find the components of vector given its maginutde and direction");
		System.out.println("First we need your input of magnitude (m) and direction (°) to get started: ");
        
		System.out.println("Please input a magnitude (m) -> ");
        magnitude = consoleIn.nextDouble();
        
        System.out.println("Please input an integer direction (°) -> ");
        direction = consoleIn.nextInt();
        double radiansDirection = Math.toRadians(direction); // Compound Operator
        
        
        System.out.println("Now that we have out magnitude (" + magnitude + "m) and direction (" + direction +"°) we can use these into component form.");
        System.out.println("First we need to establish that the equation to find the x component is\n||a||cosθ");
        System.out.println("Where ||a|| is the magintude of our vector.");
        
        System.out.println("similarly the y component can be found with the equation\n||a||sinθ");
        System.out.println("now with this knowledge lets find the x and y components given our inputed magnitude and direction.");
        System.out.println("Please solve for the following: ");
        System.out.println("X = " + magnitude + "cos" + direction);
        System.out.print("If your anwser was " + (int)(magnitude*Math.cos(radiansDirection))); // int casting
        System.out.print(" (rounded up) you were correct!");
        
        System.out.println("Now lets do the same for the y component.");
        System.out.println("Y = " + magnitude + "sin" + direction);
        
        System.out.print("If your anwser was " + (int)(magnitude*Math.sin(radiansDirection)));
        System.out.print(" (rounded up) you were correct!");
        
        System.out.println("Lastly, we add the components together in a aX + bY form where a and b are the coeficients that we solved for.");
        
        
        xComponent += (int)(magnitude*Math.cos(radiansDirection)); //Compound Operators
        yComponent += (int)(magnitude*Math.sin(radiansDirection)); //Compound Operators
        
        
        System.out.println("It should look like: " + xComponent + "X + " + yComponent + "Y");
        System.out.println("Now you know how to convery vectors into component form!");
        consoleIn.close();
	}
}
