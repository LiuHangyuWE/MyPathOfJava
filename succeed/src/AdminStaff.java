public class AdminStaff extends Employee {
    public AdminStaff() {
    }

    public AdminStaff(String id, String name, String job) {
        super(id, name, job);
    }

    @Override
    public void work() {
        System.out.println("管理层" + getName() +"在管理，但不知道具体管理内容");
    }
}
