package u4.proj;

/**
 * Interface for the three bill calculation strategies:
 * inTime and outTime are only required to calculate a CheckIn type ticket
 * but provided to the SpecialEvent strategy for possible future use.

 */

public interface BillCalculationStrategy {

    double calculateBillAmount(int inTime, int outTime);
}
