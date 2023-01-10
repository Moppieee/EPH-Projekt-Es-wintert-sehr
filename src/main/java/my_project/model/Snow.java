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
        this.x = Math.random()*600;
        this.y = Math.random()*-500 ;
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
        y = y + 100*dt;
        if (y > 650){
            y = -50;
        }
    }

}
