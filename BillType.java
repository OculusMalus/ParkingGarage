package u4.proj;

import java.util.HashMap;

/**
 * Enum for selecting the Billing strategy to be used for each ticket.
 * Hashmap allows for use of integer input for selection.

 */

public enum BillType {

    CHECKIN(1), LOST(2);

    private int value;
    private static HashMap map = new HashMap<>();

    BillType(int value) {
        this.value = value;
    }

    static {
        for (BillType billType : BillType.values()) {
            map.put(billType.value, billType);
        }
    }

    public static BillType valueOf(int billType) {
        return (BillType)map.get(billType);
    }

    public int getValue() {
        return value;
    }
}


