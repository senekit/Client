import javafx.beans.property.SimpleStringProperty;

/**
 * @ClassName Stock
 * @Description TODO
 * @Author AIERXUAN
 * @Date 2020/9/2111:09
 */
public class Stock {
    private SimpleStringProperty code;
    private SimpleStringProperty name;
    private SimpleStringProperty todayOpeningPrice;
    private SimpleStringProperty todayTurnover;
    private SimpleStringProperty amplitude;
    private SimpleStringProperty highest;
    private SimpleStringProperty lowest;

    Stock(String code,String name,String todayOpeningPrice,String todayTurnover,String amplitude,String highest,String lowest){
        this.code=new SimpleStringProperty(code);
        this.todayOpeningPrice=new SimpleStringProperty(todayOpeningPrice);
        this.name=new SimpleStringProperty(name);
        this.todayTurnover=new SimpleStringProperty(todayTurnover);
        this.amplitude=new SimpleStringProperty(amplitude);
        this.highest=new SimpleStringProperty(highest);
        this.lowest=new SimpleStringProperty(lowest);
    }

    public String getCode() {
        return code.get();
    }

    public SimpleStringProperty codeProperty() {
        return code;
    }

    public void setCode(String code) {
        this.code.set(code);
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getTodayOpeningPrice() {
        return todayOpeningPrice.get();
    }

    public SimpleStringProperty todayOpeningPriceProperty() {
        return todayOpeningPrice;
    }

    public void setTodayOpeningPrice(String todayOpeningPrice) {
        this.todayOpeningPrice.set(todayOpeningPrice);
    }

    public String getTodayTurnover() {
        return todayTurnover.get();
    }

    public SimpleStringProperty todayTurnoverProperty() {
        return todayTurnover;
    }

    public void setTodayTurnover(String todayTurnover) {
        this.todayTurnover.set(todayTurnover);
    }

    public String getAmplitude() {
        return amplitude.get();
    }

    public SimpleStringProperty amplitudeProperty() {
        return amplitude;
    }

    public void setAmplitude(String amplitude) {
        this.amplitude.set(amplitude);
    }

    public String getHighest() {
        return highest.get();
    }

    public SimpleStringProperty highestProperty() {
        return highest;
    }

    public void setHighest(String highest) {
        this.highest.set(highest);
    }

    public String getLowest() {
        return lowest.get();
    }

    public SimpleStringProperty lowestProperty() {
        return lowest;
    }

    public void setLowest(String lowest) {
        this.lowest.set(lowest);
    }
}
