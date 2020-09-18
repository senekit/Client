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


        changePasswordButton.setLayoutX(150);
        changePasswordButton.setLayoutY(300);
        changePasswordButton.setPrefHeight(200);
        changePasswordButton.setLayoutY(150);







        userInformationPane.getChildren().addAll(backgroundLabel,cancelAccountButton,switchAccountButton,changePasswordButton);
    }
}
