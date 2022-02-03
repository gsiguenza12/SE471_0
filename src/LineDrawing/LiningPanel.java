/******
 * Lab 0 Lining panel gui class to implement java awt
 * used for SE 471 lab 0, with Dr. Simon Fan
 *
 * @author Gabriel Siguenza
 * <sigue005@cougars.csusm>
 * @author Uma Nair
 *
 * Notes: ** indicates unecessary comments to be deleted... including this one **
 **/

package LineDrawing;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class LiningPanel extends javax.swing.JPanel implements Runnable{

    LiningPanel() {} // **Empty constructor? Can't remember why we do it this way.

    private boolean programHalted = false;

    private synchronized boolean resumeProgram(){
        return !this.programHalted; //**short code to set boolean to false
    }

    public synchronized void haltProgram(){
        this.programHalted = true;
    }

    public void paintComponent(Graphics g) {

        //**RGB components(values are in range 0 – 255)
        super.paintComponent(g);
        int w = getWidth();
        int h = getHeight();

        double lines = 15.0; // **how spread out the lines are? NO.

        // Draw the lines
        for (int i = 0; i < lines; i++)
        {
            int w2 = (int) ((i / lines) * w);
            int h2 = (int) ((i / lines) * h);

            generateRGB(g); // randomize the line colors

            g.drawLine(0, h2, w2, h); // 0 and h determine the geometry of the lines, use to reorient
            g.drawLine(w2, h, w, h - h2);
            g.drawLine(w, h2, w2, 0);
            g.drawLine(w2, 0, 0, h - h2);
        }
    }


    /**
     * Takes in Graphics object and sets the color using RGB values.
     * @param g the Graphics object that the color will be applied to.
     */
    protected void generateRGB(Graphics g){
            Random randNum = new Random();
            int red, green, blue;
            red = randNum.nextInt(256);
            green = randNum.nextInt(256);
            blue = randNum.nextInt(256);

            g.setColor(new Color(red, green, blue));
    }

    @Override
    public void run() {
        while(!programHalted){ // while flag to pause is not set to true.
            // **pretend to do stuff until I figure this out.
            System.out.println("Doing stuff...");
            try{
                Thread.sleep(50000); // for some amount of time.
                // **Professor put this (3L * 1000L) as the sleep time, wtf is this?
            } catch (InterruptedException e){
                e.printStackTrace(); // **Using java.lang.thread - can throw exceptions so we must handle them when using it.
            }
        }
    }

    /**
     * package protected method that increases the LiningPanel counter.
     */
    protected void increaseCounter() {
        // counter ++ //I'm assuming?
    }
}
