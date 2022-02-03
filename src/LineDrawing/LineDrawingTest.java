/******
 * Lab 0 Line drawing driver to test gui class implementing
 * java awt used for SE 471 lab 0, with Dr. Simon Fan
 *
 * @author Gabriel Siguenza
 * <sigue005@cougars.csusm>
 * @author Uma Nair
 *
 * Notes: Contains main, creates the JFrame to hold application.
 * This class shouldn't have much going on from what I understand so far
 * So we are doing most of the work in the other class files.
 *
 * To write a threadsafe Swing program, we must make sure that the methods listed
 * above are accessed only from within the event-dispatching thread.
 *
 * ** indicates unecessary comments to be deleted... including this one **
 */
package LineDrawing;

import javax.swing.*;
import java.awt.*;

public class LineDrawingTest {

    public static void main(String[] args) {

        // components needed for displaying line drawing application
        JFrame application = new JFrame();
        LiningPanel panel = new LiningPanel();

        // setting up the application applet view.
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300, 300);
        application.setTitle("Lining Art");
        application.setVisible(true);
    }
}
