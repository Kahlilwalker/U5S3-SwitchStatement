package partB.ex02;

import java.util.Scanner;

public class SwitchLight {
    public static String switchLight(){
        String response = "";

        /* Put your code in between these comments : Top */

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Color Code:");
        int color = in.nextInt();
        in.close();
        switch (color) {
            case 1:
                response += ("Next Traffic Light is green");
                break;
            case 2:
                response += ("Next Traffic Light is Yellow");
                break;
            case 3:
                response += ("Next Traffic Light is red.");
                break;
            default:
                response += ("Invalid color code");

        }

        /* Put your code in between these comments : Bottom */



        return response;
    }
    public static void main(String args[]) {
        String switchOutput = switchLight();
        System.out.println(switchOutput);
    }
}
