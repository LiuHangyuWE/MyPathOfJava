public class Person {
    private int age;
    private String name;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void keepPet(Animal animal) {
        if (animal instanceof Dog dog) {
            System.out.println(getAge() + "岁的" + getName() + "正在养" + animal.getColor() + "的" + animal.getAge() + "岁的狗");
            dog.lookHome();
        } else if (animal instanceof Cat cat){
            System.out.println(getAge() + "岁的" + getName() + "正在养" + animal.getColor() + "的" + animal.getAge() + "的猫");
            cat.catchMouse();
        }
    }
}
