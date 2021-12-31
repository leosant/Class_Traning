import model.Clock;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {
    static long time = 1000L * 60L * 60L * 24L; //Equivalente a um dia

    public static void main(String[] args) {
        //Threads
        List<Clock> clocks = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            clocks.add(new Clock(time, i, 1000));
        }
        for (Clock clock : clocks) {
            clock.start();
        }

        //Regex
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3Schools!");
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println(matcher.start());
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}
