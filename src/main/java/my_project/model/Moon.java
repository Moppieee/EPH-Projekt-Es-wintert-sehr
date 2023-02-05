package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;


public class Moon extends GraphicalObject {

    /**

     * @param x Startposition x
     * @param y Startposition y
     */
    public Moon(double x, double y){
        this.x = x;
        this.y = y;
        this.setNewImage("src/main/resources/graphic/best.jpg");
    }

    @Override
    public void draw(DrawTool drawTool) {
        //drawTool.drawImage(this.getMyImage(),0,0);
        drawTool.setCurrentColor(Color.gray);
        drawTool.drawFilledCircle(x,y,100); //mond an sich
        drawTool.setCurrentColor(Color.darkGray);
        drawTool.drawFilledCircle(x+15,y+20,19); // krater
        drawTool.drawFilledCircle(x-20,y-50,12); // krater
        drawTool.drawFilledCircle(x+40,y-60,23); // krater
        drawTool.drawFilledCircle(x+49,y-14,14); // krater



    }

    /**
     * Wird mit jedem Frame vom Framework aufgerufen und dient zur Manipulation des Objekts im Verlauf
     * der Zeit.
     * @param dt die Sekunden, die seit dem letzten Aufruf von update vergangen sind
     */
    @Override
    public void update(double dt){
        x = x + 25*dt;
        if (x > 690){
            x = -230;
        }
    }

}