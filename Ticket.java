package u4.proj;

/**
 * Interface for the two ticket types, CheckIn or SpecialEvent to implement and methods to override:
 * i

 */

public interface Ticket {
    void displayTicket();

    double calculateBill(int choice);

    double getTotalBill();

    String getTicketType();

    void setInTime(int inTime);

    void setOutTime(int outTime);

}

