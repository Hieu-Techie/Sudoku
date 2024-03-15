package view;

import model.Game;

public class View {
	private Game game;

	public View(Game game) {
		this.game = game;
	}

	public void displayBoard() {
		System.out.println("Sudoku Board:");
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(game.getNode(i, j).getValue() + " ");
			}
			System.out.println();
		}
	}

	public void inputCellValue(int row, int col) {
		System.out.print("Nhập giá trị cho ô (" + row + ", " + col + "): ");
	}

	public void invalidInputValuePrompt() {
		System.out.println("Giá trị nhập vào không hợp lệ! Mời nhập lại!");
		System.out.println("--------------------------------------------");
	}

	public void validInputValue() {
		System.out.println("Giá trị nhập vào hợp lệ!");
		System.out.println("--------------------------------------------");
	}

	public void terminateProgram() {
		System.out.println("Chương trình kết thúc.");
	}

	public void inputRowColumn() {
		System.out.print("Nhập hàng cột của ô cần điền (-1 để kết thúc): ");
	}

	public void displayCompletionMessage() {
		System.out.println("Chúc mừng! Sudoku đã được hoàn thành.");
	}
}
