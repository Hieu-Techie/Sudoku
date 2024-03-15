package main;

import controller.Controller;
import model.Game;
import view.View;

public class Main {
	public static void main(String[] args) {
		int a[][] = {
                {8, 2, 6, 0, 4, 5, 1, 7, 9},
                {9, 3, 5, 2, 7, 1, 8, 6, 4},
                {7, 1, 4, 9, 0, 6, 3, 2, 5},
                {6, 9, 8, 7, 5, 4, 2, 1, 3},
                {3, 4, 1, 8, 9, 2, 6, 5, 7},
                {2, 5, 7, 1, 6, 3, 9, 4, 8},
                {1, 6, 9, 4, 3, 7, 5, 8, 2},
                {5, 7, 3, 6, 2, 8, 4, 9, 1},
                {4, 8, 2, 5, 1, 9, 7, 3, 6}
        };

        Game game = new Game(a);
        View view = new View(game);
        Controller controller = new Controller(game, view);

        controller.startGame();
	}
}
