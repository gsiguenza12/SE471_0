/******
 * Lab 0 CommandPanel gui class to implement java awt
 * used for SE 471 lab 0, with Dr. Simon Fan
 *
 * @author Gabriel Siguenza
 * <sigue005@cougars.csusm>
 * @author Uma Nair
 *
 * Notes: This file is not used in the program yet.
 *  ** All calls to Swing objects must be made on the event-dispatching thread.
 **/
package LineDrawing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList; // **CHANGE

class CommandPanel extends JPanel  {


    // make JButton here?
    JPanel buttonPanel;
    JButton theOnlyButton; // How to dynamically update the text?


    private static final long serialVersionUID = 1L;
    private static final int FONT_SIZE = 14;

    private final LinkedList<String> commandBuffer  = new LinkedList<>(); // using linked list as a queue to hold commands(commandBuffer).


    CommandPanel() {
        buttonPanel = new JPanel();
        theOnlyButton = new JButton();
        buttonPanel.add(theOnlyButton);

        theOnlyButton.setText("Draw");

        this.add(theOnlyButton);
        this.add(buttonPanel);

        class AddActionListener implements ActionListener {
            public void actionPerformed(ActionEvent event) {
//                synchronized(commandBuffer) {
//                    commandBuffer.add(commandField.getText());
//                    commandField.setText("");
//                    commandBuffer.notify();
//                }
            }
        }

        ActionListener listener = new AddActionListener();

    }

    /**
     *
     * @return
     */
    String getCommand() {
        String command;
        synchronized(commandBuffer) {
            while (commandBuffer.isEmpty()) {
                try {
                    commandBuffer.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            command = commandBuffer.pop();
        }
        return command;
    }

}