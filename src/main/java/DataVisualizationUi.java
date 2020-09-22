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
    XYChart.Series series1;
    XYChart.Series series;
    LineChart linechart;
    int tag=0;

    public void init() throws IOException {
        ClientSocket socket = new ClientSocket("127.0.0.1",8888);
        socket.send(new String("B/"+MainUi.user.getEmail()));
        String[] messages= socket.accept().trim().split("/");
        Calendar c = Calendar.getInstance();
        double day = c.get(Calendar.DATE);

        NumberAxis xAxis = new NumberAxis(day-7, day, 1);
        xAxis.setLabel("Day");

        NumberAxis yAxis = new NumberAxis(0, 1000, 200);
        yAxis.setLabel("Money");

        linechart = new LineChart(xAxis, yAxis);

        series = new XYChart.Series();
        series.setName("收入折线图");

        series.getData().add(new XYChart.Data(day-6, Double.parseDouble(messages[13])));
        series.getData().add(new XYChart.Data(day-5, Double.parseDouble(messages[11])));
        series.getData().add(new XYChart.Data(day-4, Double.parseDouble(messages[9])));
        series.getData().add(new XYChart.Data(day-3, Double.parseDouble(messages[7])));
        series.getData().add(new XYChart.Data(day-2, Double.parseDouble(messages[5])));
        series.getData().add(new XYChart.Data(day-1, Double.parseDouble(messages[3])));
        series.getData().add(new XYChart.Data(day, Double.parseDouble(messages[1])));

        series1 = new XYChart.Series();
        series1.setName("支出折线图");

        series1.getData().add(new XYChart.Data(day-6, Double.parseDouble(messages[14])));
        series1.getData().add(new XYChart.Data(day-5, Double.parseDouble(messages[12])));
        series1.getData().add(new XYChart.Data(day-4, Double.parseDouble(messages[10])));
        series1.getData().add(new XYChart.Data(day-3, Double.parseDouble(messages[8])));
        series1.getData().add(new XYChart.Data(day-2, Double.parseDouble(messages[6])));
        series1.getData().add(new XYChart.Data(day-1, Double.parseDouble(messages[4])));
        series1.getData().add(new XYChart.Data(day, Double.parseDouble(messages[2])));

        if(tag == 0){
            linechart.getData().add(series);
            linechart.getData().add(series1);

            dataVisualizationPane.getChildren().add(linechart);
        }

        linechart.setPrefHeight(400);
        linechart.setPrefWidth(400);
        socket.close();
    }
}
