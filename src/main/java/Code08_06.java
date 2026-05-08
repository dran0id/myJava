class Rabbit13{
    int xPos;
    int yPos;
    void move(int x, int y){
        this.xPos = x;
        this.yPos = y;
    }
}
class HouseRabbit13 extends Rabbit{
    void move(int x,int y){
        this.xPos = x;
        this.yPos = y;

        if (this.xPos > 100)
            this.xPos = 100;
        if (this.yPos > 100)
            this.yPos = 100;
    }
}
class MountainRabbit13 extends Rabbit13{

}

public class Code08_06 {
    public static void main(String[] args) {
        HouseRabbit13 hRabbit13 = new HouseRabbit13();
        MountainRabbit13 mRabbit13 = new MountainRabbit13();

        hRabbit13.move(500,500);
        mRabbit13.move(500,500);
        System.out.printf("집토끼 위치: (%d,%d)\n",hRabbit13.xPos,hRabbit13.yPos);
        System.out.printf("산토끼 위치: (%d,%d)\n",mRabbit13.xPos,mRabbit13.yPos);
    }
}
