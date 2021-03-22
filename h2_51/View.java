//**************************************************************************************************
// CLASS: View
//
// DESCRIPTION
// Implements the GUI for a calculator.
//**************************************************************************************************
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Implements the GUI for a calculator.
 */
public class View extends JFrame implements ActionListener {

    public static final int FRAME_WIDTH  = 500;
    public static final int FRAME_HEIGHT = 200;

    private JTextField mText;

    /**
     * Default ctor. Does nothing.
     */
    public View() {
        // Declare and create a JPanel named panelFunctButton. Set the layout manager to GridLayout
        // with 2 rows and 2 columns. Call addButton() to add buttons labeled "x^y", "log 10",
        // "log e", and "sqrt".
        ???

        // Declare and create a JPanel named panelSysButton. Use the default FlowLayout layout
        // manager. Call addButton() to add buttons labeled "Clear", "About", and "Exit".
        ???

        // Declare and create a JPanel named panelFunctSys. Use the BorderLayout layout manager.
        // Add panelFunctButton to the CENTER region. Add panelSysButton to the SOUTH region.
        ???

        // Declare and create a JPanel named panelKeypad. Use the GridLayout layout manager with
        // 4 rows and 4 columns. Call addButton() to add the buttons labeled "7", "8", "9", and so
        // on.
        ???

        // Declare and create a new JPanel named panelBottom. Use the horizontal BoxLayout layout
        // manager. Add panelKeypad. Add a 10-pixel wide rigid area (using Box.createRigidArea()).
        // Add panelFunctSys.
        ???

        // Declare and create a JPanel named panelTextField. Use the default FlowLayout layout
        // manager. Create the mText JTextField making it 30 columns wide. Add mText to the
        // panelTextField panel.
        ???

        // Declare and create a JPanel named panelLabel. Use the default FlowLayout layout manager.
        // Declare and create a JLabel named label displaying "Kalkutron-9000" or whatever you
        // want to display. Add label to panelLabel.
        ???

        // Declare and create a JPanel named panelMain. Use the vertical BoxLayout layout manager.
        // Add some vertical glue to panelMain (using Box.createVerticalGlue()). Add panelLabel.
        // Add some more vertical glue. Add panelTextField. Add panelBottom. Add some more vertical
        // glue.
        ???

        // Set the title bar string of this JFrame.
        setTitle("Kalkutron-9000");

        // Set the width and height of this JFrame.
        setSize(FRAME_WIDTH, FRAME_HEIGHT);

        // Configure this JFrame so the frame will be closed and the application were terminate when
        // the X button on the title bar is closed.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add panelMain to this JFrame.
        add(panelMain);

        // Make this JFrame visible.
        setVisible(true);
    }

    /**
     * Declare and create a JButton object displaying pText. Make this JFrame the action listener
     * for button events. Add the button to pPanel.
     */
    private void addButton(JPanel pPanel, String pText) {
        JButton button = new JButton(pText);
        button.addActionListener(this);
        pPanel.add(button);
    }

    /**
     * Implementation of the actionPerformed() method of the ActionListener interface.
     */
    @Override
    public void actionPerformed(ActionEvent pEvent) {
        // If the source of the event is a JButton, calling pEvent.getActionCommand() will return
        // the text displayed on the button face. For example, when the Exit button is clicked,
        // pEvent.getActionCommand() would return "Exit".

        // Write code that determines if the Exit button is the source of the event and if so,
        // exit the application by calling System.exit().
        ???

        // Write code that determines if the About button is the source of the event and if so,
        // display the about dialog using JOptionPane.showMessageDialog().
        ???
    }

}
