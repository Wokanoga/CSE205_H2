/*********************************************************************************************************
 * CLASS: Main (Main.java)
 *
 * DESCRIPTION
 * It's main and runs the thing.  Final conclusion: swing > windows forms
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
import javax.swing.JFrame;

public class Main {

    public static void main(String[] pArgs) {
        new Main().run();
    }

    public void run() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        View view = new View();
    }

}
