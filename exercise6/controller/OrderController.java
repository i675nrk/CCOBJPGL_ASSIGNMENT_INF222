package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;


public class OrderController implements Initializable{

    @FXML
    Label name1, name2, name3;

    @FXML
    Label price1, price2, price3;

    @FXML 
    Label qty1, qty2, qty3;

    @FXML 
    Label date1, date2, date3;

    @FXML
    Label totalLabel;

    @FXML
    Pane pane1, pane2, pane3;

    @Override
    public  void initialize(URL arg0, ResourceBundle arg1){

        
        if (HomeController.blamp.getProductStatus() == true) {
            name1.setText(HomeController.blamp.getProductName());
            price1.setText(String.valueOf(HomeController.blamp.getProductPrice()));
            qty1.setText(String.valueOf(HomeController.blamp.getProductQuantity()));
            
        } else {
            name1.setVisible(false);
            price1.setVisible(false);
            qty1.setVisible(false);
            
        }

        if (HomeController.clamp.getProductStatus() == true) {
            name2.setText(HomeController.clamp.getProductName());
            price2.setText(String.valueOf(HomeController.clamp.getProductPrice()));
            qty2.setText(String.valueOf(HomeController.clamp.getProductQuantity()));
            
        } else {
            name2.setVisible(false);
            price2.setVisible(false);
            qty2.setVisible(false);
            
        }

        if (HomeController.wlamp.getProductStatus() == true) {
            name3.setText(HomeController.wlamp.getProductName());
            price3.setText(String.valueOf(HomeController.wlamp.getProductPrice()));
            qty3.setText(String.valueOf(HomeController.wlamp.getProductQuantity()));
            
        } else {
            name3.setVisible(false);
            price3.setVisible(false);
            qty3.setVisible(false);
            
        }

        totalLabel.setText(CheckoutController.totalSagad);
    
    }

   

}