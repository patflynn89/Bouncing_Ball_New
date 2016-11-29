package view;

import constants.GameConstants;
import view.Frame;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.io.Serializable;


public class BallView extends JPanel implements Serializable {


    private static final long serialVersionUID = 6766563673706562252L;
    private String shape;
    private Frame frame;

    public BallView(Frame frame) {
        this.frame = frame;
        this.shape = "The Ball rests.";
        System.out.println("BallView Constructor: " + SwingUtilities.isEventDispatchThread());
        //Frame frame = Frame.getFrames();
    }

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
        ball.drawString(shape, this.frame.getContentPane().getX(), this.frame.getContentPane().
                getHeight());
    }
}
