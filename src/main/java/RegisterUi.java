import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;



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
        emailTextField.setText("请在此输入您的邮箱");
        passwordTextField.setText("请在此输入您的密码");
        passwordAgainTextField.setText("请在此输入您的密码");
        nameTextField.setText("请输入您的姓名");
        Button registerButton = new Button("注册");

        pane.getChildren().add(emailText);
        pane.getChildren().add(passwordAgainText);
        pane.getChildren().add(passwordText);
        pane.getChildren().add(nameText);
        pane.getChildren().add(emailTextField);
        pane.getChildren().add(passwordAgainTextField);
        pane.getChildren().add(passwordTextField);
        pane.getChildren().add(nameTextField);
        pane.getChildren().add(registerButton);

        nameText.setLayoutX(60);
        nameText.setLayoutY(100);
        emailText.setLayoutX(60);
        emailText.setLayoutY(170);
        passwordText.setLayoutX(60);
        passwordText.setLayoutY(240);
        passwordAgainText.setLayoutX(60);
        passwordAgainText.setLayoutY(310);


        primaryStage.setScene(new Scene(pane,300,500));

        primaryStage.show();
    }
}
