package u4.proj;
/**
 * Garage parking kiosk program
 * written by
 * @author Stephanie Nance
 *
 *
 * accepts one ticket checkin/checkout at a time
 * calculates totals of tickets, lost tickets and special event tickets when kiosk is closed.

 */

public class Main {

    public static void main(String[] args) {

        //open garage kiosk
        SingletonKiosk kiosk = SingletonKiosk.getKioskInstance();

        boolean end = false;

        while (end == false) {

            //run kiosk until we want to close the garage

            end = kiosk.operateKiosk(end);

        }

        //close garage and display ticket totals
        kiosk.closeKiosk();

    }








    }

