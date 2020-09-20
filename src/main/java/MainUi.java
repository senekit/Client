import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

/**
 * program: Client
 * description: 用户主界面
 * author: yps
 * create: 2020-09-17 09:38
 **/
public class MainUi extends Application {
    User user;
    MainUi() throws IOException {}
    MainUi(User user) throws IOException {
        this.user=user;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ClientSocket socket = new ClientSocket("127.0.0.1",8888);
        socket.send(new String("F/"+user.getEmail()));
        String[] message = socket.accept().split("/");
        System.out.println(message[0]+message[1]);
        user.setFamilyId(message[0]);
        user.setName(message[1]);

        Pane pane = new Pane();

        TabPane mainTabPane = new TabPane();
        Tab bookingTab = new Tab("记账本");
        Tab financialAnalysisTab = new Tab("财务分析");
        Tab dataVisualizationTab = new Tab("数据可视化");
        Tab incomeofFamilyMembers = new Tab("家庭成员收支情况");
        Tab financialProjectTab = new Tab("理财项目");
        Tab userInformationTab = new Tab("我的信息");
        Button closeButton = new Button("X");
        bookingTab.setClosable(false);
        financialAnalysisTab.setClosable(false);
        incomeofFamilyMembers.setClosable(false);
        financialProjectTab.setClosable(false);
        userInformationTab.setClosable(false);
        dataVisualizationTab.setClosable(false);
        mainTabPane.getTabs().addAll(bookingTab,financialAnalysisTab,dataVisualizationTab,incomeofFamilyMembers,financialProjectTab,userInformationTab);

        pane.getChildren().add(mainTabPane);

//实现页面拖动
        AtomicReference<Double> xOffSet = new AtomicReference<>((double) 0);
        AtomicReference<Double> yOffSet = new AtomicReference<>((double) 0);
        pane.setOnMousePressed(event -> {
            xOffSet.set(event.getSceneX());
            yOffSet.set(event.getSceneY());
        });

        pane.setOnMouseDragged(event -> {
            primaryStage.setX(event.getScreenX() - xOffSet.get());
            primaryStage.setY(event.getScreenY() - yOffSet.get());
        });

//最小化按钮
        closeButton.setLayoutX(260);
        closeButton.setLayoutY(15);
        closeButton.setPrefWidth(30);
        closeButton.setPrefHeight(20);
        closeButton.setStyle("-fx-background-color: #dfebff;" +
                "-fx-border-radius: 5px; -fx-font-size: 9pt ; -fx-font-family: STHeiti");
        closeButton.setOnMouseEntered(e->{
            closeButton.setStyle("-fx-text-fill: white; -fx-background-color: rgb(218, 95, 71)");
        });
        closeButton.setOnMouseExited(e->{
            closeButton.setStyle("-fx-background-color: #dfebff; -fx-border-radius: 5px; -fx-font-size: 9pt ;" +
                    " -fx-font-family: STHeiti");
        });
        closeButton.setOnMousePressed(e->{
            closeButton.setStyle("-fx-text-fill: white; -fx-background-color: rgb(218, 95, 71)");
        });
        closeButton.setOnMouseReleased(e->{
            closeButton.setStyle("-fx-background-color: #dfebff; -fx-border-radius: 5px; -fx-font-size: 9pt ;" +
                    " -fx-font-family: STHeiti");
        });

        //主界面选项卡

        BookingUi bookingUi = new BookingUi();
        bookingUi.init(user);
        bookingTab.setContent(bookingUi.bookingPane);
        //记账本选项卡

        FinancialProjectUi financialProjectUi = new FinancialProjectUi();
        financialProjectUi.init(user);
        financialProjectTab.setContent(financialProjectUi.financialProjectTabPane);
        //理财项目选项卡

        UserInformationUi userInformationUi = new UserInformationUi();
        userInformationUi.init(user,primaryStage);
        userInformationTab.setContent(userInformationUi.userInformationPane);
        //用户信息选项卡

        FinancialAnalysisUi financialAnalysisUi = new FinancialAnalysisUi();
        financialAnalysisTab.setOnSelectionChanged(e->{
            try {
                financialAnalysisUi.init(user);
                financialAnalysisTab.setContent(financialAnalysisUi.financialAnalysisPane);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });
        //财务分析选项卡

        DataVisualizationUi dataVisualizationUi = new DataVisualizationUi();
        dataVisualizationUi.init(user);
        dataVisualizationTab.setContent(dataVisualizationUi.dataVisualizationPane);
        //数据可视化选项卡

        FamilyMemberUi familyMemberUi = new FamilyMemberUi();
        incomeofFamilyMembers.setOnSelectionChanged(e->{
            try {
                familyMemberUi.init(user);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            incomeofFamilyMembers.setContent(familyMemberUi.familyMemberPane);
        });

        //家庭成员选项卡

        primaryStage.setTitle("家庭金融管理系统");
        primaryStage.setScene(new Scene(pane,375,530));
        //primaryStage.setScene(new Scene(mainTabPane,375,500));
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.show();
        //Stage设置
    }
}
