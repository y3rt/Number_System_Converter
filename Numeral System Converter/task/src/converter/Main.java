package converter;

import java.nio.charset.MalformedInputException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            int r1 = s.nextInt();
            String n = s.next();
            int r2 = s.nextInt();
            String nString = "";
            String varInt = "";
            String varDec = "";

            if (r1 <= 0 || r2 <= 0 || r1 > 36 || r2 > 36) {
                throw new Exception();
            }

            //        System.out.println(n+" | "+r1+" | "+r2);
            int decLoc = n.indexOf(".");
            if (decLoc >= 0) {
                varInt = n.substring(0, decLoc);
                varDec = n.substring(decLoc);
            } else {
                varInt = n;
            }
        //        System.out.println(varInt+" | "+varDec);

            String intStr = convertBase(r1, varInt, r2);
            String decStr = "";
            String finalStr = "";
            if (varDec != "") {
                decStr = convertDec(r2, varDec, r1);
                finalStr = intStr + "." + decStr;
            } else {
                finalStr = intStr;
            }

            System.out.println(finalStr);
        } catch(Exception e) {
            System.out.println("error");
        }
    }
    public static String convertDec(int r2, String varDec, int r1){
        double wrkN = 0;
        String decStr = "";
        if (r1 != 10) {
            double runN = 0;
            for (int i = 1; i < varDec.length(); i++) {
//                System.out.println(varDec.charAt(i)+": "+Character.getNumericValue(varDec.charAt(i)));
                runN += Character.getNumericValue(varDec.charAt(i)) / Math.pow(r1, i);
            }
            wrkN = runN;
        } else {
            wrkN = Double.parseDouble(varDec);
        }
//        System.out.println(wrkN);
        //g88a8 17 => 10: 1378130
        //g88a8 35 => 10: 24363158
        for (int i = 0; i < 5; i++) {
//            System.out.println("\t"+i+": "+wrkN);
            int wrkInt = (int) (wrkN * r2);
            String wrkStr = wrkInt+"";
            String wrkC = convertBase(10, wrkStr, 35 );

//            System.out.println("\t\t"+(wrkN * r2) + " | " + wrkInt + " | " + wrkC +"!");

            decStr = decStr + ""+ wrkC;
            wrkN = (wrkN * r2)-wrkInt;
        }
        return decStr;
    }


    public static String convertBase(int r1, String n, int r2) {
        long n2;
        String rtnString = "";

        if (r1 > 1){
            n2 = Long.parseLong(n, r1);
        } else {
            n2 = n.length();
        }

        if (r2 > 1) {
            rtnString = Integer.toString((int) n2, r2);
        } else {
            for (int i = 1; i <= n2; i++) {
                rtnString = rtnString + "1";
            }
        }
        return  rtnString;
    }

}
