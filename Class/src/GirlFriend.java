public class GirlFriend {
    //预定义的对象的属性作成员变量
    //private是一个权限修饰符
    private int age;
    private boolean isSleep;
    boolean isEat;
    boolean isStudy;
    private String name;

    //定义有参构造后，系统不再提供默认构造方法
    //约定：无论是否使用，都写上空参和带全部参数的构造方法
    //快捷键Mac:cmd+N
    public GirlFriend () {
    }
    //构造方法的作用：为成员变量初始化
    public GirlFriend(int age, String name) {
        this.age = age;
        this.name = name;
    }
    //对象的行为作成员方法
    public void setAge (int age) {
        if(age >= 18 && age < 30) {
            //this关键字找到方法外但类内的同名变量，否则就近原则匹配
            this.age = age;
        } else {
            System.out.println("非法数据！");
        }
    }
    public int getAge() {
        return age;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public boolean isSleep() {
        return isSleep;
    }

    public void setSleep(boolean sleep) {
        isSleep = sleep;
    }

    public boolean isEat() {
        return isEat;
    }

    public void setEat(boolean eat) {
        isEat = eat;
    }

    public boolean isStudy() {
        return isStudy;
    }

    public void setStudy(boolean study) {
        isStudy = study;
    }
}
