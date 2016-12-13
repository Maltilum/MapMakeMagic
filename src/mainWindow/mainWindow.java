package mainWindow;

import statRoller.statRollerWindow;

import javax.swing.*;

/**
 * Created by Blake Bennett on 12/13/2016.
 */
public class mainWindow {


    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JTree tree1;

    public static void main(String[] args) {
        mainWindow mW = new mainWindow();
        mW.createMainWindow();


    }

    public void createMainWindow(){

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        JFrame frame = new JFrame("Main Window");
        frame.setContentPane(new mainWindow().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();
        frame.setResizable(true);
        frame.setVisible(true);



    }


    public void createStatRollerWindow(){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        JFrame frame = new JFrame("statRollerWindow");
        frame.setContentPane(new statRollerWindow().main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
