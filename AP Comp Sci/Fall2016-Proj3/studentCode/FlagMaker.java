package studentCode;
import java.awt.Color;

import cmsc131_GridTools.Grid_1x2;


public class FlagMaker {
	private static Color AZURE = new Color(0,127,255);

	//YOU SHOULD READ AND GET COMFORTABLE WITH THESE TWO METHODS
	//  AS YOUR FIRST STEP - UNDERSTAND WHAT THEY DO AND WHY
	//THINK ABOUT HOW YOU CAN WRITE YOUR DRAW AND SOME OTHER HELPER
	//  METHODS AS YOU WORK ON THE REMAINING FLAGS.

	private static void helperSolid(Grid_1x2 grid, Color theColor) {
		//We want to paint the whole flag this one color.  To do
		//  this we can iterate through each row, and within that
		//  row iterate through each column.  At each position, 
		//  we'll set the color there to the one passed in.
		for (int row=0; row<grid.getHt(); row++) {
			for (int col=0; col<grid.getWd(); col++) {
				grid.setColor(row, col, theColor);
			}
		}
	}

	private static void drawSultanateOfMuscat(Grid_1x2 grid) {
		//Since this is just a solid red flag, we'll call the
		//  helper we have to do the work.
		helperSolid(grid, Color.RED);
	}





	//THIS IS A MORE COMPLEX HELPER METHOD THAT WE PROVIDE
	//  IT DRAWS A STAR (SORT OF) IN THE CENTER OF A GRID
	//  THAT IS SENT TO IT, USING THE SPECIFIED COLOR.
	//YOU MIGHT FIND IT INTERESTING TO READ THE CODE, BUT
	//  YOU CAN USE THIS HELPER WITHOUT DOING THAT SINCE 
	//  YOU DO NO WHAT IT DOES AT THE ABSTRACT LEVEL.

	private static void helperCenterStar(Grid_1x2 grid, Color theColor) {
		int middleX = grid.getWd()/2;
		int middleY = grid.getHt()/2;

		//Do the left side of things
		for (int radius=0; radius<middleY-3; radius++) {
			//The left leg
			grid.setColor(middleY+radius, middleX-radius-1, theColor);
			grid.setColor(middleY+radius, middleX-radius, theColor);

			//The right leg
			grid.setColor(middleY+radius, middleX+radius-1, theColor);
			grid.setColor(middleY+radius, middleX+radius, theColor);

			//The arms
			grid.setColor(middleY, middleX+radius, theColor);
			grid.setColor(middleY, middleX-radius-1, theColor);

			//The head
			grid.setColor(middleY-radius, middleX-1, theColor);
			grid.setColor(middleY-radius, middleX, theColor);
		} 
	}




	/* Draws a single flag as indicated by the second parameter
	 * into the grid passed as the first parameter.  We provide 
	 * the starter code here that will correctly call the helper
	 * to draw the flag of ????.  As you work on the flag for each
	 * task, you'll need to (a) modify this method to add the 
	 * option, and (b) write the helper method(s) that it calls.
	 */
	public static void drawFlag(Grid_1x2 grid, int flagCode) {
		//Our first flag is that of the Sultanate of Muscat
		//so our condition has:
		//   - a check for that flag's code, 0
		//   - a check to make sure the height of the grid
		//      passed in is odd
		//   - a check to make sure the height of the grid
		//      passed in is at least 9
		if (flagCode==0 && grid.getHt()%2==1 && grid.getHt()>=9) {
			drawSultanateOfMuscat(grid);
		}
		else if(flagCode == 1)
			drawSomalia(grid);
		else if(flagCode == 2)
			drawCofT(grid);
		else if(flagCode == 3)
			drawPrague(grid);
		else if(flagCode == 4)
			drawFrance(grid);
		else if(flagCode == 5)
			drawSenegal(grid);
		else if(flagCode == 6)
			drawBahamas(grid);
		else if(flagCode == 7)
			drawLeonardopolis(grid);	
		//THE LAST "ELSE" IN THE CHAIN SHOULD CALL THE ERROR FLAG
		else{
			drawError(grid);
		}
	}



	//YOUR FIRST TASK'S DRAW METHOD HERE - WE'VE PROVIDED THE
	//  SIGNATURE TO POINT YOU IN THE RIGHT DIRECTION
	private static void drawError(Grid_1x2 grid){
		//YOUR CODE HERE
		grid.setColor(0, 0, Color.red);
		grid.setColor(0, grid.getWd()-1, Color.red);
		grid.setColor(grid.getHt()-1, 0, Color.red);
		grid.setColor(grid.getHt()-1, grid.getWd()-1, Color.red);
	}



