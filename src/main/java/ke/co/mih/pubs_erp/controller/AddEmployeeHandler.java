package ke.co.mih.pubs_erp.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import ke.co.bootstrapfx.BootstrapFX;

import java.net.URL;
import java.util.ResourceBundle;

public class AddEmployeeHandler extends BootstrapFX implements Initializable {
    @FXML private TextField first_name;
    @FXML private TextField last_name;
    @FXML private TextField other_name;
    @FXML private TextField phone_number;
    @FXML private TextField email;
    @FXML private TextField id_number;
    @FXML private TextField username;
    @FXML private TextField password;
    @FXML private DatePicker date_employed;
    @FXML private ChoiceBox<?> user_role;
    @FXML private AnchorPane user_image;
    @FXML private DatePicker date_of_birth;
    @FXML private ChoiceBox<?> gender;
    @FXML private TextField postal_address;
    @FXML private TextField residence;
    @FXML private TextField nhif_number;
    @FXML private TextField nssf_number;
    @FXML private TextField huduma_number;
    @FXML private TextField kra_pin;
    @FXML private JFXButton btn_canc;
    @FXML private JFXButton btn_save;

    @Override public void initialize(URL location, ResourceBundle resources) {

        btn_canc.setOnAction(event -> {
            clear(
                    first_name, last_name, other_name, phone_number, email, id_number, username, password,
                    date_employed,  date_of_birth, postal_address, residence, nhif_number,
                    nssf_number, huduma_number, kra_pin
            );
            //TODO: Add Implementation to clear AnchorPane containing image
        });

        btn_canc.setOnAction(event -> clear(
                first_name, last_name, other_name, phone_number, email, id_number, username, password,
                date_employed,  date_of_birth, postal_address, residence, nhif_number,
                nssf_number, huduma_number, kra_pin
        ));

        btn_save.setOnAction(event -> {
            if (isValid(
                    first_name, last_name, phone_number, id_number, username, password, date_employed, user_role
            )) {
                //TODO: Add Implementation to save details to database
            }
        });
    }
}