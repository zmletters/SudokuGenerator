package sudoku;

public class test {

	public test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
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
		// TODO Auto-generated method stub
		SudokuPuzzle sd = new SudokuPuzzle();
		System.out.println("The puzzle is:");
		sd.displayGrid(b);
		System.out.println("The solution is:");
		sd.solveSudoku(b, 9);
		sd.displayGrid(b);
	}

}
