import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class Canvas {

    private final JFrame frame;
    private final JPanel panel;
    private BufferedImage img;

       public Canvas (int width, int height)
       {
           frame = new JFrame();

           frame.setLayout(new BorderLayout());
           frame.setTitle("PLSGF : " + this.getClass().getName());
           frame.setResizable(false);
           frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

           panel = new JPanel();
           panel.setPreferredSize(new Dimension(width, height));
           frame.pack();
           frame.setVisible(true);

           img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
       }
}
