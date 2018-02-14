import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String INP = "";
        int i= 0;
        long z = 0;
        long y = 0;
        long v=0;
        System.out.print("Enter a hexadecimal number: ");
        INP = scan.next();
        int x = INP.length();
            while(i < x) {
                char w = INP.charAt(i);
                if (w == 'A' || w == 'a') {
                    y = 10;
                } else if (w == 'B' || w == 'b') {
                    y = 11;
                } else if (w == 'C' || w == 'c') {
                    y = 12;
                } else if (w == 'D' || w == 'd') {
                    y = 13;
                } else if (w == 'E' || w == 'e') {
                    y = 14;
                } else if (w == 'F' || w == 'f') {
                    y = 15;
                } else if(w == 0|| w =='x'||w =='X'){
                    y=0;
                }
                    else {
                    y = Character.getNumericValue(w);
                }
                int c = i + 1;
                c = x - c;
                y = (long) (y * Math.pow(16, c));
                z =(z + y);
                 //v= (long)z;
                i++;
            }

        System.out.println("Your number is "+z+" in decimal");

    }
}
