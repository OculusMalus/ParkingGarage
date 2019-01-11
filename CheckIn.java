package u4.proj;

/**
 * CheckIn ticket class overrides all Ticket methods

 */

public class CheckIn implements Ticket {

    int inTime, outTime;
    int iD;
    String ticketType;
    double totalBill = 0;
    private BillCalculationStrategy billCalculationStrategy;
    boolean lost;

    public CheckIn(int id){
        inTime = Timeclock.checkIn();
        this.iD = id;
        this.billCalculationStrategy = new CheckInBillStrategy();
        ticketType = "checkIn";
        lost = false;

    }

    @Override
    public String getTicketType(){

        return this.ticketType;
    }

    /**
     * Displays the receipt for the ticket, or a lost ticket receipt

     */
    @Override
    public void displayTicket() {

        if (lost) {Output.CheckOutLostTicket(iD, totalBill);}
        else {Output.CheckOutWithTicket(iD, inTime, outTime, totalBill);}

    }

    /**
     * CalculatedBill method resets the bill calculation strategy if input choice 1 (check out ticket)
     * is not selected then calculates the total bill
     * @param choice

     */
    @Override
    public double calculateBill(int choice) {
        double bill;

        if (choice == 1){
            bill = billCalculationStrategy.calculateBillAmount(inTime, outTime);
            setTotalBill(bill);
        } else {

            setBillCalculationStrategy();
            bill = billCalculationStrategy.calculateBillAmount(inTime, outTime);
            setTotalBill(bill);

        }

        return bill;
    }


    public double getTotalBill() { return totalBill; }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }


    /**
     * Used to reset the bill calculation strategy and ticket type in the event of a lost ticket

     */
    public void setBillCalculationStrategy(){
        this.billCalculationStrategy = new LostTicketBillStrategy();
        ticketType = "lost";
        lost = true;
    }

    @Override
    public void setOutTime(int outTime){ this.outTime = outTime; }

    @Override
    public void setInTime(int inTime){ this.inTime = inTime;}


}


