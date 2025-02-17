package partB.ex01;

import java.util.Scanner;

public class IfLight {
    public static String ifLight(){
        String response = "";

        /* Put your code in between these comments : Top */


        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Color Code:");
        int color = in.nextInt();
        in.close();

        if(color == 1){
            response += "Next Traffic Light is green";
        }

        if(color == 2){
            response += "Next Traffic Light is yellow";
        }

        if(color == 3){
            response += "Next Traffic Light is red";
        }
        if (color > 3){
            response += " Invalid Color";
        }

        if (color < 3){
            response += " Invalid Color";
        }







        /* Put your code in between these comments : Bottom */



        return response;
    }
    public static void main(String args[]) {
        String switchOutput = ifLight();
        System.out.println(switchOutput);
    }
}
