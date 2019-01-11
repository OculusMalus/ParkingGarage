package u4.proj;

import java.util.ArrayList;

/**
 * the SingletonKiosk class is a Singleton pattern class that contains
 * the single parking garage kiosk machine and all it's data and controls operation
 * .

 */


public class SingletonKiosk {



    private static SingletonKiosk kioskInstance;

    //other necessary instance variables go here
    ArrayList<Ticket> tickets = new ArrayList<Ticket>();
    TicketFactory ticketFactory = new TicketFactory();
    double checkinTotal = 0, lostTicketTotal = 0, specialEventTotal = 0;
    int checkIns = 0, lostTickets = 0, specialEvents = 0;



    private SingletonKiosk(){}

    public static SingletonKiosk getKioskInstance(){
        if (kioskInstance == null){
            kioskInstance = new SingletonKiosk();
        }

        return kioskInstance;
    }

    public boolean operateKiosk(boolean end){

        //display check-in screen
        Output.CheckInScreen();

        //get choice of ticket or close garage
        int choice = Input.checkInInput();
        if (choice == 3) {
            end = true;
        } else {

            //create ticket based upon choice(we don't know what it is)
            var someTicket = TicketFactory.getTicket(TicketType.valueOf(choice));

            //display checkOut screen
            Output.CheckOutScreen();

            //reset bill strategy based upon Checkout choice if necessary
            //check out or lost ticket get the bill
            int checkoutChoice = Input.checkOutInput();

            //Checkout timestamp
            someTicket.setOutTime(Timeclock.checkOut());

            //calculate bill
            someTicket.calculateBill(checkoutChoice);

            //display ticket with bill total
            someTicket.displayTicket();

            //add completed ticket to kiosk list
            tickets.add(someTicket);
        }


        return end;

    }



    public void closeKiosk(){

        for (int i = 0; i < tickets.size(); i++){

            if ("checkIn".equals(tickets.get(i).getTicketType()))
            {
                checkinTotal +=  tickets.get(i).getTotalBill();
                checkIns += 1;
            }

            else if ("specialEvent".equals(tickets.get(i).getTicketType()))
            {
                specialEventTotal += tickets.get(i).getTotalBill();
                specialEvents += 1;
            }

            else
                {
                    lostTicketTotal += tickets.get(i).getTotalBill();
                    lostTickets +=1;
                }

        }

        Output.CloseKiosk(checkinTotal, specialEventTotal, lostTicketTotal, checkIns, specialEvents, lostTickets);
    }





}
