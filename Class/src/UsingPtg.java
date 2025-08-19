public class UsingPtg {
    private int age;
    private boolean gender;
    private String name;
    //先定义成员变量，然后右键ptg自动生成JavaBean
    public UsingPtg() {
    }

    public UsingPtg(int age, boolean gender, String name) {
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return gender
     */
    public boolean isGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(boolean gender) {
        this.gender = gender;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "UsingPtg{age = " + age + ", gender = " + gender + ", name = " + name + "}";
    }
}
