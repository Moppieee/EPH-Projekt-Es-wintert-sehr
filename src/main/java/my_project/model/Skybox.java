package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;


public class Skybox extends GraphicalObject {

    /**

     * @param x Startposition x
     * @param y Startposition y
     */
    public Skybox(double x, double y){
        this.x = x;
        this.y = y;
        this.setNewImage("src/main/resources/graphic/best.jpg");
    }

    @Override
    public void draw(DrawTool drawTool) {
        //drawTool.drawImage(this.getMyImage(),0,0);
        drawTool.setCurrentColor(Color.gray);
        drawTool.drawFilledTriangle(x,y,x+135,y-100,x+230,y);


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