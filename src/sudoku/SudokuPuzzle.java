package sudoku;
import java.util.Random;

public class SudokuPuzzle {
	Random random = new Random();
	private int[][] grid = {
			{0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0}
	};
	public SudokuPuzzle() {
		// TODO Auto-generated constructor stub
	}
	
	public void generateGrid() {
		System.out.print(grid);
	}
	
	public void displayGrid() {
		// Displaying the grid in console
		for (int i=0;i<9;i++) {
			for (int j=0;j<9;j++) {
				System.out.print(grid[i][j]);
			}
			System.out.print("\n");
		}
	}
	
	public void generatePuzzle() {
		int n1 = random.nextInt(9) + 1;
	}
	
	public boolean checkRepeat(int i, int j) {
		// Takes in two constraints i = row position, j column position
		// This function will check if there is repeating number in the same row, column and 3x3 box
		
		return true;
	}
}
