import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
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
        importTextField.setPrefWidth(350);
        importTextField.setLayoutX(37);
        importTextField.setLayoutY(20);
        importTextField.setAlignment(Pos.CENTER_RIGHT);
        importTextField.setFont(Font.font ("Verdana", 40));
        //工资 投资 衣食住行
        DatePicker datePicker = new DatePicker();
        addPane.getChildren().add(datePicker);
        datePicker.setLayoutX(287);
        datePicker.setLayoutY(130);
        datePicker.setPrefSize(100,20);
        datePicker.setValue(LocalDate.now());

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

        TextField customizeTextField = new TextField();
        customizeTextField.setPromptText("请输入自定义内容");
        customizeTextField.setPrefHeight(60);
        customizeTextField.setPrefWidth(175);
        customizeTextField.setLayoutX(37);
        customizeTextField.setLayoutY(425);
        Button confirmButton = new Button("确认");
        confirmButton.setPrefHeight(57);
        confirmButton.setPrefWidth(175);
        confirmButton.setLayoutX(212);
        confirmButton.setLayoutY(426);

        addPane.getChildren().addAll(salaryButton,investButton,clothesButton,eatButton,houseButton,trafficButton,customizeTextField,confirmButton);

        salaryButton.setPrefWidth(175);
        salaryButton.setPrefHeight(60);
        salaryButton.setLayoutX(37);
        salaryButton.setLayoutY(175);

        investButton.setPrefWidth(175);
        investButton.setPrefHeight(60);
        investButton.setLayoutX(212);
        investButton.setLayoutY(175);

        clothesButton.setPrefWidth(175);
        clothesButton.setPrefHeight(60);
        clothesButton.setLayoutX(37);
        clothesButton.setLayoutY(330);

        eatButton.setPrefWidth(175);
        eatButton.setPrefHeight(60);
        eatButton.setLayoutX(37);
        eatButton.setLayoutY(270);

        houseButton.setPrefWidth(175);
        houseButton.setPrefHeight(60);
        houseButton.setLayoutX(212);
        houseButton.setLayoutY(270);

        trafficButton.setPrefWidth(175);
        trafficButton.setPrefHeight(60);
        trafficButton.setLayoutX(212);
        trafficButton.setLayoutY(330);

        salaryButton .setStyle(
                "-fx-background-color: #f9fbff;\n" +
                        //"-fx-background-radius: 5;\n" +
                        //"-fx-border-radius: 5;" +
                        "-fx-font-size:16px;");
        salaryButton.setOnMouseEntered(
                e->{
                    salaryButton.setStyle("-fx-background-color: #e2e3e7;\n" +
                            //"-fx-background-radius: 5;\n" +
                            //"-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        salaryButton.setOnMouseExited(
                e->{
                    salaryButton.setStyle("-fx-background-color: #f9fbff;\n" +
                            //"-fx-background-radius: 5;\n" +
                            //"-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        salaryButton.setOnMousePressed(
                e->{
                    salaryButton.setStyle("-fx-background-color: #b5b6ba;\n" +
                            //"-fx-background-radius: 5;\n" +
                            //"-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        salaryButton.setOnMouseReleased(
                e->{
                    salaryButton.setStyle(
                            "-fx-background-color: #f9fbff;\n" +
                                    //"-fx-background-radius: 5;\n" +
                                    //"-fx-border-radius: 5;"+
                                    "-fx-font-size:16px;");
                });

        investButton.setStyle(
                "-fx-background-color: #f9fbff;\n" +
                        //"-fx-background-radius: 5;\n" +
                        //"-fx-border-radius: 5;" +
                        "-fx-font-size:16px;");
        investButton.setOnMouseEntered(
                e->{
                    investButton.setStyle("-fx-background-color: #e2e3e7;\n" +
                            //"-fx-background-radius: 5;\n" +
                            //"-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        investButton.setOnMouseExited(
                e->{
                    investButton.setStyle("-fx-background-color: #f9fbff;\n" +
                            //"-fx-background-radius: 5;\n" +
                            //"-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        investButton.setOnMousePressed(
                e->{
                    investButton.setStyle("-fx-background-color: #b5b6ba;\n" +
                            //"-fx-background-radius: 5;\n" +
                            //"-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        investButton.setOnMouseReleased(
                e->{
                    investButton.setStyle(
                            "-fx-background-color: #f9fbff;\n" +
                                    //"-fx-background-radius: 5;\n" +
                                    //"-fx-border-radius: 5;"+
                                    "-fx-font-size:16px;");
                });

        clothesButton.setStyle(
                "-fx-background-color: antiquewhite;\n" +
                        //"-fx-background-radius: 5;\n" +
                        //"-fx-border-radius: 5;" +
                        "-fx-font-size:16px;");
        clothesButton.setOnMouseEntered(
                e->{
                    clothesButton.setStyle("-fx-background-color: #d9d4bf;\n" +
                            //"-fx-background-radius: 5;\n" +
                            //"-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        clothesButton.setOnMouseExited(
                e->{
                    clothesButton.setStyle("-fx-background-color: antiquewhite;\n" +
                            //"-fx-background-radius: 5;\n" +
                            //"-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        clothesButton.setOnMousePressed(
                e->{
                    clothesButton.setStyle("-fx-background-color: #c9c4af;\n" +
                            //"-fx-background-radius: 5;\n" +
                            //"-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        clothesButton.setOnMouseReleased(
                e->{
                    clothesButton.setStyle(
                            "-fx-background-color: antiquewhite;\n" +
                                    //"-fx-background-radius: 5;\n" +
                                    // "-fx-border-radius: 5;"+
                                    "-fx-font-size:16px;");
                });

        eatButton.setStyle(
                "-fx-background-color: antiquewhite;\n" +
                        // "-fx-background-radius: 5;\n" +
                        // "-fx-border-radius: 5;" +
                        "-fx-font-size:16px;");
        eatButton.setOnMouseEntered(
                e->{
                    eatButton.setStyle("-fx-background-color: #d9d4bf;\n" +
                            // "-fx-background-radius: 5;\n" +
                            // "-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        eatButton.setOnMouseExited(
                e->{
                    eatButton.setStyle("-fx-background-color: antiquewhite;\n" +
                            //"-fx-background-radius: 5;\n" +
                            // "-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        eatButton.setOnMousePressed(
                e->{
                    eatButton .setStyle("-fx-background-color: #c9c4af;\n" +
                            //"-fx-background-radius: 5;\n" +
                            //"-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        eatButton.setOnMouseReleased(
                e->{
                    eatButton.setStyle(
                            "-fx-background-color: antiquewhite;\n" +
                                    //"-fx-background-radius: 5;\n" +
                                    //"-fx-border-radius: 5;"+
                                    "-fx-font-size:16px;");
                });

        houseButton .setStyle(
                "-fx-background-color: antiquewhite;\n" +
                        // "-fx-background-radius: 5;\n" +
                        //"-fx-border-radius: 5;" +
                        "-fx-font-size:16px;");
        houseButton .setOnMouseEntered(
                e->{
                    houseButton .setStyle("-fx-background-color: #d9d4bf;\n" +
                            //"-fx-background-radius: 5;\n" +
                            //"-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        houseButton .setOnMouseExited(
                e->{
                    houseButton .setStyle("-fx-background-color: antiquewhite;\n" +
                            //"-fx-background-radius: 5;\n" +
                            // "-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        houseButton .setOnMousePressed(
                e->{
                    houseButton  .setStyle("-fx-background-color: #c9c4af;\n" +
                            //"-fx-background-radius: 5;\n" +
                            //"-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        houseButton .setOnMouseReleased(
                e->{
                    houseButton .setStyle(
                            "-fx-background-color: antiquewhite;\n" +
                                    //"-fx-background-radius: 5;\n" +
                                    // "-fx-border-radius: 5;"+
                                    "-fx-font-size:16px;");
                });

        trafficButton  .setStyle(
                "-fx-background-color: antiquewhite;\n" +
                        //"-fx-background-radius: 5;\n" +
                        //"-fx-border-radius: 5;" +
                        "-fx-font-size:16px;");
        trafficButton  .setOnMouseEntered(
                e->{
                    trafficButton  .setStyle("-fx-background-color: #d9d4bf;\n" +
                            //"-fx-background-radius: 5;\n" +
                            //"-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        trafficButton  .setOnMouseExited(
                e->{
                    trafficButton  .setStyle("-fx-background-color: antiquewhite;\n" +
                            //"-fx-background-radius: 5;\n" +
                            //"-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        trafficButton  .setOnMousePressed(
                e->{
                    trafficButton   .setStyle("-fx-background-color: #c9c4af;\n" +
                            //"-fx-background-radius: 5;\n" +
                            //"-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        trafficButton  .setOnMouseReleased(
                e->{
                    trafficButton  .setStyle(
                            "-fx-background-color: antiquewhite;\n" +
                                    //"-fx-background-radius: 5;\n" +
                                    //"-fx-border-radius: 5;"+
                                    "-fx-font-size:16px;");
                });

        confirmButton.setStyle(
                "-fx-background-color: #f0f2f6;\n" +
                        //"-fx-background-radius: 5;\n" +
                        //"-fx-border-radius: 5;" +
                        "-fx-font-size:16px;");
        confirmButton.setOnMouseEntered(
                e->{
                    confirmButton.setStyle("-fx-background-color: #e2e3e7;\n" +
                            //"-fx-background-radius: 5;\n" +
                            //"-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        confirmButton.setOnMouseExited(
                e->{
                    confirmButton.setStyle("-fx-background-color: #f0f2f6;\n" +
                            //"-fx-background-radius: 5;\n" +
                            //"-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        confirmButton.setOnMousePressed(
                e->{
                    confirmButton.setStyle("-fx-background-color: #b5b6ba;\n" +
                            //"-fx-background-radius: 5;\n" +
                            //"-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        confirmButton.setOnMouseReleased(
                e->{
                    confirmButton.setStyle(
                            "-fx-background-color: #f0f2f6;\n" +
                                    //"-fx-background-radius: 5;\n" +
                                    //"-fx-border-radius: 5;"+
                                    "-fx-font-size:16px;");
                });

//内部类用于发送消息和接收消息
        class Send{
            public void sendMessage(String species) throws IOException {
                ClientSocket socket = new ClientSocket("192.168.43.10",8888);
                if(datePicker.getValue().toString()==null){
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("错误");
                    alert.setHeaderText(null);
                    alert.setContentText("不能为空");
                    socket.close();
                }
                String message = "M/"+MainUi.user.getEmail()+"/"+species+"/"+importTextField.getText()+"/"+datePicker.getValue().toString().trim();
                socket.send(message);
                String[] messages= socket.accept().split("/");
                switch (messages[0].charAt(0)){
                    case 'C':{
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("成功");
                        alert.setHeaderText(null);
                        alert.setContentText("添加成功");
                        alert.showAndWait();
                        datePicker.setValue(LocalDate.now());
                        customizeTextField.setText("");
                        importTextField.setText("");
                        socket.close();
                        break;
                    }
                    case 'F':{
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("错误");
                        alert.setHeaderText(null);
                        alert.setContentText("添加失败");
                        alert.showAndWait();
                        socket.close();
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
        confirmButton.setOnAction(e->{
            try {
                new Send().sendMessage(customizeTextField.getText());
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });
    }
}
