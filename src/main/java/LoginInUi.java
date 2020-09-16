import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * @program: Javafx
 * @description: 用户登录界面
 * @author: yps
 * @create: 2020-09-16 19:06
 **/
public class LoginInUi extends Application {
    public void start(final Stage primaryStage) throws Exception {
        GridPane gridPane = new GridPane();                         //总体框架
        gridPane.setAlignment(Pos.CENTER);                          //居中

        Text emailText = new Text("邮箱:     ");
        Text passwordText = new Text("密码:     ");
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

        gridPane.add(emailText,0,0);
        gridPane.add(passwordText,0,1);
        gridPane.add(emailTextField,1,0);
        gridPane.add(passwordTextField,1,1);
        gridPane.add(registerButton,0,2);
        gridPane.add(loginButton,1,2);
        GridPane.setHalignment(registerButton,HPos.CENTER);
        GridPane.setHalignment(loginButton, HPos.CENTER);

        primaryStage.setScene(new Scene(gridPane,300,250));

        primaryStage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}

