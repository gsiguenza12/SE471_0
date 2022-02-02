/******
 * Lab 0 Lining panel gui class to implement java awt
 * used for SE 471 lab 0, with Dr. Simon Fan
 * @author Gabriel Siguenza
 * <sigue005@cougars.csusm>
 * @author Uma Nair
 */
package LineDrawing;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class LiningPanel extends javax.swing.JPanel {


    LiningPanel() { }

    public void paintComponent(Graphics g) {


        //**RGB components(values are in range 0 – 255)

        super.paintComponent(g);
        int w = getWidth();
        int h = getHeight();

        double lines = 15.0; // ** how spread out the lines are?

        // Draw line design on bottom left portion of the screen
        for (int i = 0; i < lines; i++) // ** this for loop draws the graph design in the bottom left portion
        {
            int w2 = (int) ((i / lines) * w);
            int h2 = (int) ((i / lines) * h);

            generateRGB(g);
            g.drawLine(0, h2, w2, h); // 0 and h determine the geometry of the lines, use to reorient
            g.drawLine(w2, h, w, h - h2);
            g.drawLine(w, h2, w2, 0);
            g.drawLine(w2, 0, 0, h - h2);
        }
      }

        protected void generateRGB(Graphics g){
            Random randNum = new Random();
            int red, green, blue;
            red = randNum.nextInt(256);
            green = randNum.nextInt(256);
            blue = randNum.nextInt(256);

            g.setColor(new Color(red, green, blue));
    }

}
