import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;


/**
 * @program: Client
 * @description: 用户信息Ui
 * @author: yps
 * @create: 2020-09-18 10:06
 **/
public class UserInformationUi {
    public Pane userInformationPane = new Pane();

    public void init( Stage stage){
        Label backgroundLabel = new Label("                     ");
        backgroundLabel.setStyle("-fx-background-radius: 10px ;-fx-background-color: gray;");
        backgroundLabel.setPrefHeight(160);
        backgroundLabel.setPrefWidth(300);
        backgroundLabel.setLayoutX(38);
        backgroundLabel.setLayoutY(20);

        Button changePasswordButton = new Button("修改密码");
        Button switchAccountButton = new Button("更换账号");
        Button cancelAccountButton = new Button("注销账户");
        Button deleteButton = new Button("解散家庭");
        Button cancelButton = new Button("退出程序");

        changePasswordButton.setLayoutX(113);
        changePasswordButton.setLayoutY(205);
        changePasswordButton.setPrefHeight(50);
        changePasswordButton.setPrefWidth(150);

        switchAccountButton.setLayoutX(113);
        switchAccountButton.setLayoutY(270);
        switchAccountButton.setPrefHeight(50);
        switchAccountButton.setPrefWidth(150);

        cancelAccountButton.setLayoutX(113);
        cancelAccountButton.setLayoutY(335);
        cancelAccountButton.setPrefHeight(50);
        cancelAccountButton.setPrefWidth(150);

        cancelButton.setLayoutX(113);
        cancelButton.setLayoutY(400);
        cancelButton.setPrefHeight(50);
        cancelButton.setPrefWidth(150);

        userInformationPane.getChildren().addAll(backgroundLabel,cancelAccountButton,switchAccountButton,changePasswordButton,deleteButton,cancelButton);

        Text emailText = new Text("邮箱：" + MainUi.user.getEmail());
        Text nameText = new Text("姓名：" + MainUi.user.getName());
        Text familyIdText = new Text("家庭ID：" + MainUi.user.getFamilyId());

        emailText.setLayoutX(60);
        emailText.setLayoutY(50);
        emailText.setStyle("-fx-font-size: 15px;");

        nameText.setLayoutX(60);
        nameText.setLayoutY(80);
        nameText.setStyle("-fx-font-size: 15px;");

        familyIdText.setLayoutX(60);
        familyIdText.setLayoutY(110);
        familyIdText.setStyle("-fx-font-size: 15px;");

        userInformationPane.getChildren().addAll(emailText,nameText,familyIdText);

        //退出
        cancelButton.setOnAction(e-> stage.close());

        //更换
        switchAccountButton.setOnAction(e->{
            stage.close();
            LoginInUi open = new LoginInUi();
            try {
                open.start(new Stage());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        //修改
        changePasswordButton.setOnAction(e-> {
            UserInformationPasswordUi open = new UserInformationPasswordUi();
            try {
                open.start(new Stage());
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });

        //解散
        deleteButton.setOnAction(e->{
            try {
                ClientSocket socket = new ClientSocket("192.168.31.56",8888);
                socket.send(new String("Z/"+MainUi.user.getFamilyId()));
                MainUi.user.setFamilyId("0");
                init(new Stage());
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

        });
    }
}
