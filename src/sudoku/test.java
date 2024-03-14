package sudoku;

public class test {

	public test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		SudokuPuzzle sd = new SudokuPuzzle();
		
		int[][] b = new int[][] {
			{ 7, 0, 0, 0, 0, 0, 2, 0, 0 },
            { 4, 0, 2, 0, 0, 0, 0, 0, 3 },
            { 0, 0, 0, 2, 0, 1, 0, 0, 0 },
            { 3, 0, 0, 1, 8, 0, 0, 9, 7 },
            { 0, 0, 9, 0, 7, 0, 6, 0, 0 },
            { 6, 5, 0, 0, 3, 2, 0, 0, 1 },
            { 0, 0, 0, 4, 0, 9, 0, 0, 0 },
            { 5, 0, 0, 0, 0, 0, 1, 0, 6 },
            { 0, 0, 6, 0, 0, 0, 0, 0, 8 }
		};
		int[][] grid = new int[][] {
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

		/*
		System.out.println("The puzzle is:");
		sd.displayGrid(b);
		System.out.println("The solution is:");
		sd.solveSudoku(b, 9);
		sd.displayGrid(b);
		*/
		sd.generatePuzzle(grid);
		System.out.println("The puzzle is:");
		sd.displayGrid(grid);

		while (!sd.solveSudoku(grid, 9)) {
			System.out.println("Puzzle Unsolvable...");
			grid = new int[][] {
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
			System.out.println("The puzzle is:");
			sd.generatePuzzle(grid);
			sd.displayGrid(grid);
		}
		System.out.println("The solution is:");
		sd.solveSudoku(grid, 9);
		sd.displayGrid(grid);
	}

}
