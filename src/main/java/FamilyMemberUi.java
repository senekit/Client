import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

/**
 * @program: Client
 * @description: 家庭成员界面Ui
 * @author: Wry is a vegetable guy
 * @create: 2020-09-18 10:46
 **/
public class FamilyMemberUi {
    Pane familyMemberPane = new Pane();
    public void init(User user){
        System.out.println(user.getFamilyId());
        if(user.getFamilyId() == "0"){

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
        }
    }
}