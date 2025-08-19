public class Tutor extends Teacher {

    public Tutor() {
    }

    public Tutor(String id, String name, String job) {
        super(id, name, job);
    }

    @Override
    public void work() {
        System.out.println("辅导员" + getName() + "正在辅导学生");
    }
}
