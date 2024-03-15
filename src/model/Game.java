package model;

public class Game {
	private Node[][] board_game;

	public Game(int[][] array) {
		board_game = new Node[9][9];
		initializeNodes(array);
	}

	private void initializeNodes(int[][] array) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				board_game[i][j] = new Node(i, j, array[i][j]);
			}
		}
	}

	public Node getNode(int row, int col) {
		return board_game[row][col];
	}

	public boolean validate(int row, int col, int value) {
		return isValidRow(row, value) && isValidColumn(col, value) && isValidBox(row, col, value)
				&& board_game[row][col].getValue() == 0 && value > 0 && value < 10;
	}

	private boolean isValidRow(int row, int value) {
		for (int i = 0; i < 9; i++) {
			if (board_game[row][i].getValue() == value) {
				return false;
			}
		}
		return true;
	}

	private boolean isValidColumn(int col, int value) {
		for (int i = 0; i < 9; i++) {
			if (board_game[i][col].getValue() == value) {
				return false;
			}
		}
		return true;
	}

	private boolean isValidBox(int row, int col, int value) {
		int boxStartRow = row - row % 3;
		int boxStartCol = col - col % 3;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board_game[boxStartRow + i][boxStartCol + j].getValue() == value) {
					return false;
				}
			}
		}
		return true;
	}

	public boolean isSudokuComplete() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board_game[i][j].getValue() == 0) {
					return false;
				}
			}
		}
		return true;
	}
}
