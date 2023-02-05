package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;


public class House extends GraphicalObject {

    /**

     * @param x Startposition x
     * @param y Startposition y
     */
    public House(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(Color.red);
        drawTool.drawFilledRectangle(x+2,y,40,50);
        drawTool.setCurrentColor(Color.white);
        drawTool.drawFilledRectangle(x,y,44,5);
        drawTool.drawFilledRectangle(x+4,y+42,6,8);  //tür
        drawTool.drawFilledRectangle(x+14,y+42,5,5); //Fenster
        drawTool.drawFilledRectangle(x+25,y+42,5,5); //Fenster
        drawTool.drawFilledRectangle(x+14,y+32,5,5); //Fenster
        drawTool.drawFilledRectangle(x+25,y+32,5,5); //Fenster
        drawTool.drawFilledRectangle(x+14,y+22,5,5); //Fenster
        drawTool.drawFilledRectangle(x+25,y+22,5,5); //Fenster
        drawTool.drawFilledRectangle(x+14,y+12,5,5); //Fenster
        drawTool.drawFilledRectangle(x+25,y+12,5,5); //Fenster

    }

    /**
     * Wird mit jedem Frame vom Framework aufgerufen und dient zur Manipulation des Objekts im Verlauf
     * der Zeit.
     * @param dt die Sekunden, die seit dem letzten Aufruf von update vergangen sind
     */
    @Override
    public void update(double dt){

    }

}