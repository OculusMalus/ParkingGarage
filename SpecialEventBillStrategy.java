package u4.proj;

public class SpecialEventBillStrategy implements BillCalculationStrategy {

    public SpecialEventBillStrategy(){}

    public double calculateBillAmount(int inTime, int outTime){
        //calculate bill for special event
        //in and out time are irrelevant but are demanded by the method
        return 20;

    }
}






