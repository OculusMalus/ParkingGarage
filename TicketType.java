package u4.proj;
import java.util.HashMap;

/**
 * Enum for selecting the Ticket Type to be used for each ticket.
 * Hashmap allows for use of integer input for selection.

 */

public enum TicketType {
    CHECKIN(1), SPECIALEVENT(2);

    private int value;
    private static HashMap map = new HashMap<>();

    TicketType(int value) {
        this.value = value;
    }

    static {
        for (TicketType ticketType : TicketType.values()) {
            map.put(ticketType.value, ticketType);
        }
    }

    public static TicketType valueOf(int ticketType) {
        return (TicketType)map.get(ticketType);
    }

    public int getValue() {
        return value;
    }
}









