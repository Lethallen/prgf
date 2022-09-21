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

       public Canvas (int height, int width)
       {
           frame = new JFrame();

           frame.setLayout(new BorderLayout());
           frame.setTitle("PLSGF : " + this.getClass().getName());
           frame.setResizable(false);
           frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

       }
}
