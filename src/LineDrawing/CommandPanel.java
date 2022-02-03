/******
 * Lab 0 CommandPanel gui class to implement java awt
 * used for SE 471 lab 0, with Dr. Simon Fan
 *
 * @author Gabriel Siguenza
 * <sigue005@cougars.csusm>
 * @author Uma Nair
 *
 * Note: This file is not used in the program yet.
 **/
package LineDrawing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList; // **CHANGE

class CommandPanel extends JPanel  {

    private static final long serialVersionUID = 1L;
    private static final int FONT_SIZE = 14;

//    private final JTextField commandField =  new JTextField(); // this takes commands as input into a text field
    private final LinkedList<String> commandBuffer  = new LinkedList<>(); // using linked list as a queue to hold commands(commandBuffer).

    // TODO: Add JButton!
    CommandPanel() {
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

        // **Fancy extra stuff and not using JtextField
//        commandField.addActionListener(listener);
//        commandField.setFont(new Font("Times New Roman", Font.PLAIN, FONT_SIZE));
//        setLayout(new BorderLayout());
//        add(commandField, BorderLayout.CENTER);
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