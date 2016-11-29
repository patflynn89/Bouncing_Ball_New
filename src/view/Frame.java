package view;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.Dimension;

/**
 * This class creates the <code>MainFrame</code> of the Program.
 */
public class Frame extends JFrame {
    private int width;
    private int height;
    private Frame frame;

    /**
     * The constructor of the Mainframe
     * @param boardWidth
     * @param boardHeight
     */
    public Frame(int boardWidth, int boardHeight) {
        System.out.println("In the constructor: " + SwingUtilities.isEventDispatchThread());
        setPreferredSize(new Dimension(boardWidth, boardHeight));
        this.width = getPreferredSize().width;
        this.height = getPreferredSize().height;
        BallView ball = new BallView(this);
        add(ball);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        pack();
        setVisible(true);
    }

    public Frame getFrame() {
        return this;
    }

}
