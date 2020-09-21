import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * @program: Client
 * @description: 家庭成员界面Ui
 * @author: Wry is a vegetable guy
 * @create: 2020-09-18 10:46
 **/
public class FamilyMemberUi {
    Pane familyMemberPane = new Pane();
    public void init(Tab incomeTab) throws IOException {
        System.out.println(MainUi.user.getFamilyId());
        if(MainUi.user.getFamilyId().equals("0")){

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

            createButton .setStyle(
                    "-fx-background-color: #f9fbff;\n" +
                            //"-fx-background-radius: 5;\n" +
                            //"-fx-border-radius: 5;" +
                            "-fx-font-size:16px;");
            createButton.setOnMouseEntered(
                    e->{
                        createButton.setStyle("-fx-background-color: #e2e3e7;\n" +
                                //"-fx-background-radius: 5;\n" +
                                //"-fx-border-radius: 5;"+
                                "-fx-font-size:16px;");
                    });
            createButton.setOnMouseExited(
                    e->{
                        createButton.setStyle("-fx-background-color: #f9fbff;\n" +
                                //"-fx-background-radius: 5;\n" +
                                //"-fx-border-radius: 5;"+
                                "-fx-font-size:16px;");
                    });
            createButton.setOnMousePressed(
                    e->{
                        createButton.setStyle("-fx-background-color: #b5b6ba;\n" +
                                //"-fx-background-radius: 5;\n" +
                                //"-fx-border-radius: 5;"+
                                "-fx-font-size:16px;");
                    });
            createButton.setOnMouseReleased(
                    e->{
                        createButton.setStyle(
                                "-fx-background-color: #f9fbff;\n" +
                                        //"-fx-background-radius: 5;\n" +
                                        //"-fx-border-radius: 5;"+
                                        "-fx-font-size:16px;");
                    });

            joinButton.setPrefWidth(200);
            joinButton.setPrefHeight(100);
            joinButton.setLayoutX(85);
            joinButton.setLayoutY(250);
            joinButton.setStyle("-fx-font-size: 20px");

            joinButton .setStyle(
                    "-fx-background-color: #f9fbff;\n" +
                            //"-fx-background-radius: 5;\n" +
                            //"-fx-border-radius: 5;" +
                            "-fx-font-size:16px;");
            joinButton.setOnMouseEntered(
                    e->{
                        joinButton.setStyle("-fx-background-color: #e2e3e7;\n" +
                                //"-fx-background-radius: 5;\n" +
                                //"-fx-border-radius: 5;"+
                                "-fx-font-size:16px;");
                    });
            joinButton.setOnMouseExited(
                    e->{
                        joinButton.setStyle("-fx-background-color: #f9fbff;\n" +
                                //"-fx-background-radius: 5;\n" +
                                //"-fx-border-radius: 5;"+
                                "-fx-font-size:16px;");
                    });
            joinButton.setOnMousePressed(
                    e->{
                        joinButton.setStyle("-fx-background-color: #b5b6ba;\n" +
                                //"-fx-background-radius: 5;\n" +
                                //"-fx-border-radius: 5;"+
                                "-fx-font-size:16px;");
                    });
            joinButton.setOnMouseReleased(
                    e->{
                        joinButton.setStyle(
                                "-fx-background-color: #f9fbff;\n" +
                                        //"-fx-background-radius: 5;\n" +
                                        //"-fx-border-radius: 5;"+
                                        "-fx-font-size:16px;");
                    });

            familyMemberPane.getChildren().addAll(promptText,createButton,joinButton);

            joinButton.setOnAction(e->{
                JoinFamilyUi open  = new JoinFamilyUi();
                try {
                    Stage stage1 = new Stage();
                    open.setTab(incomeTab);
                    open.setFamilyMemberUi(this);
                    open.start(stage1);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            });

            createButton.setOnAction(e->{
                try {
                    ClientSocket socket = new ClientSocket("127.0.0.1",8888);
                    socket.send(new String("H/"+MainUi.user.getEmail()));
                    String[] messages=socket.accept().trim().split("/");
                    MainUi.user.setFamilyId(messages[1]);
                    familyMemberPane = new Pane();
                    incomeTab.setContent(familyMemberPane);
                    init(incomeTab);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            });
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
            socket.send(new String("G/"+MainUi.user.getEmail()));
            String[] messages=socket.accept().trim().split("/");
            String background1="";
            for (int i = 2; i <11; i+=3) {
                if(!messages[i].equals(" ")){
                    if(messages[i+1].charAt(0)=='-'){
                        background1 = background1+messages[1]+"在"+messages[i+2]+"因"+messages[i]+"支出"+messages[i+1]+"/n";
                    }
                    else{
                        background1 = background1+messages[1]+"在"+messages[i+2]+"因"+messages[i]+"花费"+messages[i+1]+"/n";
                    }
                }
                else break;
            }
            backgroundLabel1.setText(background1);
            String background2="";
            for (int i = 12; i <21; i++) {
                if(!messages[i].equals(" ")){
                    if(messages[i+1].charAt(0)=='-'){
                        background1 = background1+messages[11]+"在"+messages[i+2]+"因"+messages[i]+"支出"+messages[i+1]+"/n";
                    }
                    else{
                        background1 = background1+messages[11]+"在"+messages[i+2]+"因"+messages[i]+"花费"+messages[i+1]+"/n";
                    }
                }
                else break;
            }
            backgroundLabel2.setText(background2);
            String background3="";
            for (int i = 22; i <31; i++) {
                if(!messages[i].equals(" ")){
                    if(messages[i+1].charAt(0)=='-'){
                        background1 = background1+messages[21]+"在"+messages[i+2]+"因"+messages[i]+"支出"+messages[i+1]+"/n";
                    }
                    else{
                        background1 = background1+messages[21]+"在"+messages[i+2]+"因"+messages[i]+"花费"+messages[i+1]+"/n";
                    }
                }
                else break;
            }
            backgroundLabel3.setText(background3);
        }
    }
}