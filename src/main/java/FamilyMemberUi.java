import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


import java.io.IOException;

/**
 * program: Client
 * description: 家庭成员界面Ui
 * author: Wry is a vegetable guy
 * create: 2020-09-18 10:46
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
            promptText.setLayoutX(65);
            promptText.setLayoutY(50);

            createButton.setPrefWidth(250);
            createButton.setPrefHeight(150);
            createButton.setLayoutX(90);
            createButton.setLayoutY(90);
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

            joinButton.setPrefWidth(250);
            joinButton.setPrefHeight(150);
            joinButton.setLayoutX(90);
            joinButton.setLayoutY(280);
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
            backgroundLabel1.setPrefHeight(150);
            backgroundLabel1.setPrefWidth(350);
            backgroundLabel1.setLayoutX(40);
            backgroundLabel1.setLayoutY(15);

            Label backgroundLabel2 = new Label("                     ");
            backgroundLabel2.setStyle("-fx-background-radius: 10px ;-fx-background-color: gray;");
            backgroundLabel2.setPrefHeight(150);
            backgroundLabel2.setPrefWidth(350);
            backgroundLabel2.setLayoutX(40);
            backgroundLabel2.setLayoutY(175);

            Label backgroundLabel3 = new Label("                     ");
            backgroundLabel3.setStyle("-fx-background-radius: 10px ;-fx-background-color: gray;");
            backgroundLabel3.setPrefHeight(150);
            backgroundLabel3.setPrefWidth(350);
            backgroundLabel3.setLayoutX(40);
            backgroundLabel3.setLayoutY(340);

            TextArea backgroundTextArea1 = new TextArea();
            TextArea backgroundTextArea2 = new TextArea();
            TextArea backgroundTextArea3 = new TextArea();
            backgroundTextArea1.setEditable(false);
            backgroundTextArea2.setEditable(false);
            backgroundTextArea3.setEditable(false);

            backgroundTextArea1.setLayoutX(67);
            backgroundTextArea1.setLayoutY(100);
            backgroundTextArea1.setPrefHeight(58);
            backgroundTextArea1.setPrefWidth(300);

            backgroundTextArea2.setLayoutX(67);
            backgroundTextArea2.setLayoutY(260);
            backgroundTextArea2.setPrefHeight(58);
            backgroundTextArea2.setPrefWidth(300);

            backgroundTextArea3.setLayoutX(67);
            backgroundTextArea3.setLayoutY(420);
            backgroundTextArea3.setPrefHeight(58);
            backgroundTextArea3.setPrefWidth(300);

            backgroundTextArea1.setStyle("-fx-control-inner-background: gray; -fx-text-fill: white");
            backgroundTextArea2.setStyle("-fx-control-inner-background: gray; -fx-text-fill: white");
            backgroundTextArea3.setStyle("-fx-control-inner-background: gray; -fx-text-fill: white");

            ClientSocket socket = new ClientSocket("127.0.0.1",8888);
            socket.send(new String("G/"+MainUi.user.getEmail()));
            String message=socket.accept();
            System.out.println(message);
            String[] messages=message.trim().split("/");
            String background1="";
            String name1 = "姓名：" + messages[1];
            String name2 = "姓名：" + messages[11];
            String name3 = "姓名：" + messages[21];

            for (int i = 2; i <11; i+=3) {
                if(!messages[i].equals(" ")){
                    if(messages[i+1].charAt(0)=='-'){
                        background1 = background1+messages[1]+"在"+messages[i+2]+"因"+messages[i]+"支出"+messages[i+1]+"元\n";
                    }
                    else{
                        background1 = background1+messages[1]+"在"+messages[i+2]+"因"+messages[i]+"花费"+messages[i+1]+"元\n";
                    }
                }
                else break;
            }
            backgroundTextArea1.setText(background1);
            System.out.println(background1);
            String background2="";
            for (int i = 12; i <21; i+=3) {
                if(!messages[i].equals(" ")){
                    if(messages[i+1].charAt(0)=='-'){
                        background2 = background2+messages[11]+"在"+messages[i+2]+"因"+messages[i]+"支出"+messages[i+1]+"元\n";
                    }
                    else{
                        background2 = background2+messages[11]+"在"+messages[i+2]+"因"+messages[i]+"花费"+messages[i+1]+"元\n";
                    }
                }
                else break;
            }
            backgroundTextArea2.setText(background2);
            System.out.println(background2);
            String background3="";
            for (int i = 22; i <31; i+=3) {
                if(!messages[i].equals(" ")){
                    if(messages[i+1].charAt(0)=='-'){
                        background3 = background3+messages[21]+"在"+messages[i+2]+"因"+messages[i]+"支出"+messages[i+1]+"元\n";
                    }
                    else{
                        background3 = background3+messages[21]+"在"+messages[i+2]+"因"+messages[i]+"花费"+messages[i+1]+"元\n";
                    }
                }
                else break;
            }
            backgroundTextArea3.setText(background3);
            System.out.println(background3);
            Image familyMemberImageGreen = new Image("file:D:\\Study\\Client\\src\\main\\Image\\timg.png");
            Image familyMemberImageRed = new Image("file:D:\\Study\\Client\\src\\main\\Image\\timg2.png");
            ImageView familyImageView1 = null;
            if(name1.equals("姓名： "))
                familyImageView1 = new ImageView(familyMemberImageRed);
            else{
                familyImageView1 = new ImageView(familyMemberImageGreen);
            }
            familyImageView1.setX(65);
            familyImageView1.setY(20);
            familyImageView1.setFitWidth(80);
            familyImageView1.setFitHeight(80);

            ImageView familyImageView2 = null;
            if(name2.equals("姓名： "))
                familyImageView2 = new ImageView(familyMemberImageRed);
            else{
                familyImageView2 = new ImageView(familyMemberImageGreen);
            }
            familyImageView2.setX(65);
            familyImageView2.setY(180);
            familyImageView2.setFitWidth(80);
            familyImageView2.setFitHeight(80);

            ImageView familyImageView3 = null;
            System.out.println(name3);
            if(name3.equals("姓名： "))
                familyImageView3 = new ImageView(familyMemberImageRed);
            else{
                familyImageView3 = new ImageView(familyMemberImageGreen);
            }
            familyImageView3.setX(65);
            familyImageView3.setY(340);
            familyImageView3.setFitWidth(80);
            familyImageView3.setFitHeight(80);

            Text nameText1 = new Text(name1);
            Text nameText2 = new Text(name2);
            Text nameText3 = new Text(name3);

            nameText1.setLayoutX(150);
            nameText1.setLayoutY(67);
            nameText1.setStyle("-fx-font-size: 20px");

            nameText2.setLayoutX(150);
            nameText2.setLayoutY(227);
            nameText2.setStyle("-fx-font-size: 20px");

            nameText3.setLayoutX(150);
            nameText3.setLayoutY(387);
            nameText3.setStyle("-fx-font-size: 20px");

            if(backgroundTextArea1.getText().equals(""))
                backgroundTextArea1.setText("暂无收支记录");
            if(backgroundTextArea2.getText().equals(""))
                backgroundTextArea2.setText("暂无收支记录");
            if(backgroundTextArea3.getText().equals(""))
                backgroundTextArea3.setText("暂无收支记录");


            familyMemberPane.getChildren().addAll(backgroundLabel1,backgroundLabel2,backgroundLabel3,backgroundTextArea1,backgroundTextArea2,backgroundTextArea3,familyImageView1,familyImageView2,familyImageView3);
            familyMemberPane.getChildren().addAll(nameText1,nameText2,nameText3);
        }
    }
}