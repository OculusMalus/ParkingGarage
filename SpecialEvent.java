package u4.proj;

/**
 * Special Event ticket class overrides all Ticket methods

 */
public class SpecialEvent implements Ticket{

    int inTime, outTime;
    int iD;
    String ticketType;
    double totalBill = 20;
    private BillCalculationStrategy billCalculationStrategy;
    boolean lost = false;

    public SpecialEvent(int id){

        inTime = Timeclock.checkIn();
        this.iD = id;
        this.billCalculationStrategy = new SpecialEventBillStrategy();
        ticketType = "specialEvent";

    }

    @Override
    public String getTicketType(){ return this.ticketType; }

    @Override
    public void displayTicket() {
        if (lost) {Output.CheckOutLostTicket(iD, totalBill);}
        else{Output.CheckOutSpecialEvent(iD, totalBill);}
    }
    /**
     * CalculatedBill method resets the bill calculation strategy if input choice 2 (lost ticket)
     * is selected then calculates the total bill
     * @param choice

     */
    @Override
    public double calculateBill(int choice){
        if (choice == 2){
            setBillCalculationStrategy();
            ticketType = "lost";
            lost = true;
        }

        double bill = billCalculationStrategy.calculateBillAmount(inTime, outTime);
        setTotalBill(bill);
        return bill;
    }


    public double getTotalBill() {
        return totalBill;
    }

    @Override
    public void setOutTime(int outTime){ this.outTime = outTime; }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }

    public void setBillCalculationStrategy(){
        this.billCalculationStrategy = new LostTicketBillStrategy();
    }

    @Override
    public void setInTime(int inTime){ this.inTime = inTime;}
}