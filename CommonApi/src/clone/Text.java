package clone;

public class Text {
    public static void main(String[] args) throws CloneNotSupportedException {
        //对象克隆

        int[] data = {1,2,3,4,5,6,7,8,9,10};
        User u1 = new User(1, "boss", "qwer", "girl111", data);

        Object u2 = (User)u1.clone();

        System.out.println(u1);
        System.out.println(u2);

        //验证浅克隆
        int[] arr = u1.getData();
        arr[0] = 100;

        System.out.println(u1);
        System.out.println(u2);

        //深克隆依靠外部工具类
    }
}
