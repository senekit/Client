import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.IOException;

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
        emailTextField.setText("请在此输入您的邮箱");
        TextField passwordTextField = new TextField();
        passwordTextField.setText("请在此输入您的密码");
        Button loginButton = new Button("登录");
        Button registerButton = new Button("注册");

        registerButton.setOnAction((ActionEvent event) -> {
            RegisterUi open  = new RegisterUi();
            try {
                open.start(new Stage());
            } catch (Exception e) {
                e.printStackTrace();
            }
            primaryStage.hide(); //点开新的界面后，是否关闭此界面
        });

        pane.getChildren().add(emailText);
        pane.getChildren().add(passwordText);
        pane.getChildren().add(loginButton);
        pane.getChildren().add(registerButton);
        pane.getChildren().add(emailTextField);
        pane.getChildren().add(passwordTextField);

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

        loginButton.setLayoutX(168);
        loginButton.setLayoutY(356);
        loginButton.setPrefHeight(36);
        loginButton.setPrefWidth(86);

        registerButton.setLayoutX(38);
        registerButton.setLayoutY(356);
        registerButton.setPrefHeight(36);
        registerButton.setPrefWidth(86);

        //emailText.setFont(18);


        primaryStage.setScene(new Scene(pane,300,500));

        primaryStage.show();

//登录动作事件驱动
        loginButton.setOnAction(e->{
            ClientSocket socket = null;
            try {
                socket = new ClientSocket("192.168.43.47",8888);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            String email = emailTextField.getText().trim();
            String password = passwordTextField.getText().trim();
            String login="L";
            String message= login+"/"+email+"/"+password;
            try {
                socket.send(message);
                while(socket.isConnected()){
                    socket.accept();
                }
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });
//        primaryStage.setOnCloseRequest(e->{
//            try {
//                socket.close();
//            } catch (IOException ioException) {
//                ioException.printStackTrace();
//            }
//        });
    }
    public static void main(String[] args){
        launch(args);
    }
}

