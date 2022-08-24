import java.util.Scanner;

public class Java_LoopsII {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int x = 1;
            int r = a;
            for (int j = 0; j < n; j++) {
                r = r + x * b;
                System.out.print(r);
                x = x << 1;
                System.out.print(' ');
            }
            System.out.println();
        }
        in.close();
    }
}
