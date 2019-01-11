package u4.proj;
import java.util.Random;

/**
 * Timeclock class issues checkin and checkout times
 * based on random values in a specified range.
 * All times are based on 24 hour clock for
 * mathematical purposes

 */

public abstract class Timeclock {

    Random rand = new Random();

    public static int checkIn (){

        //random number between 7 - 11


        int inTime = (int)(Math.random() * ((11 - 7) + 1)) + 7;;
        return inTime;
    }

    public static int checkOut(){

        //random number between 13-23
        int outTime = (int)(Math.random() * ((23 - 13) + 1)) + 13;
        return outTime;
    }



}
