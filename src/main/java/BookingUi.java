import javafx.scene.control.*;
import javafx.scene.layout.Pane;
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
        Text timeText = new Text("时间：");
        Text expendText = new Text("支出：");
        Text incomeText = new Text("收入：");
        DatePicker datePicker = new DatePicker();
        TextField expendTextField = new TextField();
        TextField incomeTextField = new TextField();

        addPane.getChildren().add(timeText);
        addPane.getChildren().add(expendText);
        addPane.getChildren().add(incomeText);
        addPane.getChildren().add(datePicker);
        addPane.getChildren().add(expendTextField);
        addPane.getChildren().add(incomeTextField);

        datePicker.setLayoutX(200);
        datePicker.setLayoutY(100);
        timeText.setLayoutX(150);
        timeText.setLayoutY(115);
        incomeTextField.setLayoutX(200);
        incomeTextField.setLayoutY(150);
        incomeText.setLayoutX(150);
        incomeText.setLayoutY(165);
        expendTextField.setLayoutX(200);
        expendTextField.setLayoutY(200);
        addTab.setContent(addPane);

    }
}
