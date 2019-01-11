package u4.proj;
/**
 * Methods to display kiosk screens, ticket receipts and kiosk totals

 */



public class Output {

    public static void CheckInScreen(){

        System.out.print(" \n" +
                " \n" +
                " Best Value Parking Garage\n" +
                "\n" +
                " =========================\n" +
                "\n" +
                " 1 – Check/In\n" +
                "\n" +
                " 2 – Special Event\n" +
                "\n" +
                " 3 – Close Garage\n" +
                "\n" +
                " =>_");
    }

    //get new ticket and use input to choose enum ordinal to chose which type of ticket to create

    public static void CheckOutScreen(){

        System.out.print(" \n" +
                "\n" +
                " Best Value Parking Garage\n" +
                "\n" +
                " =========================\n" +
                "\n" +
                " 1 – Check/Out\n" +
                "\n" +
                " 2 – Lost Ticket\n" +
                "\n" +
                " =>_");
    }

    /**
     * receipt for a typical checkout
     * @param charge
     * @param timeIn
     * @param timeOut
     * @param charge
     * .

     */
    public static void CheckOutWithTicket(int id, int timeIn, int timeOut, double charge){

        System.out.println(" \n" +
                "\n" +
                "Best Value Parking Garage\n" +
                "\n" +
                "=========================\n" +
                "Receipt for a vehicle id " + id + "\n\n" +
                (timeOut-timeIn) + " hours parked " + timeIn + "am - " + (timeOut-12) + "pm\n");
        System.out.printf("$%.2f\n\n\n", charge);


    }

    /**
     * receipt for a special event ticket
     * @param charge
     * @param charge
     * .

     */
    public static void CheckOutSpecialEvent(int id, double charge){

        System.out.println(" \n" +
                "\n" +
                "Best Value Parking Garage\n" +
                "\n" +
                "=========================\n" +
                "Receipt for a vehicle id " + id + "\n\n" +
                "Special Event\n");
        System.out.printf("$%.2f\n\n\n", charge);


    }

    /**
     * receipt for a lost ticket
     * @param charge
     * @param charge
     * .

     */
    public static void CheckOutLostTicket(int id, double charge){

        System.out.println(" \n" +
                "\n" +
                "Best Value Parking Garage\n" +
                "\n" +
                "=========================\n" +
                "Receipt for a vehicle id " + id + "\n\n" +
                "Lost Ticket\n");
        System.out.printf("$%.2f\n\n\n", charge);

    }
    /**
     * report display upon closing kiosk
     * @param checkinTotal
     * @param specialEventTotal
     * @param lostTicketTotal
     * @param checkIns
     * @param specialEvents
     * @param lostTickets
     * .

     */
    public static void CloseKiosk(double checkinTotal, double specialEventTotal, double lostTicketTotal, int checkIns, int specialEvents, int lostTickets){


        System.out.println(" \n" +
                "\n" +
                "Best Value Parking Garage\n" +
                "\n" +
                "=========================\n" +
                "Activity to Date \n");
        System.out.printf("$%.2f was collected from %d Check Ins\n", checkinTotal, checkIns);
        System.out.printf("$%.2f was collected from %d Special Events\n", specialEventTotal, specialEvents);
        System.out.printf("$%.2f was collected from %d Lost Tickets\n\n\n", lostTicketTotal, lostTickets);
        System.out.printf("$%.2f was collected overall.\n\n\n", (checkinTotal + specialEventTotal + lostTicketTotal));

    }

    public static void InputError (){
        System.out.println("\n\nPlease try again...enter the choice number:  \n\n");
    }




}
