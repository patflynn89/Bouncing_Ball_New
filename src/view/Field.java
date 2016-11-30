package view;


import model.GameExecution;

import java.util.Observable;
import java.util.Observer;

public class Field implements Observer {

    private GameExecution execute;

    public Field(GameExecution execute) {
        this.execute = execute;
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
