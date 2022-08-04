import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DaysOfTheWeek daysOfTheWeek = DaysOfTheWeek.valueOf(scanner.nextLine());
        switch (daysOfTheWeek) {
            case MONDAY:
                System.out.println("on Monday Java class");
                break;
            case TUESDAY:
                System.out.println("on Tuesday English class");
                break;
            case WEDNESDAY:
                System.out.println("on Wednesday Java tech class");
                break;
            case THURSDAY:
                System.out.println("on Thursday Soft skills class");
                break;
            case FRIDAY:
                System.out.println("on Friday Kyrgyz class");
                break;
            case SATURDAY, SUNDAY:
                System.out.println("Finally the weekend ooh :)");
        }


    }
}