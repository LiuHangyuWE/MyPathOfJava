public class Main {
    public static void main(String[] args) {
        Hasaki h = new Hasaki("Haisaa", 15);
        System.out.println("HasakiName:" + h.name + " Age:" + h.age + " Species:" + h.species);
        h.eat();
        h.drink();
        h.breakHome();

        Rural r = new Rural();
        r.lookHome();
        r.eat();
    }
}