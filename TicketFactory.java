package u4.proj;

/**
 * Factory class responsible for creation of tickets of a certain type

 */

public class TicketFactory {

    private static int id = 100;
    /**
     * Method creates new Ticket objects based on Ticket Type and issues the ticket id.
     * @param ticketType

     */

    public static Ticket getTicket(TicketType ticketType){
        id++;
         switch (ticketType){
            case CHECKIN: return new CheckIn(id);
            case SPECIALEVENT: return new SpecialEvent(id);
            default: return null;
        }
    }


}

