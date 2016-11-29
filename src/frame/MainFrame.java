package frame;

import view.BallView;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.*;

/**
 * The <code>MainFrame</code> of the Program.
 */
public class MainFrame extends JFrame {
    private int width;
    private int height;

    /**
     * The constructor of the Mainframe
     */
    public MainFrame() {
        System.out.println("In the constructor: " + SwingUtilities.isEventDispatchThread());
        setPreferredSize(new Dimension(640, 480));
        this.width = getPreferredSize().width;
        this.height = getPreferredSize().height;
        pack();
//        System.out.println(getPreferredSize().width);
//        System.out.println(getPreferredSize().height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * This is the main method of the program. It creates the <code>GameExecution</code> - Model and
     * also a new Thread which creates the <code>MainFrame</code>.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        System.out.println("In the main methode: " + SwingUtilities.isEventDispatchThread());
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                System.out.println("In the invokeLater Methode: " +
                        SwingUtilities.isEventDispatchThread());
                MainFrame mainFrame = new MainFrame();
                BallView ballView = new BallView(mainFrame);

            }
        });

    }

}
