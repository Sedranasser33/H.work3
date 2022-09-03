import java.util.Scanner;

public class Three {
    public static void main(String[] args) {

        int a;
        Scanner in=new Scanner(System.in);
        System.out.print(" enter number 1=  ");
        a=in.nextInt();


        if(a>0  )
        {
         System.out.println("positive");}
  else
        if(a<0  )
        {   System.out.println("negative");}
        else System.out.println("0");
    }
}

