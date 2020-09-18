import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;


/**
 * @program: Client
 * @description: 用户信息Ui
 * @author: yps
 * @create: 2020-09-18 10:06
 **/
public class UserInformationUi {
    public Pane userInformationPane = new Pane();

    public void init(User user){
        Label backgroundLabel = new Label("                     ");
        backgroundLabel.setStyle("-fx-background-radius: 10px ;-fx-background-color: gray;");
        backgroundLabel.setPrefHeight(160);
        backgroundLabel.setPrefWidth(300);
        backgroundLabel.setLayoutX(38);
        backgroundLabel.setLayoutY(40);

        Button changePasswordButton = new Button("修改密码");
        Button switchAccountButton = new Button("更换账号");
        Button cancelAccountButton = new Button("注销账户");

        changePasswordButton.setLayoutX(113);
        changePasswordButton.setLayoutY(225);
        changePasswordButton.setPrefHeight(50);
        changePasswordButton.setPrefWidth(150);

        switchAccountButton.setLayoutX(113);
        switchAccountButton.setLayoutY(300);
        switchAccountButton.setPrefHeight(50);
        switchAccountButton.setPrefWidth(150);

        cancelAccountButton.setLayoutX(113);
        cancelAccountButton.setLayoutY(375);
        cancelAccountButton.setPrefHeight(50);
        cancelAccountButton.setPrefWidth(150);

        userInformationPane.getChildren().addAll(backgroundLabel,cancelAccountButton,switchAccountButton,changePasswordButton);




    }
}
