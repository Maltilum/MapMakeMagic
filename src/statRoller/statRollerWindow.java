package statRoller;

import randomGeneration.*;

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
        conButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                conTextFeild.setText(Integer.toString(diceRoller.role4DropLowest(diceTypes.d6, roleTypes.normal)));
            }
        });
        dexButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dexTextFeild.setText(Integer.toString(diceRoller.role4DropLowest(diceTypes.d6, roleTypes.normal)));
            }
        });
        intButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                intTextFeild.setText(Integer.toString(diceRoller.role4DropLowest(diceTypes.d6, roleTypes.normal)));
            }
        });
        widButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wisdomTextFeild.setText(Integer.toString(diceRoller.role4DropLowest(diceTypes.d6, roleTypes.normal)));
            }
        });
        chaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chaTextFeild.setText(Integer.toString(diceRoller.role4DropLowest(diceTypes.d6, roleTypes.normal)));
            }
        });
        roleAllButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                strengthTextFeild.setText(Integer.toString(diceRoller.role4DropLowest(diceTypes.d6, roleTypes.normal)));
                conTextFeild.setText(Integer.toString(diceRoller.role4DropLowest(diceTypes.d6, roleTypes.normal)));
                dexTextFeild.setText(Integer.toString(diceRoller.role4DropLowest(diceTypes.d6, roleTypes.normal)));
                intTextFeild.setText(Integer.toString(diceRoller.role4DropLowest(diceTypes.d6, roleTypes.normal)));
                wisdomTextFeild.setText(Integer.toString(diceRoller.role4DropLowest(diceTypes.d6, roleTypes.normal)));
                chaTextFeild.setText(Integer.toString(diceRoller.role4DropLowest(diceTypes.d6, roleTypes.normal)));
            }
        });
    }
}
