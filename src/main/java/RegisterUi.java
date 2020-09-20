import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;


/**
 * @program: Javafx
 * @description: 用户注册界面
 * @author: yps
 * @create: 2020-09-16 19:06
 **/
public class RegisterUi extends Application {
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();

        Text emailText = new Text("邮箱:");
        Text passwordText = new Text("密码:");
        Text passwordAgainText = new Text("请再次输入密码:");
        Text nameText = new Text("姓名:");
        TextField emailTextField = new TextField();
        TextField passwordTextField = new TextField();
        TextField passwordAgainTextField = new TextField();
        TextField nameTextField = new TextField();
        emailTextField.setPromptText("请在此输入您的邮箱");
        passwordTextField.setPromptText("请在此输入您的密码");
        passwordAgainTextField.setPromptText("请在此输入您的密码");
        nameTextField.setPromptText("请输入您的姓名");
        Button registerButton = new Button("注册");
        Button returnButton = new Button("返回");

        returnButton.setOnAction((ActionEvent event) -> {
            LoginInUi open  = new LoginInUi();
            try {
                open.start(new Stage());
            } catch (Exception e) {
                e.printStackTrace();
            }
            primaryStage.hide();
        });                                                         //返回登录界面

        pane.getChildren().add(emailText);
        pane.getChildren().add(passwordAgainText);
        pane.getChildren().add(passwordText);
        pane.getChildren().add(nameText);
        pane.getChildren().add(emailTextField);
        pane.getChildren().add(passwordAgainTextField);
        pane.getChildren().add(passwordTextField);
        pane.getChildren().add(nameTextField);
        pane.getChildren().add(registerButton);
        pane.getChildren().add(returnButton);

        nameText.setLayoutX(60);
        nameText.setLayoutY(100);
        nameTextField.setLayoutX(90);
        nameTextField.setLayoutY(110);
        nameTextField.setPrefWidth(219);
        nameTextField.setPrefHeight(36);

        emailText.setLayoutX(60);
        emailText.setLayoutY(180);
        emailTextField.setLayoutX(90);
        emailTextField.setLayoutY(190);
        emailTextField.setPrefWidth(219);
        emailTextField.setPrefHeight(36);

        passwordText.setLayoutX(60);
        passwordText.setLayoutY(260);
        passwordTextField.setLayoutX(90);
        passwordTextField.setLayoutY(270);
        passwordTextField.setPrefWidth(219);
        passwordTextField.setPrefHeight(36);

        passwordAgainText.setLayoutX(60);
        passwordAgainText.setLayoutY(340);
        passwordAgainTextField.setLayoutX(90);
        passwordAgainTextField.setLayoutY(350);
        passwordAgainTextField.setPrefWidth(219);
        passwordAgainTextField.setPrefHeight(36);

        registerButton.setLayoutX(120);
        registerButton.setLayoutY(456);
        registerButton.setPrefWidth(160);
        registerButton.setPrefHeight(50);

        returnButton.setLayoutX(120);
        returnButton.setLayoutY(533);
        returnButton.setPrefWidth(160);
        returnButton.setPrefHeight(50);

        /** 样式部分 **/
        nameText.setFont(Font.font(18));
        nameText.setFill(Paint.valueOf("lightgrey"));
        emailText.setFont(Font.font(18));
        emailText.setFill(Paint.valueOf("lightgrey"));
        passwordText.setFont(Font.font(18));
        passwordText.setFill(Paint.valueOf("lightgrey"));
        passwordAgainText.setFont(Font.font(18));
        passwordAgainText.setFill(Paint.valueOf("lightgrey"));


        pane.setStyle("-fx-background-color: #36383c");

        registerButton.setStyle("" +
                "-fx-background-color: #dfebff;\n" +
                "-fx-background-radius: 25;\n" +
                "-fx-border-radius: 25;"+
                "-fx-font-size:17px;");
        registerButton.setOnMouseEntered(
                e->{
                    registerButton.setStyle("-fx-background-color: #bec9dd;\n" +
                            "-fx-background-radius: 25;\n" +
                            "-fx-border-radius: 25;"+
                            "-fx-font-size:17px;");
                });
        registerButton.setOnMouseExited(
                e->{
                    registerButton.setStyle("-fx-background-color: #dfebff;\n" +
                            "-fx-background-radius: 25;\n" +
                            "-fx-border-radius: 25;"+
                            "-fx-font-size:17px;");
                });
        registerButton.setOnMousePressed(
                e->{
                    registerButton.setStyle("-fx-background-color: #8893a7;\n" +
                            "-fx-background-radius: 25;\n" +
                            "-fx-border-radius: 25;"+
                            "-fx-font-size:17px;");
                });
        registerButton.setOnMouseReleased(e->{
            registerButton.setStyle("" +
                    "-fx-background-color: #dfebff;\n" +
                    "-fx-background-radius: 25;\n" +
                    "-fx-border-radius: 25;"+
                    "-fx-font-size:17px;");
        });

