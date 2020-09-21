import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.format.DateTimeFormatter;


/**
 * @program: Client
 * @description: 记账本Ui
 * @author: yps
 * @create: 2020-09-17 15:28
 **/
public class BookingUi {

    public Pane bookingPane;

    public void init(){

        Pane addPane = new Pane();
        bookingPane = addPane;
        TextField importTextField = new TextField();
        addPane.getChildren().add(importTextField);
        importTextField.setPrefHeight(100);
        importTextField.setPrefWidth(300);
        importTextField.setLayoutX(37);
        importTextField.setLayoutY(20);
        importTextField.setAlignment(Pos.CENTER_RIGHT);
        importTextField.setFont(Font.font ("Verdana", 40));
        //工资 投资 衣食住行
        DatePicker datePicker = new DatePicker();
        addPane.getChildren().add(datePicker);
        datePicker.setLayoutX(235);
        datePicker.setLayoutY(130);
        datePicker.setPrefWidth(100);

        Text moneySign = new Text("￥");
        addPane.getChildren().add(moneySign);
        moneySign.setFont(Font.font ("Verdana", 80));
        moneySign.setLayoutX(50);
        moneySign.setLayoutY(100);

        Button salaryButton = new Button("工资");
        Button investButton = new Button("投资");
        Button clothesButton = new Button("服装");
        Button eatButton = new Button("食物");
        Button houseButton = new Button("居住");
        Button trafficButton = new Button("交通");
        addPane.getChildren().addAll(salaryButton,investButton,clothesButton,eatButton,houseButton,trafficButton);

        salaryButton.setPrefWidth(120);
        salaryButton.setPrefHeight(40);
        salaryButton.setLayoutX(55);
        salaryButton.setLayoutY(210);

        investButton.setPrefWidth(120);
        investButton.setPrefHeight(40);
        investButton.setLayoutX(55);
        investButton.setLayoutY(270);

        clothesButton.setPrefWidth(120);
        clothesButton.setPrefHeight(40);
        clothesButton.setLayoutX(55);
        clothesButton.setLayoutY(330);

        eatButton.setPrefWidth(120);
        eatButton.setPrefHeight(40);
        eatButton.setLayoutX(195);
        eatButton.setLayoutY(210);

        houseButton.setPrefWidth(120);
        houseButton.setPrefHeight(40);
        houseButton.setLayoutX(195);
        houseButton.setLayoutY(270);

        trafficButton.setPrefWidth(120);
        trafficButton.setPrefHeight(40);
        trafficButton.setLayoutX(195);
        trafficButton.setLayoutY(330);

        salaryButton .setStyle(
                "-fx-background-color: antiquewhite;\n" +
                        "-fx-background-radius: 5;\n" +
                        "-fx-border-radius: 5;" +
                        "-fx-font-size:16px;");
        salaryButton.setOnMouseEntered(
                e->{
                    salaryButton.setStyle("-fx-background-color: #d9d4bf;\n" +
                            "-fx-background-radius: 5;\n" +
                            "-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        salaryButton.setOnMouseExited(
                e->{
                    salaryButton.setStyle("-fx-background-color: antiquewhite;\n" +
                            "-fx-background-radius: 5;\n" +
                            "-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        salaryButton.setOnMousePressed(
                e->{
                    salaryButton.setStyle("-fx-background-color: #c9c4af;\n" +
                            "-fx-background-radius: 5;\n" +
                            "-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        salaryButton.setOnMouseReleased(
                e->{
                    salaryButton.setStyle(
                            "-fx-background-color: antiquewhite;\n" +
                                    "-fx-background-radius: 5;\n" +
                                    "-fx-border-radius: 5;"+
                                    "-fx-font-size:16px;");
                });

        investButton  .setStyle(
                "-fx-background-color: antiquewhite;\n" +
                        "-fx-background-radius: 5;\n" +
                        "-fx-border-radius: 5;" +
                        "-fx-font-size:16px;");
        investButton .setOnMouseEntered(
                e->{
                    investButton .setStyle("-fx-background-color: #d9d4bf;\n" +
                            "-fx-background-radius: 5;\n" +
                            "-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        investButton .setOnMouseExited(
                e->{
                    investButton .setStyle("-fx-background-color: antiquewhite;\n" +
                            "-fx-background-radius: 5;\n" +
                            "-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        investButton .setOnMousePressed(
                e->{
                    investButton .setStyle("-fx-background-color: #c9c4af;\n" +
                            "-fx-background-radius: 5;\n" +
                            "-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        investButton .setOnMouseReleased(
                e->{
                    investButton .setStyle(
                            "-fx-background-color: antiquewhite;\n" +
                                    "-fx-background-radius: 5;\n" +
                                    "-fx-border-radius: 5;"+
                                    "-fx-font-size:16px;");
                });

        clothesButton.setStyle(
                "-fx-background-color: antiquewhite;\n" +
                        "-fx-background-radius: 5;\n" +
                        "-fx-border-radius: 5;" +
                        "-fx-font-size:16px;");
        clothesButton.setOnMouseEntered(
                e->{
                    clothesButton.setStyle("-fx-background-color: #d9d4bf;\n" +
                            "-fx-background-radius: 5;\n" +
                            "-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        clothesButton.setOnMouseExited(
                e->{
                    clothesButton.setStyle("-fx-background-color: antiquewhite;\n" +
                            "-fx-background-radius: 5;\n" +
                            "-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        clothesButton.setOnMousePressed(
                e->{
                    clothesButton.setStyle("-fx-background-color: #c9c4af;\n" +
                            "-fx-background-radius: 5;\n" +
                            "-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        clothesButton.setOnMouseReleased(
                e->{
                    clothesButton.setStyle(
                            "-fx-background-color: antiquewhite;\n" +
                                    "-fx-background-radius: 5;\n" +
                                    "-fx-border-radius: 5;"+
                                    "-fx-font-size:16px;");
                });

        eatButton.setStyle(
                "-fx-background-color: antiquewhite;\n" +
                        "-fx-background-radius: 5;\n" +
                        "-fx-border-radius: 5;" +
                        "-fx-font-size:16px;");
        eatButton.setOnMouseEntered(
                e->{
                    eatButton.setStyle("-fx-background-color: #d9d4bf;\n" +
                            "-fx-background-radius: 5;\n" +
                            "-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        eatButton.setOnMouseExited(
                e->{
                    eatButton.setStyle("-fx-background-color: antiquewhite;\n" +
                            "-fx-background-radius: 5;\n" +
                            "-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        eatButton.setOnMousePressed(
                e->{
                    eatButton .setStyle("-fx-background-color: #c9c4af;\n" +
                            "-fx-background-radius: 5;\n" +
                            "-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        eatButton.setOnMouseReleased(
                e->{
                    eatButton.setStyle(
                            "-fx-background-color: antiquewhite;\n" +
                                    "-fx-background-radius: 5;\n" +
                                    "-fx-border-radius: 5;"+
                                    "-fx-font-size:16px;");
                });

        houseButton .setStyle(
                "-fx-background-color: antiquewhite;\n" +
                        "-fx-background-radius: 5;\n" +
                        "-fx-border-radius: 5;" +
                        "-fx-font-size:16px;");
        houseButton .setOnMouseEntered(
                e->{
                    houseButton .setStyle("-fx-background-color: #d9d4bf;\n" +
                            "-fx-background-radius: 5;\n" +
                            "-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        houseButton .setOnMouseExited(
                e->{
                    houseButton .setStyle("-fx-background-color: antiquewhite;\n" +
                            "-fx-background-radius: 5;\n" +
                            "-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        houseButton .setOnMousePressed(
                e->{
                    houseButton  .setStyle("-fx-background-color: #c9c4af;\n" +
                            "-fx-background-radius: 5;\n" +
                            "-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        houseButton .setOnMouseReleased(
                e->{
                    houseButton .setStyle(
                            "-fx-background-color: antiquewhite;\n" +
                                    "-fx-background-radius: 5;\n" +
                                    "-fx-border-radius: 5;"+
                                    "-fx-font-size:16px;");
                });

        trafficButton  .setStyle(
                "-fx-background-color: antiquewhite;\n" +
                        "-fx-background-radius: 5;\n" +
                        "-fx-border-radius: 5;" +
                        "-fx-font-size:16px;");
        trafficButton  .setOnMouseEntered(
                e->{
                    trafficButton  .setStyle("-fx-background-color: #d9d4bf;\n" +
                            "-fx-background-radius: 5;\n" +
                            "-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        trafficButton  .setOnMouseExited(
                e->{
                    trafficButton  .setStyle("-fx-background-color: antiquewhite;\n" +
                            "-fx-background-radius: 5;\n" +
                            "-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        trafficButton  .setOnMousePressed(
                e->{
                    trafficButton   .setStyle("-fx-background-color: #c9c4af;\n" +
                            "-fx-background-radius: 5;\n" +
                            "-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        trafficButton  .setOnMouseReleased(
                e->{
                    trafficButton  .setStyle(
                            "-fx-background-color: antiquewhite;\n" +
                                    "-fx-background-radius: 5;\n" +
                                    "-fx-border-radius: 5;"+
                                    "-fx-font-size:16px;");
                });
//内部类用于发送消息和接收消息
        class Send{
            public void sendMessage(String species) throws IOException {
                ClientSocket socket = new ClientSocket("127.0.0.1",8888);
                if(datePicker.getValue().toString()==null){
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("错误");
                    alert.setHeaderText(null);
                    alert.setContentText("不能为空");
                }
                String message = "M/"+MainUi.user.getEmail()+"/"+species+"/"+importTextField.getText()+"/"+datePicker.getValue().toString().trim();
                System.out.println(datePicker.getValue().toString());
                socket.send(message);
                String[] messages= socket.accept().split("/");
                switch (messages[0].charAt(0)){
                    case 'C':{
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("成功");
                        alert.setHeaderText(null);
                        alert.setContentText("添加成功");
                        alert.showAndWait();
                        break;
                    }
                    case 'F':{
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("错误");
                        alert.setHeaderText(null);
                        alert.setContentText("添加失败");
                        alert.showAndWait();
                        break;
                    }
                }
                socket.close();
            }
        }
//六个按钮的事件驱动
        salaryButton.setOnAction(e->{
            try {
                new Send().sendMessage(salaryButton.getText());
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });
        investButton.setOnAction(e->{
            try {
                new Send().sendMessage(investButton.getText());
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });
        clothesButton.setOnAction(e->{
            try {
                new Send().sendMessage(clothesButton.getText());
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });
        eatButton.setOnAction(e->{
            try {
                new Send().sendMessage(eatButton.getText());
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });
        houseButton.setOnAction(e->{
            try {
                new Send().sendMessage(houseButton.getText());
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });
        trafficButton.setOnAction(e->{
            try {
                new Send().sendMessage(trafficButton.getText());
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });
    }
}
