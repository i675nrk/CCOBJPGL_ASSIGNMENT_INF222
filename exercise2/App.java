import Explorers.*;
import Planets.*;

public class App {

    public static void main(String[] args) {

        Planet mars = new Mars();
        Planet saturn = new Saturn();
        Planet mercury = new Mercury();
        Planet earth = new Earth();
        Planet neptune = new Neptune();
        Planet pluto = new Pluto();
        Planet uranus = new Uranus();
        Planet venus = new Venus();
        Planet jupiter = new Jupiter();


        Explorer astronaut = new HumanExplorer();
        Explorer rover = new RobotExplorer();
        Explorer android = new AndroidExplorer();

        mars.accept(astronaut);
        saturn.accept(astronaut);
        mercury.accept(astronaut);
        earth.accept(astronaut);
        neptune.accept(astronaut);
        pluto.accept(astronaut);
        uranus.accept(astronaut);
        venus.accept(astronaut);
        jupiter.accept(astronaut);

        mars.accept(rover);
        saturn.accept(rover);
        mercury.accept(rover);
        earth.accept(rover);
        neptune.accept(rover);
        pluto.accept(rover);
        uranus.accept(rover);
        venus.accept(rover);
        jupiter.accept(rover);

        mars.accept(android);
        saturn.accept(android);
        mercury.accept(android);
        earth.accept(android);
        neptune.accept(android);
        pluto.accept(android);
        uranus.accept(android);
        venus.accept(android);
        jupiter.accept(android);
    }
}
