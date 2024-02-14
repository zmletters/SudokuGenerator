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
}
