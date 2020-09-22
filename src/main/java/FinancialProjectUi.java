import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;

import java.io.IOException;

/**
 * @program: Client
 * @description: 理财项目Tab界面下ui
 * @author: yps
 * @create: 2020-09-17 10:35
 **/
public class FinancialProjectUi {
    public TabPane financialProjectTabPane;

    public void init() throws IOException {
        this.financialProjectTabPane = new TabPane();
        Tab stableTab = new Tab("保守");//WS
        Tab radicalTab = new Tab("激进");//RS
        stableTab.setClosable(false);
        radicalTab.setClosable(false);
        this.financialProjectTabPane.getTabs().addAll(stableTab,radicalTab);

        Pane stablePane = new Pane();
        Pane radicalPane = new Pane();

        TableView stableTable = new TableView();
        TableView radicalTable = new TableView();

        ClientSocket socket = new ClientSocket("127.0.0.1",8888);
        socket.send(new String("WS"));
        String[] message=socket.accept().trim().split("#");

        String[] messages1=message[0].split("/");
        creatTable(stableTable,messages1);

        String[] messages2=message[1].split("/");
        creatTable(radicalTable,messages2);


        stablePane.getChildren().add(stableTable);
        radicalPane.getChildren().add(radicalTable);

        stableTab.setContent(stablePane);
        radicalTab.setContent(radicalPane);

        socket.close();
    }

    public void creatTable(TableView tableView,String[] messages){
        TableColumn codeColumn = new TableColumn("编号");
        TableColumn nameColumn = new TableColumn("名字");
        TableColumn todayOpeningColumn = new TableColumn("今开");
        TableColumn todayTurnoverColumn = new TableColumn("今日成交量");
        TableColumn amplitudeColumn = new TableColumn("振幅");
        TableColumn highestColumn = new TableColumn("最高");
        TableColumn lowestColumn = new TableColumn("最低");

        tableView.setEditable(false);

        tableView.getColumns().addAll(codeColumn,nameColumn,todayOpeningColumn,todayTurnoverColumn,amplitudeColumn,highestColumn,lowestColumn);

        ObservableList<Stock> data = FXCollections.observableArrayList();
        int i = 0;
        while(i< messages.length-1){
            data.add(new Stock(messages[i++], messages[i++],messages[i++],messages[i++],messages[i++],messages[i++],messages[i++]));
        }

        codeColumn.setCellValueFactory(new PropertyValueFactory<Stock, SimpleStringProperty>("code"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<Stock, SimpleStringProperty>("name"));
        todayOpeningColumn.setCellValueFactory(new PropertyValueFactory<Stock, SimpleStringProperty>("todayOpeningPrice"));
        todayTurnoverColumn.setCellValueFactory(new PropertyValueFactory<Stock, SimpleStringProperty>("todayTurnover"));
        amplitudeColumn.setCellValueFactory(new PropertyValueFactory<Stock, SimpleStringProperty>("amplitude"));
        highestColumn.setCellValueFactory(new PropertyValueFactory<Stock, SimpleStringProperty>("highest"));
        lowestColumn.setCellValueFactory(new PropertyValueFactory<Stock, SimpleStringProperty>("lowest"));

        tableView.setItems(data);
    }
}
