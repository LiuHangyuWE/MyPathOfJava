public class Buyer extends AdminStaff {
    public Buyer() {
    }

    public Buyer(String id, String name, String job) {
        super(id, name, job);
    }

    @Override
    public void work() {
        System.out.println("采购员" + getName() + "在运货");
    }
}
