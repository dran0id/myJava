public class Cwd09_01 {
    public static void main(String[] args) {
        char[] sta= new char[5];
        int top=0;


        sta[top]= 'a';
        System.out.printf("%c 자동차가 터널에 들어감\n",sta[top]);
        top++;

        sta[top]= 'b';
        System.out.printf("%c 자동차가 터널에 들어감\n",sta[top]);
        top++;

        sta[top]= 'c';
        System.out.printf("%c 자동차가 터널에 들어감",sta[top]);
        top++;

        System.out.println();

        top--;
        System.out.printf("%c 자동차가 터널에서 빠져나감\n", sta[top]);
        sta[top] = ' ';

        top--;
        System.out.printf("%c 자동차가 터널에서 빠져나감\n", sta[top]);
        sta[top] = ' ';

        top--;
        System.out.printf("%c 자동차가 터널에서 빠져나감", sta[top]);
        sta[top] = ' ';
    }
}
