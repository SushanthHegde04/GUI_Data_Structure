package com.example.demo4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


    public class HelloController implements Initializable {
        @FXML
        private TextField sizet;

        @FXML
        private Button sizebt;
        @FXML
        private Label welcomeText;

        @FXML
        private Button popbt;

        @FXML
        private Button displaybt;

        @FXML
        private Button pushbt;

        @FXML
        private TextField pusht;

        @FXML
        private Button helpbt;

        @FXML
        private Label titlet;

        @FXML
        private TextArea show;
        @FXML
        private VBox scenepane;
        @FXML
        private Button logoutbt;



        Stage stage;
        @FXML
        public void logout(ActionEvent event)
        {
            Alert alert=new Alert((Alert.AlertType.CONFIRMATION));
            alert.setTitle("LOGOUT");
            alert.setHeaderText("you are about to logout\n");
            alert.setContentText("are you sure you want to exit\n");

            if(alert.showAndWait().get()==ButtonType.OK) {
                stage = (Stage) scenepane.getScene().getWindow();
                System.out.println("you successfully logged out!");
                stage.close();
            }
        }

        @FXML
        protected void onHelloButtonClick(ActionEvent event) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("info.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        }



        @FXML
        private Button back;

        int s;
        @FXML
        protected void size(ActionEvent event)throws IOException{
            s=Integer.parseInt(sizet.getText());
            stack = new StackDemo(s);
            show.appendText("size :"+s+"\n");
            sizet.clear();
        }

        @FXML
        protected void SwitchBack(ActionEvent event) throws IOException {
            // welcomeText.setText("Welcome to JavaFX Application!");
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        }



        StackDemo stack ;
        @FXML
        protected void Insert(ActionEvent event) throws IOException {
            if (stack.getTop() != s - 1) {
                stack.push(pusht.getText());

                show.appendText(pusht.getText() + " " + "added at" + " " + stack.getTop() + "position\n");
                pusht.clear();
            }
            else {
                show.appendText("stack is full\n");
            }

        }

        @FXML
        protected void delete(ActionEvent event) throws IOException {
            if (stack.getTop() == -1) {
                show.appendText("stack is empty\n");
            } else {
                show.appendText("item deleted at" + " " + "[" + stack.getTop() + "]  position is"+stack.data(stack.getTop())+"\n");
                stack.pop();
            }
        }



        @FXML
        protected void display(ActionEvent event) throws IOException
        {
            if(stack.getTop()==-1)
                show.appendText("STACK IS EMPTY\n");
            else {
                for (int i = 0; i <= stack.getTop(); i++) {
                    show.appendText(stack.data(i)+"\n");
                }
            }
        }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
