package shapes;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Blake Bennett on 11/10/2016.
 */
public class myShape {


    public shapeTypes shapeType;
    public int startX, startY, width, length;
    public boolean filledIn;
    public Color shapeColor;

    public myShape(shapeTypes st, int sX, int sY, int w, int l, boolean filled){

        this.startX = sX;
        this.startY = sY;
        this.width = w;
        this.length = l;
        this.shapeType = st;
        this.filledIn = filled;
        this.shapeColor = Color.black;



    }

    //override method for color changing
    public myShape(shapeTypes st, int sX, int sY, int w, int l, boolean filled, Color c){

        this.startX = sX;
        this.startY = sY;
        this.width = w;
        this.length = l;
        this.shapeType = st;
        this.filledIn = filled;
        this.shapeColor = c;



    }

}
