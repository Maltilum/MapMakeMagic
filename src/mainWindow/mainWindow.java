package mainWindow;

import statRoller.statRollerWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Blake Bennett on 12/13/2016.
 */
public class mainWindow {


    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JButton statRollerButton;

    public mainWindow() {

    }

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

        JFrame statRollerFrame = new JFrame("statRollerWindow");
        statRollerFrame.setContentPane(new statRollerWindow().main);
        statRollerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        statRollerFrame.pack();
        statRollerFrame.setResizable(false);
        statRollerFrame.setVisible(true);

    }

    public void addStatRollerTab(){

        JComponent sRW = new statRollerWindow().main;
        sRW.setName("Stat Roller");
        tabbedPane1.add(sRW);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
