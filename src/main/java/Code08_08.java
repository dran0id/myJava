abstract class Rabbit14 {
    int xPos;
    int yPos;
    void move (int x,int y){
        this.xPos = x;
        this.yPos = y;
    }
    abstract  void sleep();
}
class HouseRabbit14 extends Rabbit14{
    void sleep(){
        System.out.println("집 토끼가 우리에서 잠자고 있습니다.");
    }
}

class MountainRabbit14 extends  Rabbit14{
    @Override
    void sleep() {
        System.out.println("산토끼가 굴속에서 잠자고 있습니다.");
    }
}
public class Code08_08 {
    public static void main(String[] args) {
        HouseRabbit14 hRabbit14 = new HouseRabbit14();
        MountainRabbit14 mRabbit14 = new MountainRabbit14();

        hRabbit14.sleep();
        mRabbit14.sleep();
    }
}
