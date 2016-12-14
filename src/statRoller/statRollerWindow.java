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
    private JButton strengthIncrease;
    private JButton strengthDecrease;
    private JButton consitutionIncrease;
    private JButton constitutionDecrease;
    private JButton dexterityIncrease;
    private JButton dexterityMinus;
    private JButton intelligenceDecrease;
    private JButton intelligenceIncrease;
    private JButton wisdomDecrease;
    private JButton wisdomIncrease;
    private JButton charismaDecrease;
    private JButton charismaIncrease;

    private diceRoleSimulation diceRoller;


    public statRollerWindow() {

        diceRoller = new diceRoleSimulation();



//-----------------------------------------------------------------Random Roles------------------------------------------------------------------
        strButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


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

        //Random all at once
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

        //Manuel Add and subtract
        strengthIncrease.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int temp = Integer.parseInt(strengthTextFeild.getText());
                temp++;
                strengthTextFeild.setText(String.valueOf(temp));
            }
        });
        strengthDecrease.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int temp = Integer.parseInt(strengthTextFeild.getText());
                temp--;
                strengthTextFeild.setText(String.valueOf(temp));

            }
        });
        consitutionIncrease.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int temp = Integer.parseInt(conTextFeild.getText());
                temp++;
                conTextFeild.setText(String.valueOf(temp));
            }
        });
        constitutionDecrease.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int temp = Integer.parseInt(conTextFeild.getText());
                temp--;
                conTextFeild.setText(String.valueOf(temp));
            }
        });
        dexterityIncrease.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int temp = Integer.parseInt(dexTextFeild.getText());
                temp++;
                dexTextFeild.setText(String.valueOf(temp));
            }
        });
        dexterityMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int temp = Integer.parseInt(dexTextFeild.getText());
                temp--;
                dexTextFeild.setText(String.valueOf(temp));
            }
        });
        intelligenceIncrease.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int temp = Integer.parseInt(intTextFeild.getText());
                temp++;
                intTextFeild.setText(String.valueOf(temp));
            }
        });
        intelligenceDecrease.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int temp = Integer.parseInt(intTextFeild.getText());
                temp--;
                intTextFeild.setText(String.valueOf(temp));
            }
        });
        wisdomIncrease.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int temp = Integer.parseInt(wisdomTextFeild.getText());
                temp++;
                wisdomTextFeild.setText(String.valueOf(temp));
            }
        });
        wisdomDecrease.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int temp = Integer.parseInt(wisdomTextFeild.getText());
                temp--;
                wisdomTextFeild.setText(String.valueOf(temp));
            }
        });
        charismaIncrease.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int temp = Integer.parseInt(chaTextFeild.getText());
                temp++;
                chaTextFeild.setText(String.valueOf(temp));
            }
        });
        charismaDecrease.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int temp = Integer.parseInt(chaTextFeild.getText());
                temp--;
                chaTextFeild.setText(String.valueOf(temp));
            }
        });
    }
}
