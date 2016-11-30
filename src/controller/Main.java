package controller;

import model.GameExecution;
import view.Frame;
import constants.GameConstants;
import view.Field;

import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        GameExecution execute = new GameExecution();
        Field field = new Field(execute);
        SwingUtilities.invokeLater(() -> {
            System.out.println("In the invokeLater Methode: " +
                    SwingUtilities.isEventDispatchThread());
            new Frame(GameConstants.BOARD_WIDTH, GameConstants.BOARD_HEIGHT);

        });
    }


}
