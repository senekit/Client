import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

import java.io.IOException;

/**
 * @program: Client
 * @description: 家庭成员界面Ui
 * @author: Wry is a vegetable guy
 * @create: 2020-09-18 10:46
 **/
public class FamilyMemberUi {
    Pane familyMemberPane = new Pane();
    public void init(User user) throws IOException {
        System.out.println(user.getFamilyId());
        if(user.getFamilyId().equals("0")){
            Text promptText = new Text("您还未加入任何家庭组，请选择加入或者创建");
            Button createButton = new Button("创建家庭组");
            Button joinButton = new Button("加入家庭组");

            promptText.setStyle("-fx-font-size: 15px;");
            promptText.setLayoutX(30);
            promptText.setLayoutY(50);

            createButton.setPrefWidth(200);
            createButton.setPrefHeight(100);
            createButton.setLayoutX(85);
            createButton.setLayoutY(100);
            createButton.setStyle("-fx-font-size: 20px");

            joinButton.setPrefWidth(200);
            joinButton.setPrefHeight(100);
            joinButton.setLayoutX(85);
            joinButton.setLayoutY(250);
            joinButton.setStyle("-fx-font-size: 20px");

            familyMemberPane.getChildren().addAll(promptText,createButton,joinButton);
        }
        else{
            Label backgroundLabel1 = new Label("                     ");
            backgroundLabel1.setStyle("-fx-background-radius: 10px ;-fx-background-color: gray;");
            backgroundLabel1.setPrefHeight(130);
            backgroundLabel1.setPrefWidth(300);
            backgroundLabel1.setLayoutX(38);
            backgroundLabel1.setLayoutY(20);

            Label backgroundLabel2 = new Label("                     ");
            backgroundLabel2.setStyle("-fx-background-radius: 10px ;-fx-background-color: gray;");
            backgroundLabel2.setPrefHeight(130);
            backgroundLabel2.setPrefWidth(300);
            backgroundLabel2.setLayoutX(38);
            backgroundLabel2.setLayoutY(170);

            Label backgroundLabel3 = new Label("                     ");
            backgroundLabel3.setStyle("-fx-background-radius: 10px ;-fx-background-color: gray;");
            backgroundLabel3.setPrefHeight(130);
            backgroundLabel3.setPrefWidth(300);
            backgroundLabel3.setLayoutX(38);
            backgroundLabel3.setLayoutY(320);

            familyMemberPane.getChildren().addAll(backgroundLabel1,backgroundLabel2,backgroundLabel3);

            ClientSocket socket = new ClientSocket("127.0.0.1",8888);
            socket.send(new String(user.getFamilyId()+user.getEmail()));
            String[] messages=socket.accept().trim().split("/");
        }
    }
}