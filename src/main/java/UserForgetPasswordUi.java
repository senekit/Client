import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

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

        closeButton.setStyle("-fx-background-color: antiquewhite;" +
                "-fx-border-radius: 5px; -fx-font-size: 9pt ; -fx-font-family: STHeiti");
        closeButton.setOnMouseEntered(e->{
            closeButton.setStyle("-fx-text-fill: white; -fx-background-color: rgb(218, 95, 71)");
        });
        closeButton.setOnMouseExited(e->{
            closeButton.setStyle("-fx-background-color: antiquewhite; -fx-border-radius: 5px; -fx-font-size: 9pt ;" +
                    " -fx-font-family: STHeiti");
        });
        closeButton.setOnMousePressed(e->{
            closeButton.setStyle("-fx-text-fill: white; -fx-background-color: rgb(218, 95, 71)");
        });
        closeButton.setOnMouseReleased(e->{
            closeButton.setStyle("-fx-background-color: antiquewhite; -fx-border-radius: 5px; -fx-font-size: 9pt ;" +
                    " -fx-font-family: STHeiti");
        });

        closeButton.setOnAction(e->{
            primaryStage.close();
        });

        Pane passwordPane = new Pane();
        passwordPane.getChildren().addAll(newPasswordTextField,newPasswordTextFieldAgain,codeTextField,codeButton,confirmButton,emailTextField,closeButton);
        primaryStage.setScene(new Scene(passwordPane,300,250));
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.show();
    }
}
