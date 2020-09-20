import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @program: Client
 * @description: 登录界面忘记密码Ui
 * @author: yps
 * @create: 2020-09-20 14:50
 **/
public class UserForgetPasswordUi extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        TextField newPasswordTextField = new TextField();
        TextField newPasswordTextFieldAgain = new TextField();
        TextField codeTextField = new TextField();
        TextField emailTextField = new TextField();
        Button codeButton = new Button("发送验证码");
        Button confirmButton = new Button("确认");
        Button closeButton = new Button("X");

        newPasswordTextField.setPromptText("请在此输入您的新密码");
        newPasswordTextFieldAgain.setPromptText("请再次输入您的密码");
        codeTextField.setPromptText("输入邮箱的验证码");
        emailTextField.setPromptText("请在此输入您的邮箱");

        emailTextField.setLayoutX(30);
        emailTextField.setLayoutY(40);
        emailTextField.setPrefHeight(30);
        emailTextField.setPrefWidth(235);
        newPasswordTextField.setLayoutX(30);
        newPasswordTextField.setLayoutY(80);
        newPasswordTextField.setPrefWidth(235);
        newPasswordTextField.setPrefHeight(30);
        newPasswordTextFieldAgain.setLayoutX(30);
        newPasswordTextFieldAgain.setLayoutY(120);
        newPasswordTextFieldAgain.setPrefWidth(235);
        newPasswordTextFieldAgain.setPrefHeight(30);
        codeTextField.setLayoutX(30);
        codeTextField.setLayoutY(160);
        codeTextField.setPrefWidth(120);
        codeTextField.setPrefHeight(30);
        codeButton.setPrefWidth(100);
        codeButton.setPrefHeight(30);
        codeButton.setLayoutX(165);
        codeButton.setLayoutY(160);
        confirmButton.setLayoutX(105);
        confirmButton.setLayoutY(200);
        confirmButton.setPrefWidth(100);
        confirmButton.setPrefHeight(30);

        closeButton.setLayoutX(270);
        closeButton.setLayoutY(5);
        closeButton.setPrefWidth(30);
        closeButton.setPrefHeight(20);

        /**关闭按钮**/
        closeButton.setStyle(
                "-fx-background-color: antiquewhite;" +
                "-fx-border-radius: 5px; " +
                "-fx-font-size: 9pt ; " +
                "-fx-font-family: STHeiti");
        closeButton.setOnMouseEntered(
                e->{
                closeButton.setStyle(
                      "-fx-text-fill: white; " +
                      "-fx-background-color: rgb(218, 95, 71)");
        });
        closeButton.setOnMouseExited(
                 e->{
                 closeButton.setStyle(
                        "-fx-background-color: antiquewhite; -fx-border-radius: 5px;" +
                        " -fx-font-size: 9pt ;" +
                        " -fx-font-family: STHeiti");
        });
        closeButton.setOnMousePressed(e->{
                closeButton.setStyle(
                        "-fx-text-fill: white; " +
                        "-fx-background-color: rgb(218, 95, 71)");
        });
        closeButton.setOnMouseReleased(e->{
                closeButton.setStyle(
                        "-fx-background-color: antiquewhite; " +
                        "-fx-border-radius: 5px; -fx-font-size: 9pt ;" +
                        " -fx-font-family: STHeiti");
        });


        closeButton.setOnAction(e->{
                primaryStage.close();
        });

        /**发送验证码和确认按钮**/
        codeButton .setStyle(
                "-fx-background-color: antiquewhite;\n" +
                        "-fx-background-radius: 25;\n" +
                        "-fx-border-radius: 25;" +
                        "-fx-font-size:12px;");
        codeButton.setOnMouseEntered(
                e->{
                    codeButton.setStyle("-fx-background-color: #d9d4bf;\n" +
                            "-fx-background-radius: 25;\n" +
                            "-fx-border-radius: 25;"+
                            "-fx-font-size:12px;");
                });
        codeButton.setOnMouseExited(
                e->{
                    codeButton.setStyle("-fx-background-color: antiquewhite;\n" +
                            "-fx-background-radius: 25;\n" +
                            "-fx-border-radius: 25;"+
                            "-fx-font-size:12px;");
                });
        codeButton.setOnMousePressed(
                e->{
                    codeButton.setStyle("-fx-background-color: #d9d4bf;\n" +
                            "-fx-background-radius: 25;\n" +
                            "-fx-border-radius: 25;"+
                            "-fx-font-size:12px;");
                });
        codeButton.setOnMouseReleased(
                e->{
                    codeButton.setStyle(
                            "-fx-background-color: antiquewhite;\n" +
                                    "-fx-background-radius: 25;\n" +
                                    "-fx-border-radius: 25;"+
                                    "-fx-font-size:12px;");
                });

        confirmButton.setStyle(
                "-fx-background-color: antiquewhite;\n" +
                        "-fx-background-radius: 25;\n" +
                        "-fx-border-radius: 25;" +
                        "-fx-font-size:12px;");
        confirmButton.setOnMouseEntered(
                e->{
                    confirmButton.setStyle("-fx-background-color: #d9d4bf;\n" +
                            "-fx-background-radius: 25;\n" +
                            "-fx-border-radius: 25;"+
                            "-fx-font-size:12px;");
                });
        confirmButton.setOnMouseExited(
                e->{
                    confirmButton.setStyle("-fx-background-color: antiquewhite;\n" +
                            "-fx-background-radius: 25;\n" +
                            "-fx-border-radius: 25;"+
                            "-fx-font-size:12px;");
                });
        confirmButton.setOnMousePressed(
                e->{
                    confirmButton.setStyle("-fx-background-color: #d9d4bf;\n" +
                            "-fx-background-radius: 25;\n" +
                            "-fx-border-radius: 25;"+
                            "-fx-font-size:12px;");
                });
        confirmButton.setOnMouseReleased(
                e->{
                    confirmButton.setStyle(
                            "-fx-background-color: antiquewhite;\n" +
                                    "-fx-background-radius: 25;\n" +
                                    "-fx-border-radius: 25;"+
                                    "-fx-font-size:12px;");
                });



        Pane passwordPane = new Pane();
        passwordPane.getChildren().addAll(newPasswordTextField,newPasswordTextFieldAgain,codeTextField,codeButton,confirmButton,emailTextField,closeButton);
        primaryStage.setScene(new Scene(passwordPane,300,250));
        passwordPane.setStyle("-fx-background-color: #bac5d9");


        //实现窗口拖动
        AtomicReference<Double> xOffSet = new AtomicReference<>((double) 0);
        AtomicReference<Double> yOffSet = new AtomicReference<>((double) 0);
        passwordPane.setOnMousePressed(event -> {
            xOffSet.set(event.getSceneX());
            yOffSet.set(event.getSceneY());
        });

        passwordPane.setOnMouseDragged(event -> {
            primaryStage.setX(event.getScreenX() - xOffSet.get());
            primaryStage.setY(event.getScreenY() - yOffSet.get());
        });


        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.show();
    }
}
