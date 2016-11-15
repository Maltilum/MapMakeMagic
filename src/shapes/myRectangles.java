package shapes;

import java.awt.*;

/**
 * Created by Blake Bennett on 10/29/2016.
 */
public class myRectangles {

   public int x;
    public int y;
    public int width;
    public int length;
    public Color drawColor;
    public boolean filled;

    public myRectangles(int lx, int ly, int lwidth, int llength){

        this.x = lx;
        this.y = ly;
        this.width = lwidth;
        this.length = llength;
        drawColor = Color.black;
        filled = false;




    }
    public myRectangles(int lx, int ly, int lwidth, int llength, boolean isFilled){

        this.x = lx;
        this.y = ly;
        this.width = lwidth;
        this.length = llength;
        this.drawColor = Color.black;
        this.filled = isFilled;




    }

    public myRectangles(int lx, int ly, int lwidth, int llength, Color c){

        this.x = lx;
        this.y = ly;
        this.width = lwidth;
        this.length = llength;
        drawColor = c;




    }



}
