import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

/**
 * program: Client
 * description: 用户主界面
 * author: yps
 * create: 2020-09-17 09:38
 **/
public class MainUi extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        TabPane mainTabPane = new TabPane();
        Tab bookingTab = new Tab("记账本");           //选项卡界面
        Tab myExpandandMyIncomeTab = new Tab("我的收入支出");
        Tab financialAnalysisTab = new Tab("财务分析");
        Tab financialStatementTab = new Tab("财务报表");
        Tab incomeofFamilyMembers = new Tab("家庭成员收支情况");
        Tab financialProjectTab = new Tab("理财项目");
        Tab userInformationTab = new Tab("我的信息");
        bookingTab.setClosable(false);
        myExpandandMyIncomeTab.setClosable(false);
        financialAnalysisTab.setClosable(false);
        financialStatementTab.setClosable(false);
        incomeofFamilyMembers.setClosable(false);
        financialProjectTab.setClosable(false);
        userInformationTab.setClosable(false);
        mainTabPane.getTabs().addAll(bookingTab,myExpandandMyIncomeTab,financialAnalysisTab,financialStatementTab,incomeofFamilyMembers,financialProjectTab,userInformationTab);

        MyExpandAndMyIncomeUi myExpandAndMyIncomeUi = new MyExpandAndMyIncomeUi();
        myExpandAndMyIncomeUi.init();
        myExpandandMyIncomeTab.setContent(myExpandAndMyIncomeUi.myExpandandMyIncomePane);

        FinancialProjectUi financialProjectUi = new FinancialProjectUi();
        financialProjectUi.init();
        financialProjectTab.setContent(financialProjectUi.financialProjectTabPane);

        primaryStage.setScene(new Scene(mainTabPane,800,600));
        primaryStage.show();
    }





}
