package tdd.training.session1;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

public class MarsRover {
	final String NORTH = null;
	public MarsRover(int x, int y, String obstacles){
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: ?(o1_x,o1_y)(o2_x,o2_y)...(on_x,on_y)? with no white spaces. 
	 *  
		Example use:
		MarsRover rover = new MarsRover(100,100,"?(5,5)(7,8)?")  //A 100x100 grid with two obstacles at coordinates (5,5) and (7,8) 
	 */
	
	String obs_x = null;
	String obs_y = null;
	String roverStarts = NORTH;
	
	for(int i = 0; i< x;i++){
		obstacles = obs_x;
		for(int j=0 ; j< y ; j++){
			obstacles = obs_y;
		}
	}
	//MarsRover rover = new MarsRover(x,y,"(obs_x,obs_y)");
	
	
}
	
	public String executeCommand(String command){
		 
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The rover is on a 100x100 grid at location (0, 0) and facing NORTH. The rover is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: ?(x,y,facing)(o1_x,o1_y)(o2_x,o2_y)?..(on_x,on_y)?  
		 * Where x and y are the final coordinates, facing is the current direction the rover is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		String roverStarts = NORTH;
		int move ;
		
		if(command == roverStarts){
			 move = 0;
		}
		else if(command == "f"){
			move = 1;
		}
		
		
		return (command);
	}
}
