import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

/**
 * @program: Client
 * @description: 用户主界面
 * @author: yps
 * @create: 2020-09-17 09:38
 **/
public class MainUi extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        TabPane mainTabPane = new TabPane();
        Tab myIncomeTab = new Tab("我的收入");           //选项卡界面
        Tab myExpandTab = new Tab("我的支出");
        Tab financialAnalysisTab = new Tab("财务分析");
        Tab financialStatementTab = new Tab("财务报表");
        Tab incomeofFamilyMembers = new Tab("家庭成员收支情况");
        Tab financialProjectTab = new Tab("理财项目");
        Tab userInformationTab = new Tab("我的信息");
        myIncomeTab.setClosable(false);
        myExpandTab.setClosable(false);
        financialAnalysisTab.setClosable(false);
        financialStatementTab.setClosable(false);
        incomeofFamilyMembers.setClosable(false);
        financialProjectTab.setClosable(false);
        userInformationTab.setClosable(false);
        mainTabPane.getTabs().addAll(myExpandTab,myIncomeTab,financialAnalysisTab,financialStatementTab,incomeofFamilyMembers,financialProjectTab,userInformationTab);

        TabPane financialProjectTabPane = new TabPane();
        Tab onGoingProjectTab = new Tab("正在进行的项目");
        Tab projectRiskTab = new Tab("项目风险");
        Tab prospectiveYieldTab = new Tab("预计收益");
        onGoingProjectTab.setClosable(false);
        projectRiskTab.setClosable(false);
        prospectiveYieldTab.setClosable(false);
        financialProjectTabPane.getTabs().addAll(onGoingProjectTab,projectRiskTab,prospectiveYieldTab);

        financialProjectTab.setContent(financialProjectTabPane);

        primaryStage.setScene(new Scene(mainTabPane,800,600));
        primaryStage.show();
    }





}
