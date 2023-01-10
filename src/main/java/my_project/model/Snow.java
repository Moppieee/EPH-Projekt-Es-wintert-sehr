package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;


public class Snow extends GraphicalObject {

    /**

     * @param x Startposition x
     * @param y Startposition y
     */
    public Snow(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(Color.white);
        drawTool.drawFilledCircle(x,y,5);
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