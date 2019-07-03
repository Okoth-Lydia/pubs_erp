package ke.co.mih.pubs_erp.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXTabPane;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import ke.co.bootstrapfx.BootstrapFX;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller extends BootstrapFX implements Initializable {
    public static Stage primaryStage;

    /* Login Pane *******************************************/
    @FXML private AnchorPane login_pane;
    @FXML private Label err_msg, forgot_pass;
    @FXML private TextField user_id;
    @FXML private PasswordField user_password;
    @FXML private JFXCheckBox keep_loggedin;
    @FXML private JFXButton btn_cancel, btn_login;

    /* Main Pane ********************************************/
    @FXML private JFXTabPane admin_pane, cashier_pane;
    @FXML private AnchorPane main_pane;
    @FXML private Button btn_out, btn_min, btn_clz;

    /* Admin Pane ******************************************/
    //@FXML private JFXButton admin_dashb_ovv;
    //@FXML private AnchorPane admin_dashb_ovvw_pane;
    //@FXML private AnchorPane admin_dashb_ovvw_view;

    //@FXML private JFXButton admin_prdct_ovv;
    //@FXML private AnchorPane admin_prdct_ovvw_pane;
    //@FXML private AnchorPane admin_prdct_ovvw_view;

    @FXML private JFXButton admin_emply_ovv, admin_emply_vew, admin_emply_add, admin_emply_mng;
    @FXML private AnchorPane admin_emply_ovv_pane, admin_emply_vew_pane, admin_emply_add_pane, admin_emply_mng_pane;
    @FXML private AnchorPane admin_emply_ovv_view, admin_emply_vew_view, admin_emply_add_view, admin_emply_mng_view;

    //@FXML private JFXButton admin_reprt_ovv;
    //@FXML private AnchorPane admin_reprt_ovvw_pane;
    //@FXML private AnchorPane admin_reprt_ovvw_view;

    //@FXML private JFXButton admin_setng_ovv;
    //@FXML private AnchorPane admin_setng_ovvw_pane;
    //@FXML private AnchorPane admin_setng_ovvw_view;

    /* Cashier Pane ****************************************/
    //@FXML private JFXButton cashr_dashb_ovv;
    //@FXML private AnchorPane cashr_dashb_ovvw_pane;
    //@FXML private AnchorPane cashr_dashb_ovvw_view;

    //@FXML private JFXButton cashr_order_ovv;
    //@FXML private AnchorPane cashr_order_ovvw_pane;
    //@FXML private AnchorPane cashr_order_ovvw_view;

    //@FXML private JFXButton cashr_paymt_ovv;
    //@FXML private AnchorPane cashr_paymt_ovvw_pane;
    //@FXML private AnchorPane cashr_paymt_ovvw_view;

    //@FXML private JFXButton cashr_reprt_ovv;
    //@FXML private AnchorPane cashr_reprt_ovvw_pane;
    //@FXML private AnchorPane cashr_reprt_ovvw_view;

    //@FXML private JFXButton cashr_setng_ovv;
    //@FXML private AnchorPane cashr_setng_ovvw_pane;
    //@FXML private AnchorPane cashr_setng_ovvw_view;


    @Override public void initialize(URL location, ResourceBundle resources) {
        login_pane.toFront();

        keep_loggedin.setOnAction(event -> {
            //TODO: Add implementation to keep user logged in
        });

        btn_login.setOnAction(event -> {
            if (isValid(user_id, user_password)) {
                //TODO: Add implementation to login user
                main_pane.toFront();
                clear(user_id, user_password);
            }
        });

        forgot_pass.setOnMouseClicked(event -> {
            //TODO: Add implementation to prompt admin for password reset
            //This can wait untill admin notifications interface is implemented
        });
    }

    @FXML void windowControl(ActionEvent event) {
        if (event.getSource()==btn_clz || event.getSource()==btn_cancel) System.exit(0);
        if (event.getSource()==btn_min) primaryStage.setIconified(true);
        if (event.getSource()==btn_out) login_pane.toFront();
    }

    @FXML void navigationControl(ActionEvent event) {
        ((Group)((Button)event.getSource()).getParent()).getChildren().forEach(
                node-> (node).getStyleClass().removeAll("ctrl-selected")
        );
        ((Button)event.getTarget()).getStyleClass().add("ctrl-selected");

        /* Admin TabPane ****************************************/
        //if (event.getSource()==admin_dashb_ovv) admin_dashb_ovv_pane.toFront();
        //if (event.getSource()==admin_prdct_ovv) admin_prdct_ovv_pane.toFront();
        if (event.getSource()==admin_emply_ovv) admin_emply_ovv_pane.toFront();
        if (event.getSource()==admin_emply_vew) admin_emply_vew_pane.toFront();
        if (event.getSource()==admin_emply_add) admin_emply_add_pane.toFront();
        if (event.getSource()==admin_emply_mng) admin_emply_mng_pane.toFront();
        //if (event.getSource()==admin_reprt_ovv) admin_reprt_ovv_pane.toFront();
        //if (event.getSource()==admin_setng_ovv) admin_setng_ovv_pane.toFront();

        /* Cashier TabPane *************************************/
        //if (event.getSource()==cashr_dashb_ovv) cashr_dashb_ovv_pane.toFront();
        //if (event.getSource()==cashr_order_ovv) cashr_order_ovv_pane.toFront();
        //if (event.getSource()==cashr_paymt_ovv) cashr_paymt_ovv_pane.toFront();
        //if (event.getSource()==cashr_reprt_ovv) cashr_reprt_ovv_pane.toFront();
        //if (event.getSource()==cashr_setng_ovv) cashr_setng_ovv_pane.toFront();
    }
}