	//THE DRAW METHODS AND ANY HELPERS YOU WRITE FOR THE REMAINING 
	//  TASKS GET ADDED BY YOU DOWN HERE AS YOU GO...

	public static void drawSomalia(Grid_1x2 grid){
		if(grid.getHt()>=9 && grid.getHt()%2==1){
			helperSolid(grid, Color.blue);
			helperCenterStar(grid, Color.white);
		}
		else
			drawError(grid);

	}
	public static void drawCofT(Grid_1x2 grid){
		if(grid.getHt()%2==0){
			for(int i=0; i<grid.getHt();i++)
				for(int j=0; j<grid.getWd(); j++){
					if(i<grid.getHt()/2)
						grid.setColor(i, j, Color.pink);
					else
						grid.setColor(i, j, Color.cyan);
				}
		}
		else
			drawError(grid);

	}
	public static void drawPrague(Grid_1x2 grid){
		if(grid.getHt()%2==0){
			for(int i=0; i<grid.getHt();i++)
				for(int j=0; j<grid.getWd(); j++){
					if(i<grid.getHt()/2)
						grid.setColor(i, j, Color.yellow);
					else
						grid.setColor(i, j, Color.red);
				}
		}
		else
			drawError(grid);
	}
	public static void drawFrance(Grid_1x2 grid){
		if(grid.getWd()%3==0){
			for(int i=0; i<grid.getHt();i++)
				for(int j=0; j<grid.getWd(); j++){
					if(j<grid.getWd()/3)
						grid.setColor(i, j, Color.blue);
					else if(j<grid.getWd()/3*2)
						grid.setColor(i, j, Color.white);
					else
						grid.setColor(i, j, Color.red);
				}
		}
		else
			drawError(grid);
	}
	public static void drawSenegal(Grid_1x2 grid){
		if(grid.getWd()%3==0 && grid.getHt()>=9 && grid.getHt()%2==1){
			for(int i=0; i<grid.getHt();i++)
				for(int j=0; j<grid.getWd(); j++){
					if(j<grid.getWd()/3)
						grid.setColor(i, j, Color.green);
					else if(j<grid.getWd()/3*2)
						grid.setColor(i, j, Color.yellow);
					else
						grid.setColor(i, j, Color.red);
				}
			helperCenterStar(grid, Color.green);
		}
		else
			drawError(grid);
	}
	public static void drawBahamas(Grid_1x2 grid){
		int height = grid.getHt()-1;
		if(grid.getHt()%3==0){
			//make the 3 base horizontal stripes
			for(int i=0; i<grid.getHt();i++){
				for(int j=0; j<grid.getWd(); j++){
					if(i<grid.getHt()/3)
						grid.setColor(i, j, Color.cyan);
					else if(i<grid.getHt()/3*2)
						grid.setColor(i, j, Color.yellow);
					else
						grid.setColor(i, j, Color.cyan);
				}
			}
			//make the black triangle
			for(int i=0; i<grid.getHt();i++)
				for(int j=0; j<grid.getWd(); j++){
					if(grid.getHt()%2==0)
						if(i<grid.getHt()/2){
							int black = j%(i+1);
							grid.setColor(i, black, Color.black);
							grid.setColor(height-i, black, Color.black);
						}
						else
							continue;
					else
						if(i<grid.getHt()/2+1){
							int black = j%(i+1);
							grid.setColor(i, black, Color.black);
							grid.setColor(height-i, black, Color.black);
						}
				}
		}
		else
			drawError(grid);
	}
	public static void drawLeonardopolis(Grid_1x2 grid){
		if(grid.getHt()>=8 && grid.getHt()%2==01){
			helperSolid(grid, AZURE);
			int width = grid.getWd()-1;
			//make the X shape and vertical line
			for(int i=0; i<grid.getHt();i++){
				grid.setColor(i, i*2, Color.yellow);
				grid.setColor(i, i*2+1, Color.yellow);
				grid.setColor(i, width-(i*2), Color.yellow);
				grid.setColor(i, width-(i*2+1), Color.yellow);
				grid.setColor(i, width/2, Color.yellow);
				grid.setColor(i, width/2+1, Color.yellow);
			}
			//make the horizontal line
			for(int j=0; j<grid.getWd();j++)
				grid.setColor(grid.getHt()/2, j, Color.yellow);
		}
		else
			drawError(grid);
	}



}
