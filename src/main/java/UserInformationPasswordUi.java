import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * @program: Client
 * @description: 修改密码界面
 * @author: yps
 * @create: 2020-09-19 22:27
 **/
public class UserInformationPasswordUi extends Application {
    String[] messages;
    @Override
    public void start(Stage primaryStage) throws Exception {
        ClientSocket socket = new ClientSocket("127.0.0.1",8888);

        TextField newPasswordTextField = new TextField();
        TextField newPasswordTextFieldAgain = new TextField();
        TextField codeTextField = new TextField();
        Button codeButton = new Button("发送验证码");
        Button confirmButton = new Button("确认");

        newPasswordTextField.setPromptText("请在此输入您的新密码");
        newPasswordTextFieldAgain.setPromptText("请再次输入您的密码");
        codeTextField.setPromptText("输入邮箱的验证码");

        newPasswordTextField.setLayoutX(50);
        newPasswordTextField.setLayoutY(20);
        newPasswordTextField.setPrefWidth(235);
        newPasswordTextField.setPrefHeight(30);
        newPasswordTextFieldAgain.setLayoutX(50);
        newPasswordTextFieldAgain.setLayoutY(60);
        newPasswordTextFieldAgain.setPrefWidth(235);
        newPasswordTextFieldAgain.setPrefHeight(30);
        codeTextField.setLayoutX(50);
        codeTextField.setLayoutY(100);
        codeTextField.setPrefWidth(120);
        codeTextField.setPrefHeight(30);
        codeButton.setPrefWidth(100);
        codeButton.setPrefHeight(30);
        codeButton.setLayoutX(185);
        codeButton.setLayoutY(100);
        confirmButton.setLayoutX(125);
        confirmButton.setLayoutY(140);
        confirmButton.setPrefWidth(100);
        confirmButton.setPrefHeight(30);

        Pane passwordPane = new Pane();
        passwordPane.getChildren().addAll(newPasswordTextField,newPasswordTextFieldAgain,codeTextField,codeButton,confirmButton);
        primaryStage.setScene(new Scene(passwordPane,340,200));
        primaryStage.show();

        codeButton.setOnAction(e->{
            try {
                socket.send(new String("C/"+MainUi.user.getEmail()));
                messages=socket.accept().trim().split("/");
                if(messages[0].charAt(0)=='S'){
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("成功");
                    alert.setHeaderText(null);
                    alert.setContentText("发送成功");
                    alert.showAndWait();
                }
                else {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("失败");
                    alert.setHeaderText(null);
                    alert.setContentText("发送失败");
                    alert.showAndWait();
                }
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });

        confirmButton.setOnAction(e->{
            if(codeTextField.getText().trim().equals(messages[1].trim())){
                if(newPasswordTextField.getText().trim().equals(newPasswordTextFieldAgain.getText().trim())){
                    try {
                        socket.send(new String("P/"+MainUi.user.getEmail()+"/"+newPasswordTextField.getText().trim()));
                        String[] messages1=socket.accept().split("/");
                        if(messages1[0].charAt(0)=='S'){
                            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                            alert.setTitle("成功");
                            alert.setHeaderText(null);
                            alert.setContentText("修改成功");
                            alert.showAndWait();
                            socket.close();
                            primaryStage.close();
                        }
                        else{
                            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                            alert.setTitle("错误");
                            alert.setHeaderText(null);
                            alert.setContentText("修改失败");
                            alert.showAndWait();
                            newPasswordTextField.setText("");
                            newPasswordTextFieldAgain.setText("");
                            codeTextField.setText("");
                        }
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                }
                else {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("错误");
                    alert.setHeaderText(null);
                    alert.setContentText("两次密码不一致");
                    alert.showAndWait();
                    newPasswordTextField.setText("");
                    newPasswordTextFieldAgain.setText("");
                    codeTextField.setText("");
                }
            }
            else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("错误");
                alert.setHeaderText(null);
                alert.setContentText("验证码错误");
                alert.showAndWait();
                newPasswordTextField.setText("");
                newPasswordTextFieldAgain.setText("");
                codeTextField.setText("");
            }
        });
    }
}
