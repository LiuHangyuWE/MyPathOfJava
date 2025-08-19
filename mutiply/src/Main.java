public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(2, "狸花");
        Dog dog = new Dog(5, "纯色");
        Person person = new Person(20, "Ray");

        person.keepPet(cat);
        person.keepPet(dog);
    }
}