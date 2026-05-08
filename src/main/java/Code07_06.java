class Rabbit {
    public   String shape;
    public int xPos;
    public int yPos;

    //String shape;
    //int xPos;
    //int yPos;

    Rabbit() {
        shape = "토끼";
    }

    Rabbit(String value) {
        shape = value;
    }

    void setPosition(int x, int y) {
        xPos = x;
        yPos = y;
    }
}

public class Code07_06 {
    public static void main(String[] args) {

        Rabbit rabbit1 = new Rabbit("원");
        Rabbit rabbit2 = new Rabbit("삼각형");
        Rabbit rabbit3 = new Rabbit("토끼");
        Rabbit rabbit = new Rabbit();

        rabbit1.shape = "원";
        rabbit2.shape = "삼각형";
        rabbit3.shape = "토끼";

        rabbit1.setPosition(100, 100);
        rabbit2.setPosition(-100, 100);
        rabbit3.setPosition(0, -100);

        Rabbit rabbit4 = new Rabbit("원");
        Rabbit rabbit5 = new Rabbit("삼각형");
        Rabbit rabbit6 = new Rabbit("토끼");

        System.out.printf("토끼 1 객체의 모양은 [%s]입니다\n", rabbit4.shape);
        System.out.printf("토끼 2 객체의 모양은 [%s]입니다\n", rabbit5.shape);
        System.out.printf("토끼 3 객체의 모양은 [%s]입니다\n", rabbit6.shape);

        System.out.printf("토끼 객체의 기본 모양은 [%s]입니다.", rabbit.shape);

        rabbit.setPosition(100,200);
    }
}
