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
import java.util.concurrent.atomic.AtomicReference;

/**
 * @program: Javafx
 * @description: 用户登录界面
 * @author: yps
 * @create: 2020-09-16 19:06
 **/
public class LoginInUi extends Application {
    public void start(final Stage primaryStage) throws Exception {


        Pane pane = new Pane();                         //总体框架

        Text emailText = new Text("邮箱:");
        Text passwordText = new Text("密码:");
        TextField emailTextField = new TextField();
        emailTextField.setPromptText("请在此输入您的邮箱");
        TextField passwordTextField = new TextField();
        passwordTextField.setPromptText("请在此输入您的密码");
        Button loginButton = new Button("登录");
        Button registerButton = new Button("注册");
        Button forgetPasswordButton = new Button("忘记密码");
        Button closeButton = new Button("X");

        pane.getChildren().add(emailText);
        pane.getChildren().add(passwordText);
        pane.getChildren().add(loginButton);
        pane.getChildren().add(registerButton);
        pane.getChildren().add(emailTextField);
        pane.getChildren().add(passwordTextField);
        pane.getChildren().add(closeButton);
        pane.getChildren().add(forgetPasswordButton);

        emailText.setLayoutX(23);
        emailText.setLayoutY(124);
        emailTextField.setLayoutX(83);
        emailTextField.setLayoutY(100);
        emailTextField.setPrefWidth(188);
        emailTextField.setPrefHeight(36);

        passwordText.setLayoutX(23);
        passwordText.setLayoutY(204);
        passwordTextField.setLayoutX(83);
        passwordTextField.setLayoutY(180);
        passwordTextField.setPrefHeight(36);
        passwordTextField.setPrefWidth(188);

        loginButton.setLayoutX(60);
        loginButton.setLayoutY(286);
        loginButton.setPrefHeight(36);
        loginButton.setPrefWidth(186);

        registerButton.setLayoutX(60);
        registerButton.setLayoutY(356);
        registerButton.setPrefHeight(36);
        registerButton.setPrefWidth(186);

        closeButton.setLayoutX(260);
        closeButton.setLayoutY(15);
        closeButton.setPrefWidth(30);
        closeButton.setPrefHeight(20);

        forgetPasswordButton.setPrefWidth(80);
        forgetPasswordButton.setPrefHeight(20);
        forgetPasswordButton.setLayoutX(110);
        forgetPasswordButton.setLayoutY(240);

/** 样式部分 **/
        emailText.setFont(Font.font(18));
        emailText.setFill(Paint.valueOf("lightgrey"));
        passwordText.setFont(Font.font(18));
        passwordText.setFill(Paint.valueOf("lightgrey"));

        /** 注册和登录和关闭按钮样式 **/
        forgetPasswordButton .setStyle(
                "-fx-background-color: #dfebff;\n" +
                        "-fx-background-radius: 10;\n" +
                        "-fx-border-radius: 10;" +
                        "-fx-font-size:12px;");
        forgetPasswordButton.setOnMouseEntered(
                e->{
                    forgetPasswordButton.setStyle("-fx-background-color: #bec9dd;\n" +
                            "-fx-background-radius: 10;\n" +
                            "-fx-border-radius: 10;"+
                            "-fx-font-size:12px;");
                });
        forgetPasswordButton.setOnMouseExited(
                e->{
                    forgetPasswordButton.setStyle("-fx-background-color: #dfebff;\n" +
                            "-fx-background-radius: 10;\n" +
                            "-fx-border-radius: 10;"+
                            "-fx-font-size:12px;");
                });
        forgetPasswordButton.setOnMousePressed(
                e->{
                    forgetPasswordButton.setStyle("-fx-background-color: #8893a7;\n" +
                            "-fx-background-radius: 10;\n" +
                            "-fx-border-radius: 10;"+
                            "-fx-font-size:12px;");
                });
        forgetPasswordButton.setOnMouseReleased(
                e->{
                    forgetPasswordButton.setStyle(
                            "-fx-background-color: #dfebff;\n" +
                                    "-fx-background-radius: 10;\n" +
                                    "-fx-border-radius: 10;"+
                                    "-fx-font-size:12px;");
                });


        loginButton.setStyle(
                "-fx-background-color: #dfebff;\n" +
                        "-fx-background-radius: 25;\n" +
                        "-fx-border-radius: 25;" +
                        "-fx-font-size:17px;");
        loginButton.setOnMouseEntered(
                e->{
                    loginButton.setStyle("-fx-background-color: #bec9dd;\n" +
                            "-fx-background-radius: 25;\n" +
                            "-fx-border-radius: 25;"+
                            "-fx-font-size:17px;");
                });
        loginButton.setOnMouseExited(
                e->{
                    loginButton.setStyle("-fx-background-color: #dfebff;\n" +
                            "-fx-background-radius: 25;\n" +
                            "-fx-border-radius: 25;"+
                            "-fx-font-size:17px;");
                });
        loginButton.setOnMousePressed(
                e->{
                    loginButton.setStyle("-fx-background-color: #8893a7;\n" +
                            "-fx-background-radius: 25;\n" +
                            "-fx-border-radius: 25;"+
                            "-fx-font-size:17px;");
                });
        loginButton.setOnMouseReleased(
                e->{
                    loginButton.setStyle("" +
                            "-fx-background-color: #dfebff;\n" +
                            "-fx-background-radius: 25;\n" +
                            "-fx-border-radius: 25;"+
                            "-fx-font-size:17px;");
                });

        registerButton.setStyle(
                "-fx-background-color: #dfebff;\n" +
                        "-fx-background-radius: 25;\n" +
                        "-fx-border-radius: 25;" +
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
        registerButton.setOnMouseReleased(
                e->{
                    registerButton.setStyle("" +
                            "-fx-background-color: #dfebff;\n" +
                            "-fx-background-radius: 25;\n" +
                            "-fx-border-radius: 25;"+
                            "-fx-font-size:17px;");
                });

        closeButton.setStyle("-fx-background-color: #dfebff;" +
                "-fx-border-radius: 5px; -fx-font-size: 9pt ; -fx-font-family: STHeiti");
        closeButton.setOnMouseEntered(e->{
            closeButton.setStyle("-fx-text-fill: white; -fx-background-color: rgb(218, 95, 71)");
        });
        closeButton.setOnMouseExited(e->{
            closeButton.setStyle("-fx-background-color: #dfebff; -fx-border-radius: 5px; -fx-font-size: 9pt ;" +
                    " -fx-font-family: STHeiti");
        });
        closeButton.setOnMousePressed(e->{
            closeButton.setStyle("-fx-text-fill: white; -fx-background-color: rgb(218, 95, 71)");
        });
        closeButton.setOnMouseReleased(e->{
            closeButton.setStyle("-fx-background-color: #dfebff; -fx-border-radius: 5px; -fx-font-size: 9pt ;" +
                    " -fx-font-family: STHeiti");
        });

        pane.setStyle("-fx-background-color: #36383c");

        primaryStage.setScene(new Scene(pane, 300, 500));
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.show();
        ClientSocket socket = new ClientSocket("192.168.43.10", 8888);


//实现窗口拖动
        AtomicReference<Double> xOffSet = new AtomicReference<>((double) 0);
        AtomicReference<Double> yOffSet = new AtomicReference<>((double) 0);
        pane.setOnMousePressed(event -> {
            xOffSet.set(event.getSceneX());
            yOffSet.set(event.getSceneY());
        });

        pane.setOnMouseDragged(event -> {
            primaryStage.setX(event.getScreenX() - xOffSet.get());
            primaryStage.setY(event.getScreenY() - yOffSet.get());
        });

//内部类处理服务器信息
        class Solution {
            /**
             * @Description:处理服务器端信息
             * @Author: LJZ
             * @Date: 2020/9/17 11:04
             * [messages]
             * void
             **/
            public void solve(String messages[]) throws IOException {
                switch (messages[0].charAt(0)) {
                    case 'A': {
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("成功");
                        alert.setHeaderText(null);
                        alert.setContentText("登录成功");
                        alert.showAndWait();
                        User user = new User(emailTextField.getText(),passwordTextField.getText());
                        MainUi open = new MainUi(user);
                        try {
                            open.start(new Stage());
                            socket.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        primaryStage.hide(); //点开新的界面后，是否关闭此界面
                        break;
                    }
                    case 'F': {
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("错误");
                        alert.setHeaderText(null);
                        alert.setContentText("密码错误,请重新输入");
                        alert.showAndWait();
                        emailTextField.setText("");
                        passwordTextField.setText("");
                        break;
                    }
                    case 'N': {
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("错误");
                        alert.setHeaderText(null);
                        alert.setContentText("用户名不存在,请重新输入");
                        alert.showAndWait();
                        emailTextField.setText("");
                        passwordTextField.setText("");
                        break;
                    }
                }
            }
        }

//跳转注册界面
        registerButton.setOnAction((ActionEvent event) -> {
            RegisterUi open = new RegisterUi();
            try {
                open.start(new Stage());
            } catch (Exception e) {
                e.printStackTrace();
            }
            primaryStage.hide(); //点开新的界面后，是否关闭此界面
        });

//登录动作事件驱动
        loginButton.setOnAction(e -> {

            String email = emailTextField.getText().trim();
            String password = passwordTextField.getText().trim();
            String login = "L";
            String message = login + "/" + email + "/" + password + "/";
            try {
                socket.send(message);
                Solution solution = new Solution();
                String[] messages;
                messages = socket.accept().split("/");
                solution.solve(messages);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });
//窗体关闭事件
        primaryStage.setOnCloseRequest(e -> {
            try {
                socket.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });
//关闭按钮
        closeButton.setOnAction(e->{
            primaryStage.close();
        });
//忘记密码按钮
        forgetPasswordButton.setOnAction(e->{
            UserForgetPasswordUi open = new UserForgetPasswordUi();
            try {
                open.start(new Stage());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}

