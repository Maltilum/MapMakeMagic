package diceRolling;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import randomGeneration.*;

/**
 * Created by Blake Bennett on 12/14/2016.
 */
public class diceRoleWindow {
    private JSpinner numberOfDice;
    private JComboBox diceTypesComboBox;
    private JButton roleButton;
    private JTextField totalTextFeild;
    private JComboBox roleTypeComboBox;
    public JPanel main;


    private diceRoleSimulation diceRoller;



    public diceRoleWindow() {
        diceRoller = new diceRoleSimulation();



        roleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                totalTextFeild.setText(Integer.toString(diceRoller.roleMultipleDice(getDiceTypeFromComboBox(diceTypesComboBox), (Integer) numberOfDice.getValue(), getRoleTypeFromComboBox(roleTypeComboBox), 0)));
            }
        });
    }

    private diceTypes getDiceTypeFromComboBox(JComboBox comboBox){
        diceTypes dt;
        switch(comboBox.getSelectedIndex()){

            case 0: dt = diceTypes.d20; break;
            case 1: dt = diceTypes.d12; break;
            case 2: dt = diceTypes.d10; break;
            case 3: dt = diceTypes.d8; break;
            case 4: dt = diceTypes.d6; break;
            case 5: dt = diceTypes.d4; break;
            case 6: dt = diceTypes.percentile; break;
            default: System.out.println("dice type error");
                    dt = diceTypes.d4;
                    break;


        }
        return dt;
    }

    private roleTypes getRoleTypeFromComboBox(JComboBox comboBox){
        roleTypes rt;

        switch (comboBox.getSelectedIndex()){

            case 0: rt = roleTypes.normal; break;
            case 1: rt = roleTypes.advantage; break;
            case 2: rt = roleTypes.disadvantage; break;
            default: rt = roleTypes.normal; break;

        }

        return rt;
    }
}
