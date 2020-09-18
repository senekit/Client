import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

/**
 * @program: Client
 * @description: 财务分析Ui
 * @author: Wry is a vegetable guy
 * @create: 2020-09-18 10:41
 **/
public class FinancialAnalysisUi {

    private final TableView table = new TableView();
    Pane financialAnalysisPane;
    public void init(User user) {
        financialAnalysisPane = new Pane();

        final Label label = new Label("收支记录");
        label.setFont(new Font("Arial", 20));

        table.setEditable(true);

        TableColumn itemColumn = new TableColumn("收支项目");
        TableColumn moneyColumn = new TableColumn("金额");
        TableColumn dataColumn = new TableColumn("日期");

        table.getColumns().addAll(itemColumn, moneyColumn, dataColumn);

        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, table);

        financialAnalysisPane.getChildren().add(vbox);
    }
}
