import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;



/**
 * @program: Client
 * @description: 加入家庭组Ui
 * @author: yps
 * @create: 2020-09-20 15:50
 **/
public class JoinFamilyUi extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        TextField familyTextField = new TextField();
        Button confirmButton = new Button("确定");
        familyTextField.setPromptText("请输入家庭组ID");

        familyTextField.setLayoutX(22);
        familyTextField.setLayoutY(20);
        confirmButton.setLayoutX(70);
        confirmButton.setLayoutY(60);
        confirmButton.setPrefWidth(60);

        Pane joinFamilyPane = new Pane();
        joinFamilyPane.getChildren().addAll(familyTextField,confirmButton);
        primaryStage.setScene(new Scene(joinFamilyPane,200,100));
        primaryStage.show();
    }
}
