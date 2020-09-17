import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


/**
 * @program: Client
 * @description: 记账本Ui
 * @author: yps
 * @create: 2020-09-17 15:28
 **/
public class BookingUi {
    public TabPane bookingPane;

    public void init(){
        bookingPane = new TabPane();

        Tab addTab = new Tab("添加");
        Tab tableTab = new Tab("更改数据");
        Tab chartTab = new Tab("图表可视化");
        addTab.setClosable(false);
        tableTab.setClosable(false);
        chartTab.setClosable(false);

        bookingPane.getTabs().addAll(addTab,tableTab,chartTab);

        Pane addPane = new Pane();
        addTab.setContent(addPane);

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
    }
}
