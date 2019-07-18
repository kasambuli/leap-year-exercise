import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import models.LeapYear;

public class App {
    public static void main(String[] args){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        Console myConsole = System.console();
        System.out.println("Enter a year, we'll tell you if it's a leap year");

        try{
            String stringYear = bufferedReader.readLine();
            int intYear = Integer.parseInt(stringYear);
            LeapYear leapYear = new LeapYear();
            boolean leapYearResult = leapYear.isLeapYear(intYear);
            System.out.println("Is that year a leap year?"+leapYearResult);
        }
        catch(IOException e){
            e.printStackTrace();
        }



    }
}
