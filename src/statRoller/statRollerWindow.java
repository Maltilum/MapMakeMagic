package statRoller;

import main.randomGeneration.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Created by Blake Bennett on 12/7/2016.
 */
public class statRollerWindow {
    public JPanel main;
    private JLabel Strength;
    private JTextField strengthTextFeild;
    private JButton strButton;
    private JTextField conTextFeild;
    private JButton conButton;
    private JTextField dexTextFeild;
    private JButton dexButton;
    private JFormattedTextField intTextFeild;
    private JButton intButton;
    private JTextField wisdomTextFeild;
    private JButton widButton;
    private JButton chaButton;
    private JTextField chaTextFeild;
    private JButton roleAllButton;

    private diceRoleSimulation diceRoller;


    public statRollerWindow() {

        diceRoller = new diceRoleSimulation();




        strButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random rn = new Random();

                strengthTextFeild.setText(Integer.toString(diceRoller.role4DropLowest(diceTypes.d6, roleTypes.normal)));
            }
        });
    }
}
