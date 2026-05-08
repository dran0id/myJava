class Rabbit11 {
    String shape;
    int xPos;
    int yPos;

    void move(int x, int y){
        this.xPos = x;
        this.yPos = y;
        System.out.println("부모 클래스 코드 수정");
    }
}
class HouseRabbit11 extends Rabbit11 {
    String owner;
    void eatFeed() {
        System.out.println("집토끼가 사료를 먹습니다.");
    }
}
class MountainRabbit11 extends Rabbit11{
    String mountain;
    void eatWildglass(){
        System.out.println("산토끼가 풀을 먹습니다.");
    }
}

public class Code08_02 {
    public static void main(String[] args) {
        HouseRabbit11 hRabbit11 = new HouseRabbit11();
        MountainRabbit11 mRabbit11 = new MountainRabbit11();

        hRabbit11.shape= "삼각형";
        hRabbit11.owner = "난쟁이";
        hRabbit11.move(100,100);
        hRabbit11.eatFeed();

        mRabbit11.shape="네모";
        mRabbit11.mountain="설악산";
        mRabbit11.move(200,200);
        mRabbit11.eatWildglass();
    }
}
