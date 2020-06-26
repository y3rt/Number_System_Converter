import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String ticketNumber = s.nextLine();
        int x1 = 0;
        int x2 = 0;

        for (int i = 0; i < ticketNumber.length(); i++) {
            var x11 = Integer.parseInt(String.valueOf(ticketNumber.charAt(i)));
            if (i < 3) {
                x1 += x11;
            } else {
                x2 += x11;
            }
        }
        if (x1 == x2) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }
    }
}
