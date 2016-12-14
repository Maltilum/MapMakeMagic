package mainWindow;

import statRoller.statRollerWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import diceRolling.*;

/**
 * Created by Blake Bennett on 12/13/2016.
 */
public class mainWindow {


    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JButton button1;
    private JButton statRollerButton;

    public mainWindow() {


        panel1.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);

            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createDiceRollerWindow();
            }
        });
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
        statRollerFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        statRollerFrame.pack();
        statRollerFrame.setResizable(false);
        statRollerFrame.setVisible(true);

    }

    public void createDiceRollerWindow(){

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        JFrame statRollerFrame = new JFrame("Dice Roller");
        statRollerFrame.setContentPane(new diceRoleWindow().main);
        statRollerFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

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
