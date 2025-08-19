public class Hasaki extends Animal {
    public void breakHome() {
        System.out.println("哈士奇拆家啦");
    }

    public Hasaki() {}

    public Hasaki(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Hasaki(String name, int age, String species) {
        //super直接调用父类的带参构造
        super(name, age, species);
    }
}
