package sudoku;
import java.util.Random;

public class SudokuPuzzle {
	Random random = new Random();
	private final int GRID_SIZE = 9;
	private final int SUBGRID_SIZE = 3;
	private final int MINIMUM_NUM = 17;
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
	/*private final int[][] grid = new int[][] {
		{ 7, 0, 0, 0, 0, 0, 2, 0, 0 },
        { 4, 0, 2, 0, 0, 0, 0, 0, 3 },
        { 0, 0, 0, 2, 0, 1, 0, 0, 0 },
        { 3, 0, 0, 1, 8, 0, 0, 9, 7 },
        { 0, 0, 9, 0, 7, 0, 6, 0, 0 },
        { 6, 5, 0, 0, 3, 2, 0, 0, 1 },
        { 0, 0, 0, 4, 0, 9, 0, 0, 0 },
        { 5, 0, 0, 0, 0, 0, 1, 0, 6 },
        { 0, 0, 6, 0, 0, 0, 0, 0, 8 }
	};*/
	public SudokuPuzzle() {
		// TODO Auto-generated constructor stub
	}
	
	public void generateGrid() {
		System.out.print(grid);
	}
	
	public void displayGrid(int grid[][]) {
		// Displaying the grid in console
		for (int i=0;i<9;i++) {
			for (int j=0;j<9;j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
	
	public void generatePuzzle(int[][] b) {
		int r;
		int c;
		int n = 0;
		boolean noRepeat = false;
		
		for (int count = 0; count < MINIMUM_NUM; count++) {
			noRepeat = false;
			r = random.nextInt(9);
			c = random.nextInt(9);
			while (b[r][c] != 0 ) {
				r = random.nextInt(9);
				c = random.nextInt(9);
			}
			
			while (b[r][c] == 0) {
				while (!noRepeat) {
					n = random.nextInt(9) + 1;
					if (checkRepeat(b,r,c,n)) {
						b[r][c] = n;
						noRepeat = true;
					}
				}
				if (noRepeat) {
					break;
				}
			} 
			//System.out.println(count + ": " + r + " " + c + " = " + n);
		}
	}
	
	public boolean checkRepeat(int[][] b, int r, int c, int n) {
		// takes in grid in b, row number in r, column number in c, and the number to check as n
		// check for duplicates in the same row
		for (int d = 0; d < b.length; d++) {
			if (b[r][d] == n) {
				return false;
			}
		}
		
		// check for duplicates in the same column
		for (int r1 = 0; r1 < b.length; r1++) {
			if (b[r1][c] == n ) {
				return false;
			}
		}
		
		// check for duplicates in the sub-grid 3x3
		int sqt = (int) Math.sqrt(b.length);
		int boxRowSt = r - r % sqt;
		int boxColSt = c - c % sqt;
		
		for (int r1 = boxRowSt; r1 < boxRowSt + sqt; r1++) {
			for (int d = boxColSt; d < boxColSt + sqt; d++) {
				if (b[r1][d] == n) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public boolean solveSudoku(int[][] b, int num) {
		int r = -1;
		int c = -1;
		boolean isVacant = true;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (b[i][j] == 0) {
					r = i;
					c = j;
					
					//if false, means there is vacant cells
					isVacant = false;
					break;
				}
			}
			
			if (!isVacant) {
				break;
			}
		}
		
		// if there is no empty space left
		if (isVacant) {
			return true;
		}
		
		//otherwise do backtracking for each row
		for (int no = 1; no <= num; no++) {
			if (checkRepeat(b, r, c, no)) {
				b[r][c] = no;
				if (solveSudoku(b,num)) {
					//to display here if needed
					//displayGrid(b);
					//System.out.println("- - - - - - - - -");
					return true;
				} else {
					b[r][c] = 0;
				}
			}
		}
		return false;
	}
}
