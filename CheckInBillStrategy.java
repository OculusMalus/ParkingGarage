package u4.proj;

/**
 * Current billing strategy for a check in type ticket is $5 for he first three hours, $1 for each additional hour
 * not to exceed $15

 */

public class CheckInBillStrategy implements BillCalculationStrategy{

    public CheckInBillStrategy(){}

    /**
     * this method calculates total bill amount
     * @param inTime
     * @param outTime
     * .

     */
    public double calculateBillAmount(int inTime, int outTime){
        //calculate bill for number of hours
        double bill;
        int hours = outTime - inTime;

        if (hours <= 3) {
            bill = 5;
        }

        else {
            bill = 5.0 + (double)(hours - 3);
        }

        if (bill > 15.0){
            bill = 15.0;
        }

        return bill;

    }
}


//The fee charged for parked vehicles is based on a $5.00 minimum fee to park for up to three hours.
// After that there is an additional $1.00 per hour charge for each hour or part of an hour parked.
// The maximum charge for any given 24-hour period is $15.00.
// Assume that no vehicle parks for longer than 24 hours.