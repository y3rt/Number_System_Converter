import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.nextLine();
        int vCount = 0;
        int cCount = 0;
        int xCount = 0;

        for (int i = 0; i < word.length(); i++) {
            switch (word.toLowerCase().charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'y':
//                    System.out.print("v: ");
                    cCount = 0;
                    vCount++;
                    break;
                default:
//                    System.out.print("c: ");
                    cCount++;
                    vCount = 0;
                    break;
            }
//            System.out.print(word.toLowerCase().charAt(i));
            if (vCount > 2) {
//                System.out.print("!");
                xCount++;
                vCount = 1;
                cCount = 0;
            }
            if (cCount > 2) {
//                System.out.print("!");
                xCount++;
                vCount = 0;
                cCount = 1;
            }
            System.out.println();
        }
        System.out.println(xCount);
    }
}
