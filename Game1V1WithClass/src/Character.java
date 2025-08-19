import java.util.Random;

public class Character {
    private String name;
    private int blood;
    private String face;
    private String move;

    String[] faces = {"貌美如花", "恶如心的", "很敷衍的",
            "那艺娜的", "贝如塔的"};
    String[] moves = {"冷暴力", "说坏话", "PUA", "若无其事",
            "谎话连篇"};

    public Character() {
    }

    public Character(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public void setMove() {
        Random r = new Random();
        int index = r.nextInt(moves.length);
        move = moves[index];
    }

    public String getMove() {
        return move;
    }

    public void setFace() {
        Random r = new Random();
        int index = r.nextInt(faces.length);
        face = faces[index];
    }

    public String getFace() {
        return face;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getBlood() {
        return blood;
    }


    public void setBlood(int blood) {
        this.blood = blood;
    }

    public void attack(Character character) {
        //随机造成的伤害
        Random r = new Random();
        int hurt = r.nextInt(3000) + 1;

        setFace();
        character.setFace();
        setMove();
        character.setMove();

        System.out.print(this.face + " " + this.name +
                " 用 " + this.move + " 技能攻击 " +
                character.getFace() + character.getName() +
                " 了 " + hurt + " 点伤害，" + character.getName() +
                " 还剩下 ");

        int remainBlood = character.getBlood() - hurt;
        if(remainBlood < 0) {
            remainBlood = 0;
        }

        if(remainBlood == 0) {
            System.out.println(" 0 点血量");
        } else {
            System.out.println(remainBlood + " 点血量");
        }

        character.setBlood(remainBlood);
    }
}