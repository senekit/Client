import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

import java.io.IOException;

/**
 * @program: Client
 * @description: 财务分析Ui
 * @author: Wry is a vegetable guy
 * @create: 2020-09-18 10:41
 **/
public class FinancialAnalysisUi {

    private final TableView<User> table = new TableView<>();
    int tag = 0;
    Pane financialAnalysisPane;
    public void init(User user) throws IOException {
        financialAnalysisPane = new Pane();

        final Label label = new Label("收支记录");
        label.setFont(new Font("Arial", 20));

        table.setEditable(true);

        TableColumn itemColumn = new TableColumn("收支项目");
        TableColumn moneyColumn = new TableColumn("金额");
        TableColumn dateColumn = new TableColumn("日期");

        if(tag == 0){
            table.getColumns().addAll(itemColumn, moneyColumn, dateColumn);
            tag++;
        }


        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, table);

        financialAnalysisPane.getChildren().add(vbox);

        ClientSocket socket = new ClientSocket("192.168.43.47",8888);
        String send = "I/"+user.getEmail();
        System.out.println(send);
        socket.send(send);
        String[] message=socket.accept().split("/");

        ObservableList<User> data = FXCollections.observableArrayList(new User(message[1], message[2],message[3]));
        int i = 4;
        while(i< message.length){
             data.add(new User(message[i++], message[i++],message[i++]));
        }

        itemColumn.setCellValueFactory(new PropertyValueFactory<>("item"));
        moneyColumn.setCellValueFactory(new PropertyValueFactory<>("money"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));

        table.setItems(data);

    }

}
