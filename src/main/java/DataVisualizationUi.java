import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.util.Calendar;

/**
 * @program: Client
 * @description: 数据可视化Ui
 * @author: Wry is a vegetable guy
 * @create: 2020-09-19 10:46
 **/
public class DataVisualizationUi {
    Pane dataVisualizationPane = new Pane();

    public void init(User user) throws IOException {
        ClientSocket socket = new ClientSocket("127.0.0.1",8888);
        socket.send(new String(user.getEmail()));
        String[] messages= socket.accept().trim().split("/");
        Calendar c = Calendar.getInstance();
        double day = c.get(Calendar.DATE);

        NumberAxis xAxis = new NumberAxis(day-7, day, 1);
        xAxis.setLabel("Day");

        NumberAxis yAxis = new NumberAxis(0, 1000, 200);
        yAxis.setLabel("Money");

        LineChart linechart = new LineChart(xAxis, yAxis);

        XYChart.Series series = new XYChart.Series();
        series.setName("收入折线图");

        series.getData().add(new XYChart.Data(14, 15));
        series.getData().add(new XYChart.Data(15, 30));
        series.getData().add(new XYChart.Data(16, 60));
        series.getData().add(new XYChart.Data(17, 120));
        series.getData().add(new XYChart.Data(18, 240));
        series.getData().add(new XYChart.Data(19, 300));

        XYChart.Series series1 = new XYChart.Series();
        series.setName("支出折线图");

        series1.getData().add(new XYChart.Data(14, 20));
        series1.getData().add(new XYChart.Data(15, 30));
        series1.getData().add(new XYChart.Data(16, 60));
        series1.getData().add(new XYChart.Data(17, 120));
        series1.getData().add(new XYChart.Data(18, 240));
        series1.getData().add(new XYChart.Data(19, 300));

        linechart.getData().add(series);
        linechart.getData().add(series1);

        dataVisualizationPane.getChildren().add(linechart);
    }
}
