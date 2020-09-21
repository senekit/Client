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
        Tab stableTab = new Tab("稳定");//WS
        Tab radicalTab = new Tab("激进");//RS
        Tab popularTab = new Tab("热门");//HS
        stableTab.setClosable(false);
        radicalTab.setClosable(false);
        popularTab.setClosable(false);
        this.financialProjectTabPane.getTabs().addAll(stableTab,radicalTab,popularTab);

        Pane stablePane = new Pane();
        Pane radicalPane = new Pane();
        Pane popularPane = new Pane();

        TableView stableTable = new TableView();
        TableView radicalTable = new TableView();
        TableView popularTable = new TableView();

        ClientSocket socket = new ClientSocket("127.0.0.1",8888);
        socket.send(new String("WS"));
        String[] messages1=socket.accept().split("/");
        creatTable(stableTable,messages1);

        socket.send(new String("RS"));
        String[] messages2=socket.accept().split("/");
        creatTable(radicalTable,messages2);

        socket.send(new String("HS"));
        String[] messages3=socket.accept().split("/");
        creatTable(popularTable,messages3);

        stablePane.getChildren().add(stableTable);
        radicalPane.getChildren().add(radicalTable);
        popularPane.getChildren().add(popularTable);

        stableTab.setContent(stablePane);
        radicalTab.setContent(radicalPane);
        popularTab.setContent(popularPane);
    }

    public void creatTable(TableView tableView,String[] messages){
        TableColumn codeColumn = new TableColumn("编号");
        TableColumn nameColumn = new TableColumn("名字");
        TableColumn todayOpeningColumn = new TableColumn("今开");
        TableColumn todayTurnover = new TableColumn("今日成交量");
        TableColumn amplitudeColumn = new TableColumn("振幅");
        TableColumn highestColumn = new TableColumn("最高");
        TableColumn lowestColumn = new TableColumn("最低");

        tableView.setEditable(false);

        tableView.getColumns().addAll(codeColumn,nameColumn,todayOpeningColumn,amplitudeColumn,highestColumn,lowestColumn);

        ObservableList<Stock> data = FXCollections.observableArrayList();

        codeColumn.setCellFactory(new PropertyValueFactory<>("code"));
        nameColumn.setCellFactory(new PropertyValueFactory<>("name"));
        todayOpeningColumn.setCellFactory(new PropertyValueFactory<>("todayOpening"));
        amplitudeColumn.setCellFactory(new PropertyValueFactory<>("amplitude"));
        highestColumn.setCellFactory(new PropertyValueFactory<>("highest"));
        lowestColumn.setCellFactory(new PropertyValueFactory<>("lowest"));

        int i = 1;
        while(i< messages.length){
            data.add(new Stock(messages[i++], messages[i++],messages[i++],messages[i++],messages[i++],messages[i++],messages[i++]));
        }

        tableView.setItems(data);
    }
}
