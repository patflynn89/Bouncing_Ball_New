package view;

import frame.MainFrame;
import constants.GameConstants;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;



public class BallView extends JPanel {

    private MainFrame mainFrame;
    private int boardWidth;
    private int boardHeight;
    private int ballRadius;
    private String shape;

    public BallView(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        //tsehfdksabsf
        this.shape = "The Ball rests.";
        System.out.println("BallView Constructor: " + SwingUtilities.isEventDispatchThread());
        System.out.println(mainFrame.getPreferredSize().getWidth());
        System.out.println(this.mainFrame.getPreferredSize().height);
        this.mainFrame.add(this);
        System.out.println("End of BallView constructror: " + SwingUtilities.
                isEventDispatchThread());

    }
//dsofinvodsnifv
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D ball = (Graphics2D) g;
        System.out.println("PaintComponent in BallView: " + SwingUtilities.isEventDispatchThread());

        ball.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        ball.setColor(Color.GREEN);
        ball.fillOval(0, 0, GameConstants.BALLSIZE, GameConstants.BALLSIZE);
        System.out.println("End of PaintComponent: " + SwingUtilities.isEventDispatchThread());

        ball.setColor(Color.black);
        System.out.println(this.mainFrame.getContentPane().getHeight() - 5);
        ball.drawString(this.shape, 5, /*5*/ this.mainFrame.getContentPane().getHeight() - 5);
    }
}
