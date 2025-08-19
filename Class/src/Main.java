public class Main {
    public static void main(String[] args) {
        //用GirlFriend类new一个对象
        GirlFriend boy = new GirlFriend();
        UsingPtg ptgPowerMan = new UsingPtg(18, true, "mySelf");
        //调用对象的成员void方法
        boy.setAge(18);
        boy.setName("lover");
        //调用对象的成员变量
        boy.setSleep(true);
        //测试
        System.out.println(boy.isSleep());
        System.out.println(boy.getAge());
        System.out.println(boy.getName());
        System.out.println(ptgPowerMan.isGender());
    }
}