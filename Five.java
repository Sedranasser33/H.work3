import java.util.Scanner;

import java.util.Scanner;
public class Five {
    public static void main(String[] args) {

        int a, b, c;
        Scanner in = new Scanner(System.in);
        System.out.print(" enter number 1=  ");
        a = in.nextInt();
        System.out.print(" enter number 2=  ");
        b = in.nextInt();
        System.out.print(" enter number 3= ");
        c = in.nextInt();

        if (a == b & b == c) {
            System.out.println("all the same ");}

else

        if (a != b & b != c)
            System.out.println("all the different ");
         else
            System.out.println("neither");


    }









}
