import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URI;


/**
 * @program: Client
 * @description: 用户信息Ui
 * @author: yps
 * @create: 2020-09-18 10:06
 **/
public class UserInformationUi {
    public Pane userInformationPane = new Pane();

    public void init(Stage stage){
        Label backgroundLabel = new Label("                     ");
        backgroundLabel.setStyle("-fx-background-radius: 10px ;-fx-background-color: gray;");
        backgroundLabel.setPrefHeight(160);
        backgroundLabel.setPrefWidth(300);
        backgroundLabel.setLayoutX(66);
        backgroundLabel.setLayoutY(20);

        Image userImage = new Image("file:///D:/Study/Client/src/main/Image/timg.png");
        ImageView userImageView = new ImageView(userImage);
        userImageView.setFitHeight(100);
        userImageView.setFitWidth(100);

        Button changePasswordButton = new Button("修改密码");
        Button switchAccountButton = new Button("更换账号");
        Button cancelAccountButton = new Button("注销账户");
        Button deleteButton = new Button("解散家庭");
        Button cancelButton = new Button("退出程序");

        deleteButton.setLayoutX(260);
        deleteButton.setLayoutY(140);
        deleteButton.setPrefHeight(30);
        deleteButton.setPrefWidth(80);

        changePasswordButton.setLayoutX(138);
        changePasswordButton.setLayoutY(205);
        changePasswordButton.setPrefHeight(50);
        changePasswordButton.setPrefWidth(150);

        switchAccountButton.setLayoutX(138);
        switchAccountButton.setLayoutY(270);
        switchAccountButton.setPrefHeight(50);
        switchAccountButton.setPrefWidth(150);

        cancelAccountButton.setLayoutX(138);
        cancelAccountButton.setLayoutY(335);
        cancelAccountButton.setPrefHeight(50);
        cancelAccountButton.setPrefWidth(150);

        cancelButton.setLayoutX(138);
        cancelButton.setLayoutY(400);
        cancelButton.setPrefHeight(50);
        cancelButton.setPrefWidth(150);

        deleteButton.setStyle(
                "-fx-background-color: #f9fbff;\n" +
                        "-fx-background-radius: 5;\n" +
                        "-fx-border-radius: 5;" +
                        "-fx-font-size:16px;");
        deleteButton.setOnMouseEntered(
                e->{
                    deleteButton.setStyle("-fx-background-color: #e2e3e7;\n" +
                            "-fx-background-radius: 5;\n" +
                            "-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        deleteButton.setOnMouseExited(
                e->{
                    deleteButton.setStyle("-fx-background-color: #f9fbff;\n" +
                            "-fx-background-radius: 5;\n" +
                            "-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        deleteButton.setOnMousePressed(
                e->{
                    deleteButton.setStyle("-fx-background-color: #b5b6ba;\n" +
                            "-fx-background-radius: 5;\n" +
                            "-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        deleteButton.setOnMouseReleased(
                e->{
                    deleteButton.setStyle(
                            "-fx-background-color: #f9fbff;\n" +
                                    "-fx-background-radius: 5;\n" +
                                    "-fx-border-radius: 5;"+
                                    "-fx-font-size:16px;");
                });

        changePasswordButton.setStyle(
                "-fx-background-color: #f9fbff;\n" +
                        "-fx-background-radius: 5;\n" +
                        "-fx-border-radius: 5;" +
                        "-fx-font-size:16px;");
        changePasswordButton.setOnMouseEntered(
                e->{
                    changePasswordButton.setStyle("-fx-background-color: #e2e3e7;\n" +
                            "-fx-background-radius: 5;\n" +
                            "-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        changePasswordButton.setOnMouseExited(
                e->{
                    changePasswordButton.setStyle("-fx-background-color: #f9fbff;\n" +
                            "-fx-background-radius: 5;\n" +
                            "-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        changePasswordButton.setOnMousePressed(
                e->{
                    changePasswordButton.setStyle("-fx-background-color: #b5b6ba;\n" +
                            "-fx-background-radius: 5;\n" +
                            "-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        changePasswordButton.setOnMouseReleased(
                e->{
                    changePasswordButton.setStyle(
                            "-fx-background-color: #f9fbff;\n" +
                                    "-fx-background-radius: 5;\n" +
                                    "-fx-border-radius: 5;"+
                                    "-fx-font-size:16px;");
                });

        switchAccountButton.setStyle(
                "-fx-background-color: #f9fbff;\n" +
                        "-fx-background-radius: 5;\n" +
                        "-fx-border-radius: 5;" +
                        "-fx-font-size:16px;");
        switchAccountButton.setOnMouseEntered(
                e->{
                    switchAccountButton.setStyle("-fx-background-color: #e2e3e7;\n" +
                            "-fx-background-radius: 5;\n" +
                            "-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        switchAccountButton.setOnMouseExited(
                e->{
                    switchAccountButton.setStyle("-fx-background-color: #f9fbff;\n" +
                            "-fx-background-radius: 5;\n" +
                            "-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        switchAccountButton.setOnMousePressed(
                e->{
                    switchAccountButton.setStyle("-fx-background-color: #b5b6ba;\n" +
                            "-fx-background-radius: 5;\n" +
                            "-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        switchAccountButton.setOnMouseReleased(
                e->{
                    switchAccountButton.setStyle(
                            "-fx-background-color: #f9fbff;\n" +
                                    "-fx-background-radius: 5;\n" +
                                    "-fx-border-radius: 5;"+
                                    "-fx-font-size:16px;");
                });

        cancelAccountButton.setStyle(
                "-fx-background-color: #f9fbff;\n" +
                        "-fx-background-radius: 5;\n" +
                        "-fx-border-radius: 5;" +
                        "-fx-font-size:16px;");
        cancelAccountButton.setOnMouseEntered(
                e->{
                    cancelAccountButton.setStyle("-fx-background-color: #e2e3e7;\n" +
                            "-fx-background-radius: 5;\n" +
                            "-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        cancelAccountButton.setOnMouseExited(
                e->{
                    cancelAccountButton.setStyle("-fx-background-color: #f9fbff;\n" +
                            "-fx-background-radius: 5;\n" +
                            "-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        cancelAccountButton.setOnMousePressed(
                e->{
                    cancelAccountButton.setStyle("-fx-background-color: #b5b6ba;\n" +
                            "-fx-background-radius: 5;\n" +
                            "-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        cancelAccountButton.setOnMouseReleased(
                e->{
                    cancelAccountButton.setStyle(
                            "-fx-background-color: #f9fbff;\n" +
                                    "-fx-background-radius: 5;\n" +
                                    "-fx-border-radius: 5;"+
                                    "-fx-font-size:16px;");
                });

        cancelButton.setStyle(
                "-fx-background-color: #f9fbff;\n" +
                        "-fx-background-radius: 5;\n" +
                        "-fx-border-radius: 5;" +
                        "-fx-font-size:16px;");
        cancelButton.setOnMouseEntered(
                e->{
                    cancelButton.setStyle("-fx-background-color: #e2e3e7;\n" +
                            "-fx-background-radius: 5;\n" +
                            "-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        cancelButton.setOnMouseExited(
                e->{
                    cancelButton.setStyle("-fx-background-color: #f9fbff;\n" +
                            "-fx-background-radius: 5;\n" +
                            "-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        cancelButton.setOnMousePressed(
                e->{
                    cancelButton.setStyle("-fx-background-color: #b5b6ba;\n" +
                            "-fx-background-radius: 5;\n" +
                            "-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        cancelButton.setOnMouseReleased(
                e->{
                    cancelButton.setStyle(
                            "-fx-background-color: #f9fbff;\n" +
                                    "-fx-background-radius: 5;\n" +
                                    "-fx-border-radius: 5;"+
                                    "-fx-font-size:16px;");
                });


        userInformationPane.getChildren().addAll(backgroundLabel,cancelAccountButton,switchAccountButton,changePasswordButton,deleteButton,cancelButton,userImageView);

        Text emailText = new Text("邮箱：" + MainUi.user.getEmail());
        Text nameText = new Text("姓名：" + MainUi.user.getName());
        Text familyIdText = new Text("家庭ID：" + MainUi.user.getFamilyId());

        emailText.setLayoutX(85);
        emailText.setLayoutY(55);
        emailText.setStyle("-fx-font-size: 30px;");

        nameText.setLayoutX(85);
        nameText.setLayoutY(110);
        nameText.setStyle("-fx-font-size: 30px;");

        familyIdText.setLayoutX(85);
        familyIdText.setLayoutY(165);
        familyIdText.setStyle("-fx-font-size: 30px;");

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
                ClientSocket socket = new ClientSocket("127.0.0.1",8888);
                socket.send(new String("Z/"+MainUi.user.getFamilyId()));
                familyIdText.setText("家庭ID：0");
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });
    }
}
