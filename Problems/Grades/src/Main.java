import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int D = 0;
        int C = 0;
        int B = 0;
        int A = 0;
        for (int i = 0; i < n; i++) {
            int g = s.nextInt();
            switch (g){
                case 5:
                    A++;
                    break;
                case 4:
                    B++;
                    break;
                case 3:
                    C++;
                    break;
                case 2:
                    D++;
                    break;
            }
        }
        System.out.println(D + " " + C + " " + B + " " + A);

    }
}
