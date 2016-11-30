package view;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.Dimension;

/**
 * This class creates the <code>MainFrame</code> of the Program.
 */
public class Frame extends JFrame {

    /**
     * The constructor of the Mainframe
     * @param boardWidth The width of the frame.
     * @param boardHeight The height of the frame.
     */
    public Frame(int boardWidth, int boardHeight) {
        System.out.println("In the constructor: " + SwingUtilities.isEventDispatchThread());
        super.setTitle("Ball in a Box");
        setPreferredSize(new Dimension(boardWidth, boardHeight));
        BallView ball = new BallView(this);
        add(ball);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }


}
