package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import model.*;

public class DrinkController {

    @FXML
    Button beerbtn, mojibtn, tequibtn, vodbtn, whiskbtn;

    beer Beer = new beer();
    mojito Mojito = new mojito();
    tequila Tequila = new tequila();
    vodka Vodka = new vodka();
    whiskey Whiskey = new whiskey();

    public void initialize() {

        Beer.setColor("golden brown");
        Beer.setTaste("bitter");
        Beer.setSmell("strong resins smell");

        Mojito.setColor("lime");
        Mojito.setTaste("sweet/fizzy");
        Mojito.setSmell("mint smell");

        Tequila.setColor("clear");
        Tequila.setTaste("sweet");
        Tequila.setSmell("fruity aroma");

        Vodka.setColor("clear");
        Vodka.setTaste("sweet");
        Vodka.setSmell("clear grain aroma");

        Whiskey.setColor("deep brown");
        Whiskey.setTaste("bitter");
        Whiskey.setSmell("woody aroma");

    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(beerbtn)) {
            alert.setContentText("Beer is " + Beer.getColor() + ", it is also " + Beer.getTaste() + ", it also has " + Beer.getSmell());
        }

        if (sourceButton == mojibtn) {
            alert.setContentText("Mojito is" + Mojito.getColor()  + " and " + Mojito.getTaste() + ", it also has " + Mojito.getSmell());
        }

        if (sourceButton == tequibtn) {
            alert.setContentText("Tequila is " + Tequila.getColor()  + " and " + Tequila.getTaste() + ", it also has " + Tequila.getSmell());
        }

        if (sourceButton == vodbtn) {
            alert.setContentText("Vodka is " + Vodka.getColor()  + " and " + Vodka.getTaste() + ", it also has " + Vodka.getSmell());
        }

        if (sourceButton == whiskbtn) {
            alert.setContentText("Whiskey is " + Whiskey.getColor()  + " and " + Whiskey.getTaste() + ", it also has " + Whiskey.getSmell());
        }

        alert.showAndWait();

    }

}