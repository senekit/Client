import javafx.beans.property.SimpleStringProperty;

/**
 * @program: Client
 * @description: 用户信息
 * @author: yps
 * @create: 2020-09-17 10:15
 **/
public class User {

    private String email;
    private String name;
    private String password;
    private String familyId;
    private SimpleStringProperty money;
    private SimpleStringProperty date;
    private SimpleStringProperty item;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public User(String item,String money,String date){
        this.item=new SimpleStringProperty(item);
        this.money=new SimpleStringProperty(money);
        this.date=new SimpleStringProperty(date);
    }

    public String getMoney() {
        return money.get();
    }

    public SimpleStringProperty moneyProperty() {
        return money;
    }

    public void setMoney(String money) {
        this.money.set(money);
    }

    public String getDate() {
        return date.get();
    }

    public SimpleStringProperty dateProperty() {
        return date;
    }

    public void setDate(String date) {
        this.date.set(date);
    }

    public String getItem() {
        return item.get();
    }

    public SimpleStringProperty itemProperty() {
        return item;
    }

    public void setItem(String item) {
        this.item.set(item);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFamilyId() {
        return familyId;
    }

    public void setFamilyId(String familyId) {
        this.familyId = familyId;
    }
}
