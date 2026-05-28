import java.util.ArrayList;
import java.util.List;

public class Exxx10_1 {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();

        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);

        int listSize = a.size();

        System.out.println("총 값: "+ listSize);

        for(Integer name : a){
            System.out.println("값:"+name);
        }
        a.forEach(name -> System.out.println("값:"+name));
    }
}
