import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int n = s.nextInt();
        if (n < str.length()) {
            String newStr = str.substring(n) + str.substring(0, n);
            System.out.println(newStr);
        } else {
            System.out.println(str);
        }
    }
}
