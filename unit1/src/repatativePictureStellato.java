import gpdraw.*;
import java.math.*;
public class repatativePictureStellato {
	
	// Writing my own method that oscillates between intervals of 90 which creates the up and down patters shown 
	static void drawLayer(DrawingTool tool , int layer,int iterations) {
		while(iterations > 0) {
			for(int i = 0 ; i < 7; i++) {
				tool.setDirection(90 * (i * Math.pow(i, i+1)));
				tool.move(Math.log10(35)*(layer*10));
			}	
			iterations--;
		}
	}
	

	public static void main(String[] args) {
		
		// Creating objects
		SketchPad page = new SketchPad(500,500);
		DrawingTool pen = new DrawingTool(page);
		
		// Initial alignment
		pen.up();
		pen.setDirection(180);
		pen.move(240);
		
		pen.setDirection(270);
		pen.move(215);
		
		pen.setDirection(0);
		pen.down();
		
		
		// Draw first full part of drawing
		drawLayer(pen,1,3);
		drawLayer(pen,2,2);
		drawLayer(pen,3,1);
		
		// Drawing iterations of the first pattern
		for(int i = 0; i < 5; i++) {
			pen.setDirection(0);
			pen.up();
			pen.move(pen.getXPos()-995);
			pen.setDirection(90);
			pen.move(-110);
			pen.setDirection(0);
			pen.down();
			
			drawLayer(pen,1,3);
			drawLayer(pen,2,2);
			drawLayer(pen,3,1);	
		}
	}
}
