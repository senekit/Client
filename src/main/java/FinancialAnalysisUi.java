import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.util.Callback;
import javafx.util.StringConverter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: Client
 * @description: 财务分析Ui
 * @author: Wry is a vegetable guy
 * @create: 2020-09-18 10:41
 **/
public class FinancialAnalysisUi {

    private final TableView<User> table = new TableView<>();
    TableColumn itemColumn = new TableColumn("收支项目");
    TableColumn moneyColumn = new TableColumn("金额");
    TableColumn dateColumn = new TableColumn("日期");
    TableColumn<User,Boolean> deleteColumn = new TableColumn("删除");
    int tag = 0;
    Pane financialAnalysisPane;


    public void init() throws IOException {
        financialAnalysisPane = new Pane();

        table.setEditable(false);
        itemColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        moneyColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        dateColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        deleteColumn.setCellFactory(CheckBoxTableCell.forTableColumn(deleteColumn));

        if(tag == 0){
            table.getColumns().addAll(itemColumn, moneyColumn, dateColumn,deleteColumn);
            table.setPrefWidth(350);
            table.setPrefHeight(410);  //表格大小
            tag++;
        }

        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(table);

        vbox.setLayoutX(30);
        vbox.setLayoutY(10);

        financialAnalysisPane.getChildren().add(vbox);

        ClientSocket socket = new ClientSocket("127.0.0.1",8888);
        String send = "I/"+MainUi.user.getEmail();
        socket.send(send);
        String[] message=socket.accept().split("/");
        socket.close();

        ObservableList<User> data = FXCollections.observableArrayList();
        int i = 1;
        while(i< message.length){
            data.add(new User(message[i++], message[i++],message[i++],false));
        }
        itemColumn.setCellValueFactory(new PropertyValueFactory<>("item"));
        moneyColumn.setCellValueFactory(new PropertyValueFactory<>("money"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));

        table.setItems(data);

        Button reviseButton = new Button("修改");
        Button deleteButton = new Button("删除");
        financialAnalysisPane.getChildren().addAll(reviseButton,deleteButton);

        reviseButton.setPrefWidth(100);
        reviseButton.setPrefHeight(40);
        reviseButton.setLayoutX(90);
        reviseButton.setLayoutY(440);

        reviseButton .setStyle(
                "-fx-background-color: #f9fbff;\n" +
                        "-fx-background-radius: 5;\n" +
                        "-fx-border-radius: 5;" +
                        "-fx-font-size:16px;");
        reviseButton.setOnMouseEntered(
                e->{
                    reviseButton.setStyle("-fx-background-color: #e2e3e7;\n" +
                            "-fx-background-radius: 5;\n" +
                            "-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        reviseButton.setOnMouseExited(
                e->{
                    reviseButton.setStyle("-fx-background-color: #f9fbff;\n" +
                            "-fx-background-radius: 5;\n" +
                            "-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        reviseButton.setOnMousePressed(
                e->{
                    reviseButton.setStyle("-fx-background-color: #b5b6ba;\n" +
                            "-fx-background-radius: 5;\n" +
                            "-fx-border-radius: 5;"+
                            "-fx-font-size:16px;");
                });
        reviseButton.setOnMouseReleased(
                e->{
                    reviseButton.setStyle(
                            "-fx-background-color: #f9fbff;\n" +
                                    "-fx-background-radius: 5;\n" +
                                    "-fx-border-radius: 5;"+
                                    "-fx-font-size:16px;");
                });

        deleteButton.setPrefHeight(40);
        deleteButton.setPrefWidth(100);
        deleteButton.setLayoutX(240);
        deleteButton.setLayoutY(440);

        deleteButton .setStyle(
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

        itemColumn.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<User,String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<User,String> event) {
                event.getTableView().getItems().get(event.getTablePosition().getRow()).setItem(event.getNewValue());
                String message="T/"+MainUi.user.getEmail()+"/"
                        +event.getTableView().getItems().get(event.getTablePosition().getRow()).getItem()+"/"
                        +event.getTableView().getItems().get(event.getTablePosition().getRow()).getMoney()+"/"
                        +event.getTableView().getItems().get(event.getTablePosition().getRow()).getDate();
                try {
                    ClientSocket socket1 = new ClientSocket("127.0.0.1",8888);
                    socket1.send(message);
                    socket1.accept();
                    socket1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
        moneyColumn.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<User,String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<User,String> event) {
                event.getTableView().getItems().get(event.getTablePosition().getRow()).setMoney(event.getNewValue());
                String message="O/"+MainUi.user.getEmail()+"/"
                        +event.getTableView().getItems().get(event.getTablePosition().getRow()).getItem()+"/"
                        +event.getTableView().getItems().get(event.getTablePosition().getRow()).getMoney()+"/"
                        +event.getTableView().getItems().get(event.getTablePosition().getRow()).getDate();
                try {
                    ClientSocket socket1 = new ClientSocket("127.0.0.1",8888);
                    socket1.send(message);
                    socket1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
        dateColumn.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<User,String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<User,String> event) {
                event.getTableView().getItems().get(event.getTablePosition().getRow()).setDate(event.getNewValue());
                String message="D/"+MainUi.user.getEmail()+"/"
                        +event.getTableView().getItems().get(event.getTablePosition().getRow()).getItem()+"/"
                        +event.getTableView().getItems().get(event.getTablePosition().getRow()).getMoney()+"/"
                        +event.getTableView().getItems().get(event.getTablePosition().getRow()).getDate();
                try {
                    ClientSocket socket1 = new ClientSocket("127.0.0.1",8888);
                    socket1.send(message);
                    socket1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        deleteColumn.setCellFactory(
                CellFactory.tableCheckBoxColumn(new Callback<Integer, ObservableValue<Boolean>>() {
                    @Override
                    public ObservableValue<Boolean> call(Integer index) {
                        final User user1 = (User) table.getItems().get(index);
                        ObservableValue<Boolean> ret =
                                new SimpleBooleanProperty(user1, "check", user1.isCheck());
                        ret.addListener(new ChangeListener<Boolean>() {
                            @Override
                            public void changed(
                                    ObservableValue<? extends Boolean> observable,
                                    Boolean oldValue, Boolean newValue) {
                                user1.setCheck(newValue);
                            }
                        });
                        return ret;
                    }
                }));

        deleteButton.setOnAction(e->{
            int size = data.size();
            if (size <= 0) {
                return ;
            }
            for (int i1= size - 1; i1 >= 0; i1--) {
                User s = data.get(i1);
                if (s.isCheck()) {
                    try {
                        ClientSocket clientSocket = new ClientSocket("127.0.0.1",8888);
                        clientSocket.send(new String("E/"+MainUi.user.getEmail()+"/"+data.get(i1).getItem()+"/"+data.get(i1).getMoney())+"/"+data.get(i1).getDate());
                        socket.close();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                    data.remove(s);
                }
            }

        });

        reviseButton.setOnAction(e->{
            if(table.isEditable()){
                table.setEditable(false);
            }
            else table.setEditable(true);
        });
    }
}
class CellFactory{
    public static <S, T> Callback<TableColumn<S, T>, TableCell<S, T>> tableCheckBoxColumn(
            Callback<Integer, ObservableValue<Boolean>> paramCallback) {
        return tableCheckBoxColumn(paramCallback, null);
    }

    public static <S, T> Callback<TableColumn<S, T>, TableCell<S, T>> tableCheckBoxColumn(
            final Callback<Integer, ObservableValue<Boolean>> getSelectedProperty,
            final StringConverter<T> converter) {
        return new Callback<TableColumn<S, T>, TableCell<S, T>>() {
            @Override
            public TableCell<S, T> call(TableColumn<S, T> paramTableColumn) {
                return new CheckBoxTableCell<S, T>(getSelectedProperty, converter);
            }
        };
    }
}
