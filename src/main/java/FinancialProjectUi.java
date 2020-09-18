import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

/**
 * @program: Client
 * @description: 理财项目Tab界面下ui
 * @author: yps
 * @create: 2020-09-17 10:35
 **/
public class FinancialProjectUi {
    public TabPane financialProjectTabPane;

    public void init(User user){
        this.financialProjectTabPane = new TabPane();
        Tab onGoingProjectTab = new Tab("正在进行的项目");
        Tab prospectiveYieldAndRiskTab = new Tab("预计收益和风险");
        onGoingProjectTab.setClosable(false);
        prospectiveYieldAndRiskTab.setClosable(false);
        this.financialProjectTabPane.getTabs().addAll(onGoingProjectTab,prospectiveYieldAndRiskTab);
    }
}
