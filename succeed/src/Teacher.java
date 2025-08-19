public class Teacher extends Employee {
    public Teacher() {
    }

    public Teacher(String id, String name, String job) {
        super(id, name, job);
    }

    @Override
    public void work() {
        System.out.println("老师" + getName() +"在工作，但不知道具体工作内容");
    }
}
