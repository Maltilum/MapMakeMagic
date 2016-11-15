package main;

/**
 * Created by Blake Bennett on 10/28/2016.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

public class main {

    //main funtion
    public static void main(String[] args){
    //create window
    JFrame frame2 = new JFrame("main window");

    //set window close operaton
    frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //make window vissible
    frame2.setVisible(true);


    //create paintable panel inside window
    testWindow Twin = new testWindow();

    frame2.add(Twin, BorderLayout.CENTER);

    //create clear button inside window
    JButton jb = new JButton("clear");

    jb.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Twin.clearPaintCanvas();

        }
    });

    //create tool bar inside window
    frame2.add(jb, BorderLayout.SOUTH);


    JToolBar toolbar = new JToolBar("Tools");

        createToolbarButons(toolbar, Twin);
    frame2.add(toolbar, BorderLayout.NORTH);


    frame2.pack();


}//end of main fucntion

   static public void createToolbarButons(JToolBar tb, testWindow tw){
        //create button
        JButton bFreeHand = new JButton("Free Hand");
        JButton bLine =  new JButton("Line");
        JButton bSquare = new JButton("Square");

        //create action listeners
        bFreeHand.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tw.toolMode = toolModes.FREE_HAND;
                System.out.println("Free Hand Mode Selected");

            }


        });

        bLine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tw.toolMode = toolModes.LINE;
                System.out.println("Line Mode Selected");

            }


        });
        bSquare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tw.toolMode = toolModes.SQUARE;
                System.out.println("Square tool selelcted");
            }
        });



        //adding buttons
        tb.add(bFreeHand);
        tb.add(bLine);
        tb.add(bSquare);



    }



    }



