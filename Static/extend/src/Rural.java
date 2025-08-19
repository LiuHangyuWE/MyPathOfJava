public class Rural extends Animal {
    //方法的重写，可以调用父类或者不调用
    @Override
    public void eat() {
        super.eat();
        System.out.println("狗狗在吃骨头");
    }
}
