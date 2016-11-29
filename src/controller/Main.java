package controller;

import model.GameExecution;
import model.Vector;
import view.Frame;
import constants.GameConstants;

import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        GameExecution execute = new GameExecution();
        SwingUtilities.invokeLater(() -> {
            System.out.println("In the invokeLater Methode: " +
                    SwingUtilities.isEventDispatchThread());
            new Frame(GameConstants.BOARD_WIDTH, GameConstants.BOARD_HEIGHT);

        });
    }


}
