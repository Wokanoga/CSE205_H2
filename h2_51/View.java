/*********************************************************************************************************
 * CLASS: View (View.java)
 *
 * DESCRIPTION
 * The view class handles everything about our makeshift calculator gui
 *
 * COURSE AND PROJECT INFORMATION
 * CSE205 Object Oriented Programming and Data Structures, Spring Session B and 2021
 * Project Number: 02
 *
 * GROUP INFORMATION
 * AUTHOR 1: Steve Tippeconnic, stippeco, stippeco@asu.edu
 * AUTHOR 2: Allan Nevala, anevala, anevala@asu.edu
 * AUTHOR 3: Harlon Turner, htturner, htturner@asu.edu 
 * AUTHOR 4: Lincoln MacKay, lmackay, lmackay@asu.edu 
 ********************************************************************************************************/
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

    public static final int FRAME_WIDTH = 500;
    public static final int FRAME_HEIGHT = 200;

    private JTextField mText;

    private static final String aboutText = "Kalkutron-9000 Ver 1.0\nAUTHOR 1: Steve Tippeconnic, stippeco, stippeco@asu.edu\nAUTHOR 2: Allan Nevala, anevala, anevala@asu.edu\nAUTHOR 3: Harlon Turner, htturner, htturner@asu.edu\nAUTHOR 4: Lincoln MacKay, lmackay, lmackay@asu.edu";

    /**
     * Default ctor. Does nothing.
     */
    public View() {
        // Declare and create a JPanel named panelFunctButton. Set the layout manager to
        // GridLayout
        // with 2 rows and 2 columns. Call addButton() to add buttons labeled "x^y",
        // "log 10",
        // "log e", and "sqrt".

        // Ok so I thougth panelFunctButton was a button, it is not, it is a banel, the
        // argument for add button does the actual button creation and adds it
        // do the first parameter.
        JPanel panelFunctButtons = new JPanel();
        panelFunctButtons.setLayout(new GridLayout(2, 2));
        addButton(panelFunctButtons, "x^y");
        addButton(panelFunctButtons, "log 10");
        addButton(panelFunctButtons, "log e");
        addButton(panelFunctButtons, "sqrt");

        // Declare and create a JPanel named panelSysButton. Use the default FlowLayout
        // layout
        // manager. Call addButton() to add buttons labeled "Clear", "About", and
        // "Exit".
        // having some trouble with FlowLayout, import statements being weird?
        // Flowlayout is default nevermind omegalul

        JPanel panelSysButtons = new JPanel();
        addButton(panelSysButtons, "Clear");
        addButton(panelSysButtons, "About");
        addButton(panelSysButtons, "Exit");

        // Declare and create a JPanel named panelFunctSys. Use the BorderLayout layout
        // manager.
        // Add panelFunctButton to the CENTER region. Add panelSysButton to the SOUTH
        // region.

        JPanel panelFunctSys = new JPanel();
        panelFunctSys.setLayout(new BorderLayout());
        panelFunctSys.add(panelFunctButtons, BorderLayout.NORTH);
        panelFunctSys.add(panelSysButtons, BorderLayout.SOUTH);

        // Declare and create a JPanel named panelKeypad. Use the GridLayout layout
        // manager with
        // 4 rows and 4 columns. Call addButton() to add the buttons labeled "7", "8",
        // "9", and so
        // on.

        // I made it prettier.
        JPanel panelKeypad = new JPanel();
        panelKeypad.setLayout(new GridLayout(4, 4));
        String[] keys = {"7","8","9","*","4","5","6","/","1","2","3","+","0",".","-","="};
        for (String key: keys){
            addButton(panelKeypad, key);
        }

        // Declare and create a new JPanel named panelBottom. Use the horizontal
        // BoxLayout layout
        // manager. Add panelKeypad. Add a 10-pixel wide rigid area (using
        // Box.createRigidArea()).
        // Add panelFunctSys.

        JPanel panelBottom = new JPanel();
        panelBottom.setLayout(new BoxLayout(panelBottom, BoxLayout.X_AXIS));
        panelBottom.add(panelKeypad);
        panelBottom.add(Box.createRigidArea(new Dimension(10, 0)));
        panelBottom.add(panelFunctSys);

        // Declare and create a JPanel named panelTextField. Use the default FlowLayout
        // layout
        // manager. Create the mText JTextField making it 30 columns wide. Add mText to
        // the
        // panelTextField panel.

        // Not sure why mText was already declared outside View() in the template.
        // Whatever.
        // Oh it's because the event listener is outside view and needs to modify mText.
        JPanel panelTextField = new JPanel();
        mText = new JTextField(30);
        panelTextField.add(mText);

        // Declare and create a JPanel named panelLabel. Use the default FlowLayout
        // layout manager.
        // Declare and create a JLabel named label displaying "Kalkutron-9000" or
        // whatever you
        // want to display. Add label to panelLabel.

        JPanel panelLabel = new JPanel();
        JLabel label = new JLabel("Kulkutron-9000");
        panelLabel.add(label);

        // Declare and create a JPanel named panelMain. Use the vertical BoxLayout
        // layout manager.
        // Add some vertical glue to panelMain (using Box.createVerticalGlue()). Add
        // panelLabel.
        // Add some more vertical glue. Add panelTextField. Add panelBottom. Add some
        // more vertical
        // glue.

        JPanel panelMain = new JPanel();
        panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.Y_AXIS));
        panelMain.add(Box.createVerticalGlue());
        panelMain.add(panelLabel);
        panelMain.add(Box.createVerticalGlue());
        panelMain.add(panelTextField);
        panelMain.add(panelBottom);
        panelMain.add(Box.createVerticalGlue());

        JFrame frame = new JFrame("Kalkutron-9000");

        // Set the title bar string of this JFrame.
        frame.setTitle("Kalkutron-9000");

        // Set the width and height of this JFrame.
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);

        // Configure this JFrame so the frame will be closed and the application were
        // terminate when
        // the X button on the title bar is closed.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add panelMain to this JFrame.
        frame.add(panelMain);

        // Make this JFrame visible.
        frame.setVisible(true);
    }

    /**
     * Declare and create a JButton object displaying pText. Make this JFrame the
     * action listener for button events. Add the button to pPanel.
     */
    private void addButton(JPanel pPanel, String pText) {
        JButton button = new JButton(pText);
        button.addActionListener(this);
        pPanel.add(button);
    }

    /**
     * Implementation of the actionPerformed() method of the ActionListener
     * interface.
     */
    @Override
    public void actionPerformed(ActionEvent pEvent) {
        // If the source of the event is a JButton, calling pEvent.getActionCommand()
        // will return
        // the text displayed on the button face. For example, when the Exit button is
        // clicked,
        // pEvent.getActionCommand() would return "Exit".

        // Write code that determines if the Exit button is the source of the event and
        // if so,
        // exit the application by calling System.exit().

        // Write code that determines if the About button is the source of the event and
        // if so,
        // display the about dialog using JOptionPane.showMessageDialog().
        String eventString = pEvent.getActionCommand();
        if (eventString == "Exit") {
            System.exit(0);
        } else if (eventString == "About") {
            JOptionPane.showMessageDialog(null, aboutText, "About", JOptionPane.PLAIN_MESSAGE);
        } else if (eventString == "Clear") {
            mText.setText("");
        } else if (eventString == "="){
            //cheat and find a way to import a library that attempts to evaluate a string. Or do it the hardway :(
        } else {
            String inputBox = mText.getText();
            inputBox += eventString;
            mText.setText(inputBox);
        }

    }

}
