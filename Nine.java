import java.util.Scanner;
public class Nine {
    public static void main(String[] args) {
        int month, day;
        String season ;
        Scanner in = new Scanner(System.in);
        System.out.print(" enter number of Month:  ");
        month = in.nextInt();
        System.out.print(" enter the day:  ");
        day = in.nextInt();

        if (month == 1 || month == 2 || month == 3) {
            season = "Winter";
            if (month % 3 == 0 && day <= 21)  season="Spring";
            System.out.println(season);}

        else if (month == 4 || month == 5 || month == 6) {
            season = "Spring";
            if (month % 3 == 0 && day <= 21)  season="Summer";
            System.out.println(season);

        } else if (month == 7 || month == 8 || month == 9) {
            season = "Summer";
            if (month % 3 == 0 && day <= 21)
                season = "Fall";
            System.out.println(season);

        } else if (month == 10 || month == 11 || month == 12) {
            season = "Fall";
            if (month % 3 == 0 && day <= 21)
                season="Winter";
          System.out.println(season);
        }

    }
    }