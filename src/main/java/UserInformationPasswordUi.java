import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * @program: Client
 * @description: 修改密码界面
 * @author: yps
 * @create: 2020-09-19 22:27
 **/
public class UserInformationPasswordUi extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

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
    }
}
