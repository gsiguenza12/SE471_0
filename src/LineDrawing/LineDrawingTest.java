/******
 * Lab 0 Line drawing driver to test gui class implementing
 * java awt used for SE 471 lab 0, with Dr. Simon Fan
 *
 * @author Gabriel Siguenza
 * <sigue005@cougars.csusm>
 * @author Uma Nair
 *
 * Note: ** indicates unecessary comments to be deleted... including this one **
 */
package LineDrawing;

import javax.swing.JFrame;

public class LineDrawingTest {

    public static void main(String[] args) {

        // components needed for displaying line drawing application
        JFrame application = new JFrame();
        LiningPanel panel = new LiningPanel();

        // make JButton here?

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300, 300);
        application.setTitle("Lining Art");
        application.setVisible(true);
    }
}
