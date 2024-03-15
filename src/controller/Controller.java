package controller;

import java.util.Scanner;

import model.Game;
import view.View;

public class Controller {
	private Game game;
	private View view;
	private Scanner sc;

	public Controller(Game game, View view) {
		this.game = game;
		this.view = view;
		this.sc = new Scanner(System.in);
	}

	public void startGame() {
		while (!game.isSudokuComplete()) {
			view.displayBoard();
			view.inputRowColumn();
			int row = sc.nextInt(), col = sc.nextInt();
			if (row == -1) {
				view.terminateProgram();
				System.exit(0);
			}

			view.inputCellValue(row, col);
			int value = sc.nextInt();

			if (game.validate(row - 1, col - 1, value)) {
				game.getNode(row - 1, col - 1).setValue(value);
				view.validInputValue();
			} else {
				view.invalidInputValuePrompt();
			}
		}
		view.displayBoard();
		view.displayCompletionMessage();
		sc.close();
	}
} 
