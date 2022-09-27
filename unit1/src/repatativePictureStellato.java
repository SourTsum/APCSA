import gpdraw.*;
import java.math.*;

/*
 * @Author : Alexander Stellato
 * @Date : 9 / 19 / 22
 * @Class : AP Computer Science A
 */

public class repatativePictureStellato {
	
	// Writing my own method that oscillates between intervals of 90 which creates the up and down patters shown 
	static void drawTriangle(DrawingTool tool) {
		tool.turnLeft(0);
		tool.move(70);
		tool.turnLeft(135);
		tool.move(50);
		tool.turnLeft(225);
		tool.move(50);
		tool.turnLeft(0);
		
	}
	

	public static void main(String[] args) {
		
		// Creating objects
		SketchPad page = new SketchPad(500,500);
		DrawingTool pen = new DrawingTool(page);
		
		drawTriangle(pen);
		pen.setDirection(45);
		drawTriangle(pen);
		
		}
	}
