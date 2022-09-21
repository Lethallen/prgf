import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class Canvas {

    private final JFrame frame;
    private final JPanel panel;
    private final BufferedImage img;

    int x, y;

       public Canvas (int width, int height)
       {
           frame = new JFrame();

           frame.setLayout(new BorderLayout());
           frame.setTitle("PLSGF : " + this.getClass().getName());
           frame.setResizable(false);
           frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

           img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);



           panel = new JPanel() {
               @Override
               protected void paintComponent(Graphics g) {
                   super.paintComponent(g);
                   g.drawImage(img,0,0,null);
               }
           };
           panel.setPreferredSize(new Dimension(width, height));
           frame.add(panel, BorderLayout.CENTER);
           frame.pack();
           frame.setVisible(true);

           panel.requestFocus();
           panel.requestFocusInWindow();

           x=width/2;
           y=height/2;
           panel.addKeyListener(new KeyAdapter() {
               @Override
               public void keyPressed(KeyEvent e) {
                   super.keyPressed(e);
                   if(e.getKeyCode()==KeyEvent.VK_UP){img.setRGB(x,y,0xff0000);y--;}
                   panel.repaint();

               }
           });


       }
}
