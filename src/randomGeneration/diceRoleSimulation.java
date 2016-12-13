package randomGeneration;

import java.util.Arrays;

/**
 * Created by Blake Bennett on 12/7/2016.
 */
public class diceRoleSimulation {

    //the simiplest of all the dice rollers it just roles a dice strait up
    public int roleDice(diceTypes dt){
        int maxValue;
        switch(dt){
            case d6: maxValue = 6; break;
            case d8: maxValue = 8; break;
            case d10: maxValue = 10; break;
            case d12: maxValue = 12; break;
            case d20: maxValue = 20; break;
            default: maxValue = 0; break;
        }
        return ((int)Math.ceil(Math.random()*maxValue));
    }

    //This dice role function roles a dice with types of roles such as advantage, disadvantage, and with a modifer added
    public int roleDiceWithRoleTypes(diceTypes dt, roleTypes rt, int modifer){

        int finalValue;
        int firstValue;
        int secondValue;

        firstValue = roleDice(dt);
        secondValue = roleDice(dt);

        switch (rt){
            case normal:
                finalValue = firstValue;
            break;
            case advantage:
               finalValue = Math.max(firstValue, secondValue);
               break;

            case disadvantage:
                finalValue = Math.min(firstValue, secondValue);
                break;
            default: finalValue = 0;
        }

        return finalValue + modifer;
    }

    public int role4DropLowest(diceTypes dt, roleTypes rt){
        int finalValue = 0;

        int[] roleArray = new int[4];
        for(int x = 0; x<roleArray.length; x++){

            roleArray[x] = roleDiceWithRoleTypes(dt, rt, 0);

        }

        Arrays.sort(roleArray);

        for(int x = 0; x<roleArray.length; x++){


            System.out.println(roleArray[x]);
        }

        finalValue = roleArray[3] + roleArray[2] + roleArray[1];

        return finalValue;
    }

    //This roles more than one dice
    public int roleMultipleDice(diceTypes dt, int numberOfDice, roleTypes rt, int modifier){
        int finalvalue = 0;

        for(int x = 0; x<numberOfDice; x++){
            finalvalue += roleDiceWithRoleTypes(dt, rt, 0);
        }


        finalvalue += modifier;
        return finalvalue;
    }

}
