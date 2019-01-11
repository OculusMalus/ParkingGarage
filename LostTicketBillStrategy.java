package u4.proj;

/**
 * Current billing strategy for a lost type ticket is $25. InTime and outTime are
 * not used, but are required to implement the billing strategy interface.

 */

public class LostTicketBillStrategy implements BillCalculationStrategy{

    public LostTicketBillStrategy(){}

    public double calculateBillAmount(int inTime, int outTime){

        return 25;

    }
}
