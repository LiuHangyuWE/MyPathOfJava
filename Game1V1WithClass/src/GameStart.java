public class GameStart {
    public static void main(String[] args) {
        Character c1 = new Character("新肥牛", 9000);
        Character c2 = new Character("老肥牛", 9000);

        while(true) {
            c1.attack(c2);
            if(c2.getBlood() == 0) {
                System.out.println("Game OVER!!! " + c1.getName() +
                        " K. O. " + c2.getName() + " 快哉快哉！！");
                break;
            }

            c2.attack(c1);
            if(c1.getBlood() == 0) {
                System.out.println("Game OVER!!! " + c2.getName() +
                        " K. O. " + c1.getName() + "慢哉慢哉？！");
                break;
            }
        }
    }

}
