package my_project.control;

import KAGO_framework.control.ViewController;
import my_project.model.*;

/**
 * Ein Objekt der Klasse ProgramController dient dazu das Programm zu steuern. Die updateProgram - Methode wird
 * mit jeder Frame im laufenden Programm aufgerufen.
 */
public class ProgramController {

    //Attribute


    // Referenzen
    private ViewController viewController;  // diese Referenz soll auf ein Objekt der Klasse viewController zeigen. Über dieses Objekt wird das Fenster gesteuert.

    /**
     * Konstruktor
     * Dieser legt das Objekt der Klasse ProgramController an, das den Programmfluss steuert.
     * Damit der ProgramController auf das Fenster zugreifen kann, benötigt er eine Referenz auf das Objekt
     * der Klasse viewController. Diese wird als Parameter übergeben.
     * @param viewController das viewController-Objekt des Programms
     */
    public ProgramController(ViewController viewController){
        this.viewController = viewController;
    }

    /**
     * Diese Methode wird genau ein mal nach Programmstart aufgerufen.
     * Sie erstellt die leeren Datenstrukturen, zu Beginn nur eine Queue
     */
    public void startProgram() {
        // Erstelle ein Objekt der Klasse Ball und lasse es zeichnen
        Ball ball1 = new Ball(150,150);
        Floor f1 = new Floor(0,500);
        Skybox Sky1 = new Skybox(60,500);
        Skybox Sky2 = new Skybox(300,500);
        House H1 = new House(100,450);
        House H2 = new House(180,450);
        House H3 = new House(280,450);
        Moon M1 = new Moon(30,80);
        viewController.draw(f1);
        viewController.draw(Sky1);
        viewController.draw(Sky2);
        viewController.draw(H1);
        viewController.draw(H2);
        viewController.draw(H3);
        viewController.draw(M1);
        for (int i = 0; i < 500; i++) {
            Snow s1 = new Snow(0,0);
            viewController.draw(s1);
        }
        //viewController.draw(ball1);

    }

    /**
     * Aufruf mit jeder Frame
     * @param dt Zeit seit letzter Frame
     */
    public void updateProgram(double dt){

    }
}
