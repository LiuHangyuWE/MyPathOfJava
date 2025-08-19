public class Cat extends Animal {
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String sth) {
        System.out.println(getAge() + "岁的" + getColor() + "颜色的肥波偷偷吃" + sth);
    }

    public void catchMouse() {
        System.out.println("肥波抓老鼠，虽然没有老鼠...");
    }
}
