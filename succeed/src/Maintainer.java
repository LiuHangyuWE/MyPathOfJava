public class Maintainer extends AdminStaff {
    public Maintainer() {
    }

    public Maintainer(String id, String name, String job) {
        super(id, name, job);
    }

    @Override
    public void work() {
        System.out.println("维护专员" + getName() + "在保安中...像是摸鱼...");
    }
}
