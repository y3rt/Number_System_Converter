import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        boolean cont = true;
        while(cont){
            String n = s.nextLine();
            if (!"0".equals(n)) {
                al.add(n);
            } else {
                cont = false;
            }
        }

        for (String item : al) {
            try {
                System.out.println(Integer.parseInt(item) * 10);
            } catch (Exception e) {
                System.out.println("Invalid user input: " + item);
            }
        }
    }
}
