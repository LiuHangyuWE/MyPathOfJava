package clone;

import java.util.StringJoiner;

//cloneable接口表示可被克隆
public class User implements Cloneable{
    private int id;
    private String username;
    private String password;
    private String path;
    private int[] data;


    public User() {
    }

    public User(int id, String username, String password, String path, int[] data) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.path = path;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public String toString() {
        //注意这里，data是地址，arrToString才是内容
        return "User{id = " + id + ", username = " + username + ", password = " + password + ", path = " + path + ", data = " + data + ", 进度： " + arrToString() + "}";
    }

    public String arrToString() {
        StringJoiner sj = new StringJoiner("," , "[", "]");
        for (int i = 0; i < data.length; i++) {
            sj.add(data[i] + ""); // 加上""会强制转换为字符串型
        }

        return sj.toString();
    }

    //关键，重写clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
