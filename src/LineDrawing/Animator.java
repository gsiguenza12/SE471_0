/******
 * Lab 0 Animator gui class to implement java awt
 * used for SE 471 lab 0, with Dr. Simon Fan
 *
 * @author Gabriel Siguenza
 * <sigue005@cougars.csusm>
 * @author Uma Nair
 *
 * Notes: ** indicates unecessary comments to be deleted... including this one **
 **/
package LineDrawing;

public class Animator implements Runnable {

    private LiningPanel d; // Create a Lining panel object
    private boolean animStopped = false; // set flag for run status

    public Animator(LiningPanel a){d = a;} //** explanation: Constructor for Animator
    // takes a Graphics object and references it.


    /**
     * Since Lining panel d, is our local private variable we invoke methods using d.methodName()
     */
    @Override
    public void run() {
        while(true) {       // **infinite loop
            if(!isAnimStopped()){
                d.repaint(); // **calling repaint method from Java component to redraw our Graphics object
                d.increaseCounter();
            }

            try{
                Thread.sleep(300);
            }catch(Exception e){}
        }
    }

    public void setD(LiningPanel dNew){
        this.d = dNew;
    }

    public boolean isAnimStopped(){
        return animStopped;
    }
}