        returnButton.setStyle("" +
                "-fx-background-color: #dfebff;\n" +
                "-fx-background-radius: 25;\n" +
                "-fx-border-radius: 25;"+
                "-fx-font-size:17px;");
        returnButton.setOnMouseEntered(
                e->{
                    returnButton.setStyle("-fx-background-color: #bec9dd;\n" +
                            "-fx-background-radius: 25;\n" +
                            "-fx-border-radius: 25;"+
                            "-fx-font-size:17px;");
                });
        returnButton.setOnMouseExited(
                e->{
                    returnButton.setStyle("-fx-background-color: #dfebff;\n" +
                            "-fx-background-radius: 25;\n" +
                            "-fx-border-radius: 25;"+
                            "-fx-font-size:17px;");
                });
        returnButton.setOnMousePressed(
                e->{
                    returnButton.setStyle("-fx-background-color: #8893a7;\n" +
                            "-fx-background-radius: 25;\n" +
                            "-fx-border-radius: 25;"+
                            "-fx-font-size:17px;");
                });
        returnButton.setOnMouseReleased(e->{
            returnButton.setStyle("" +
                    "-fx-background-color: #dfebff;\n" +
                    "-fx-background-radius: 25;\n" +
                    "-fx-border-radius: 25;"+
                    "-fx-font-size:17px;");
        });


        primaryStage.setScene(new Scene(pane,400,644));
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.show();
        ClientSocket registersocket = new ClientSocket("192.168.31.56", 8888);

//内部类处理服务器信息
        class Solution {
            /**
             * @Description:处理服务器端信息
             * @Author: LJZ
             * @Date: 2020/9/17 11:04
            [messages]
            void
             **/
            public void solve(String messages[]){
                switch (messages[0].charAt(0)){
                    case 'B':{
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("成功");
                        alert.setHeaderText(null);
                        alert.setContentText("注册成功");
                        alert.showAndWait();
                        LoginInUi open  = new LoginInUi();
                        try {
                            open.start(new Stage());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        primaryStage.hide(); //点开新的界面后，是否关闭此界面
                        break;
                    }
                    case 'F':{
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("错误");
                        alert.setHeaderText(null);
                        alert.setContentText("该用户已存在");
                        alert.showAndWait();
                        emailTextField.setText("请在此输入您的邮箱");
                        passwordTextField.setText("请在此输入您的密码");
                        passwordAgainTextField.setText("请在此输入您的密码");
                        nameTextField.setText("请输入您的姓名");
                        break;
                    }
                }
            }
        }

//返回登录界面
        returnButton.setOnAction((ActionEvent event) -> {
            try {
                registersocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            LoginInUi open  = new LoginInUi();
            try {
                open.start(new Stage());
            } catch (Exception e) {
                e.printStackTrace();
            }
            primaryStage.hide();
        });

//注册事件处理
        registerButton.setOnAction(e->{
            String password = passwordTextField.getText().trim();
            String passwordagain = passwordAgainTextField.getText().trim();
            String name = nameTextField.getText().trim();
            String email = emailTextField.getText().trim();
            if(!("".equals(name))&&!("".equals(password))&&!("".equals(passwordagain))&&!("".equals(email))){
                if(password.equals(passwordagain)){
                    String message = "R/"+email+"/"+password+"/"+name+"/";
                    try {
                        registersocket.send(message);
                        Solution solution = new Solution();
                        String[] messages;
                        messages = registersocket.accept().split("/");
                        solution.solve(messages);
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                }
                else{
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("错误");
                    alert.setHeaderText(null);
                    alert.setContentText("两次密码不一致");
                    alert.showAndWait();
                    passwordTextField.setText("请在此输入您的密码");
                    passwordAgainTextField.setText("请在此输入您的密码");
                }
            }
            else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("错误");
                alert.setHeaderText(null);
                alert.setContentText("填写不能为空");
                alert.showAndWait();
                emailTextField.setText("");
                passwordTextField.setText("");
                passwordAgainTextField.setText("");
                nameTextField.setText("");
            }
        });
    }
}
