import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;

/**
 * Created by erinkinnen on 6/29/17.
 */
public class greeting {
    public static void main(String[] args) {
        String name = "";
        Scanner consoleInput = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = consoleInput.nextLine();

        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        int hours = cal.get(Calendar.HOUR_OF_DAY);

        if(hours < 12)
            System.out.println("Good Morning, " + name + "!");
        else if(hours < 17)
            System.out.println("Good Afternoon, " + name + "!");
        else
            System.out.println("Good Evening, " + name + "!");

    }
}
