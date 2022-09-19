import gpdraw.*;
/*
 * @Author : Alexander Stellato
 * @Date : 9/19/22
 * @Class : AP Computer Science A
 */


public class drawHouseStellato{
	public static void main(String[] args) {
		// Creating the SketchPad and DrawingTool objects
		SketchPad page = new SketchPad(500,500);
		DrawingTool pen = new DrawingTool(page);
		
		
		// Draws the main body of the house
		pen.drawRect(400, 175);
		
		// Positions the pen to the top left of the main body of the house
		pen.up();
		pen.move(87.5);
		pen.setDirection(180);
		pen.move(200);
		pen.down();
		
		//Draws the roof of the house
		pen.setDirection(14);
		pen.move(206.15);
		
		pen.setDirection(-14);
		pen.move(206.15);
		
		// Positions the pen to the first window location
		pen.up();
		pen.setDirection(-90);
		pen.move(50);
		pen.setDirection(180);
		pen.move(50);
		
		// Draws the first window
		pen.down();
		pen.move(50);
		pen.setDirection(-90);
		pen.move(50);
		pen.setDirection(0);
		pen.move(50);
		pen.setDirection(90);
		pen.move(50);
		
		// Positions the pen to the first window location
		pen.up();
		pen.setDirection(180);
		pen.move(250);
		
		// Draws second window
		pen.down();
		pen.move(50);
		pen.setDirection(-90);
		pen.move(50);
		pen.setDirection(0);
		pen.move(50);
		pen.setDirection(90);
		pen.move(50);
		
		// Positions the pen to draw the house
		pen.up();
		pen.setDirection(-90);
		pen.move(50);
		pen.setDirection(0);
		pen.move(75);
		
		// Draws the door
		pen.down();
		pen.move(50);
		pen.setDirection(-90);
		pen.move(75);
		pen.up();
		pen.setDirection(180);
		pen.move(50);
		pen.setDirection(90);
		pen.down();
		pen.move(75);
		
	}
}
