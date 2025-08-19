import java.util.ArrayList;

/*

public class Main {
    //ArrayList的增删改查
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //list.add返回值总为真
        list.add("I");
        list.add("love");
        list.addLast("you");
        //ArrayList直接输出会有[,,,]的格式
        System.out.println(list);

        //删元素返回布尔类型，删索引返回元素
        boolean isDelete = list.remove("love");

        //当心越界
        String deleteElem = list.remove(0);
        System.out.println(deleteElem);
        System.out.println(list);

        //改也返回原来的数据，同样当心越界
        String pos = list.set(0, "see you");
        System.out.println(list);

        //查长度：size方法；查元素：get方法
    }
}

 */

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();

        //每个学生必须重新new，否则共享地址，赋值过程变为覆盖过程
        Student s1 = new Student("Ice", 20);
        Student s2 = new Student("Diao", 25);
        Student s3 = new Student("Water", 22);
        Student s4 = new Student("Mountain", 23);

        al.add(s1);
        al.add(s2);
        al.add(0, s3);
        al.add(1, s4);

        for (int i = 0; i < al.size(); i++) {
            System.out.println("Name:" + al.get(i).getAge() + " ;Age:" + al.get(i).getName());
        }

        System.out.println(getLowStudent(al));
    }

    //返回多个数据时，用容器返回
    public static ArrayList<Student> getLowStudent(ArrayList<Student> list) {
        ArrayList<Student> al = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAge() <= 22) {
                al.add(list.get(i));
            }
        }

        return al;
    }

}