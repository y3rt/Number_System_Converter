import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        int x = 0;

        while (true) {
            x = (int) Math.pow(i, 2);
            if (x > n) {
                break;
            }
            System.out.println(x);
            i++;
        }
    }
}
