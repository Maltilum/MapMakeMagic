package tools;

import main.testWindow;
import shapes.myLine;

import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.sun.corba.se.impl.orbutil.graph.Graph;
import shapes.*;

import java.util.ArrayList;

/**
 * Created by Blake Bennett on 10/29/2016.
 */
public class lineTool implements toolInterface {
    @Override
    public void useTool(testWindow window) {
        //window.myDrawLine((Graphics2D) window.getGraphics(), new myLine());
    }
}
