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

    public User(String email,String password) {
        this.email = email;
        this.password = password;
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
