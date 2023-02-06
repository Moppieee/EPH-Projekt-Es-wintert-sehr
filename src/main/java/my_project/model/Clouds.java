package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;


public class Clouds extends GraphicalObject {

    /**

     * @param x Startposition x
     * @param y Startposition y
     */
    public Clouds(double x, double y){
        this.x = x;
        this.y = y;
        this.setNewImage("src/main/resources/graphic/cloud.jpg");
    }

    @Override
    public void draw(DrawTool drawTool) {
        drawTool.drawImage(this.getMyImage(),x,y);
        drawTool.setCurrentColor(new Color(90, 84, 84, 82));
        drawTool.drawFilledCircle(x,y,20);
        drawTool.drawFilledCircle(x+18,y-8,20);
        drawTool.drawFilledCircle(x+40,y,26);

    }

    /**
     * Wird mit jedem Frame vom Framework aufgerufen und dient zur Manipulation des Objekts im Verlauf
     * der Zeit.
     * @param dt die Sekunden, die seit dem letzten Aufruf von update vergangen sind
     */
    @Override
    public void update(double dt){
        x = x + 34*dt;
        if (x > 690){
            x = -230;
        }
    }

}