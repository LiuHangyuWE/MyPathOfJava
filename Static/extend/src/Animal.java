public class Animal {
    String name;
    int age;
    String species;

    public void eat() {
        System.out.println("狗狗在吃剩饭");
    }

    public void drink() {
        System.out.println("狗狗在喝圣水");
    }

    public void lookHome() {
        System.out.println("狗狗在看家");
    }

    public Animal() {
        //初始化时指定某一变量
        //this访问本类构造方法
        this(null, 0, "dog");
    }

    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }
}
