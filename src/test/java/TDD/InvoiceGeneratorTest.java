package TDD;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;


public class InvoiceGeneratorTest {
    InvoiceGenerator invoiceGenerator;

    @Before
    public void init() {
        invoiceGenerator = new InvoiceGenerator();
    }

    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
        double distance = 1.0;
        int time = 10;
        double fare = invoiceGenerator.calculateFare(distance, time);
        assertEquals(20, fare, 0.0);
    }

    @Test
    public void givenDistanceAndTime_WhenTotalFareLessThan10_ShouldReturnMinimumFare() {
        double distance = 0.1;
        int time = 1;
        double fare = invoiceGenerator.calculateFare(distance, time);
        assertEquals(5, fare, 0.0);
    }

}
