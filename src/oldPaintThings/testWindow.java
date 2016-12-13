package oldPaintThings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import shapes.*;

import java.util.ArrayList;

 /* Created by Blake Bennett on 10/28/2016.
 */
public class testWindow extends JPanel implements MouseListener, MouseMotionListener{

    ArrayList<myShape> myShapeList = new ArrayList<myShape>();

     int mouseLastX, mouseLastY, startDragX, startDragY;

     //scroll offsets form drawing
     int scroll_x=20, scroll_y;


     //this int controls what tool is being used
     public toolModes toolMode = toolModes.FREE_HAND;

     //this draw buffer holds the dta of shapes which are currently being drawn by tools
     myShape drawBuffer;

     //constructor for this class
    public testWindow(){

        this.setBackground(Color.white);
        this.setForeground(Color.black);
        this.setPreferredSize(new Dimension( Toolkit.getDefaultToolkit().getScreenSize().width/2, Toolkit.getDefaultToolkit().getScreenSize().height/2));
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        this.setVisible(true);

       // myShape eshape = new myShape( shapeTypes.CIRCLE, 25,25,40,40, false);
       myShape fshape = new myShape(shapeTypes.SQUARE, 45, 10, 50, 50, true, Color.red);
       // myShapeList.add(eshape);
        myShapeList.add(fshape);
    }

     //--------------------------------------------------------------------painting shapes once added stuff starts ----------------------------------------
    @Override
        public void paint(Graphics g){

       super.paint(g);
        Graphics2D g2D = (Graphics2D) g;


        for(int x = 0; x<myShapeList.size(); x++){

            myShape shape = myShapeList.get(x);
            shape.startX = shape.startX-scroll_x;
            shape.startY = shape.startY-scroll_y;

            switch(myShapeList.get(x).shapeType){
                //handels drawing circles
                case CIRCLE:
                    myDrawCicle(shape, g2D);
                    break;

                case SQUARE:
                    myDrawRectangle(shape, g2D);
                    break;
                case LINE:
                    shape.width = shape.width-scroll_x;
                    shape.length = shape.width-scroll_y;
                    myDrawLine(shape, g2D);
                    break;
                default: break;

            }

        }


        //draws the buffered shape
        if(drawBuffer != null)
        switch(drawBuffer.shapeType){
            //handels drawing circles
            case CIRCLE:
                myDrawCicle(drawBuffer, g2D);
                break;

            case SQUARE:
                myDrawRectangle(drawBuffer, g2D);
                break;
            case LINE:
                myDrawLine(drawBuffer, g2D);
                break;
            default: break;

        }

}
//-------------------------------------------------------------------------------Paint Stuff Ends------------------------------------------------------------------------


public void setWindowSize(int x, int y){

    this.setPreferredSize(new Dimension(x, y));

}


public void clearPaintCanvas(){

myShapeList.clear();
this.repaint();


}


//----------------------------------------------------------------------------------Draw shape functions----------------------------------------------------------------------------
//class which draws cicles
public void myDrawCicle(myShape shape, Graphics2D g2D){

    g2D.setColor(shape.shapeColor);
    g2D.drawOval(shape.startX, shape.startY,shape.width, shape.length);
    if(shape.filledIn)
        g2D.fillOval(shape.startX, shape.startY,shape.width, shape.length);

}

public void myDrawRectangle(myShape shape, Graphics2D g2D){
    g2D.setColor(shape.shapeColor);

    g2D.drawRect(shape.startX, shape.startY, shape.width, shape.length);

    if(shape.filledIn){
        g2D.fillRect(shape.startX, shape.startY, shape.width, shape.length);
    }

}

public void myDrawLine(myShape shape, Graphics2D g2D){
    g2D.setColor(shape.shapeColor);

    g2D.drawLine(shape.startX, shape.startY, shape.width, shape.length);



}

//does some simple math to get rectangles to work right
public myShape myCreateRectangle(int x1, int y1, int x2, int y2){


            return new myShape(shapeTypes.SQUARE, Math.min(x1, x2), Math.min(y1, y2), Math.abs(x1-x2), Math.abs(y1-y2), false, Color.black);
}



     //Mouse interface stuff---------------------------------------------------------------------------------------------------------------------------------------------------
     public void mouseClicked(MouseEvent e) {
         if(e.getButton() == MouseEvent.BUTTON2){
        /*
             mouseLastX = e.getX();
             mouseLastY = e.getY();

             startDragX = e.getX();
             startDragY = e.getY();

             drawBuffer = null;
             repaint();
*/
         }

    }

    public void mousePressed(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1)
            switch (toolMode) {
                case FREE_HAND:

                    myShapeList.add(new myShape(shapeTypes.LINE, mouseLastX, mouseLastY, e.getX(), e.getY(), false));
                    repaint();
                    mouseLastX = e.getX();
                    mouseLastY = e.getY();
                    break;

                case LINE:
                    drawBuffer = new myShape(shapeTypes.LINE, e.getX(), e.getY(), e.getX(), e.getY(), false);

                    mouseLastX = e.getX();
                    mouseLastY = e.getY();
                    repaint();


                    break;

                case SQUARE:

                    startDragX = e.getX() ;
                    startDragY = e.getY();
                    mouseLastX = startDragX;
                    mouseLastY = startDragY;
                    drawBuffer = myCreateRectangle(startDragX, startDragY, mouseLastX, mouseLastY);
                    repaint();

                    break;

    }


    }
    public void mouseReleased(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1)
        switch(toolMode) {

            case FREE_HAND: break;
            case LINE:

                myShapeList.add(drawBuffer);
                drawBuffer = null;

                break;
            case SQUARE:

                myShapeList.add(drawBuffer);
                drawBuffer = null;
                break;

        }

    }

    public void mouseEntered(MouseEvent e) {
        switch(toolMode) {
            case FREE_HAND:

                mouseLastX = e.getX();
                mouseLastY = e.getY();

                break;

            case LINE:



                break;
        }

    }

    public void mouseExited(MouseEvent e) {
    }


     @Override
     public void mouseDragged(MouseEvent e) {


         switch(toolMode) {
             case FREE_HAND:


                 myShapeList.add(new myShape( shapeTypes.LINE, mouseLastX, mouseLastY, e.getX(), e.getY(), false));
                 repaint();
                 mouseLastX = e.getX();
                 mouseLastY = e.getY();
                 break;

             case LINE:
                 drawBuffer = new myShape(drawBuffer.shapeType, drawBuffer.startX, drawBuffer.startY, e.getX(), e.getY(), drawBuffer.filledIn, drawBuffer.shapeColor);

                 mouseLastX = e.getX();
                 mouseLastY = e.getY();
                 repaint();


                 break;

             case SQUARE:


                 mouseLastX = e.getX();
                 mouseLastY = e.getY();
                 drawBuffer = myCreateRectangle(startDragX, startDragY, mouseLastX, mouseLastY);


                 repaint();

                 break;
     }
     }

     @Override
     public void mouseMoved(MouseEvent e) {
         switch(toolMode) {
             case FREE_HAND:
                 mouseLastX = e.getX();
                 mouseLastY = e.getY();
                 break;


         }


     }
 }
