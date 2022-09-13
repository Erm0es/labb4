package edu.lernia.labb4;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import java.time.Month;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



public class TollFeeCalculatorTest {
    @Test
    @DisplayName("Check if date has right tollfee")
    void testGetTollFeePerPassing() {
        LocalDateTime date;
        date = LocalDateTime.of(2020,Month.JUNE, 30, 15, 30);
    assertEquals(18, TollFeeCalculator.getTollFeePerPassing(date));
}

    @Test
    @DisplayName("Check if TotalFeeCost gets right tollfee")
    void testGetTotalFeeCost() {
        LocalDateTime[] date = new LocalDateTime[3];
        date[0] = LocalDateTime.of(2020,Month.JUNE, 30, 11, 30);
        date[1] = LocalDateTime.of(2020,Month.JUNE, 30, 15, 30);
        date[2] = LocalDateTime.of(2020,Month.JUNE, 30, 17, 00);

       assertEquals(39, TollFeeCalculator.getTotalFeeCost(date));
    
       //Check if max tullfee is 60, totalcost is 65, should be 60.
       LocalDateTime[] date1 = new LocalDateTime[5];
       date1[0] = LocalDateTime.of(2020,Month.JUNE, 30, 6, 30);
       date1[1] = LocalDateTime.of(2020,Month.JUNE, 30, 8, 00);
       date1[2] = LocalDateTime.of(2020,Month.JUNE, 30, 15, 30);
       date1[3] = LocalDateTime.of(2020,Month.JUNE, 30, 17, 01);
       date1[4] = LocalDateTime.of(2020,Month.JUNE, 30, 18, 29);

       assertEquals(60, TollFeeCalculator.getTotalFeeCost(date1));
    }




    @Test
    @DisplayName("Check if dates is tollfree")
    void testIsTollFreeDate() {
        LocalDateTime[] date = new LocalDateTime[3];

        date [0]= LocalDateTime.of(2020,Month.JUNE, 27, 15, 30);
        date [1]= LocalDateTime.of(2020,Month.JUNE, 28, 15, 30);
        date [2]= LocalDateTime.of(2020,Month.JULY, 27, 15, 30);

      assertEquals(true, TollFeeCalculator.isTollFreeDate(date[0]));
      assertEquals(true, TollFeeCalculator.isTollFreeDate(date[1]));
      assertEquals(true, TollFeeCalculator.isTollFreeDate(date[2]));
    }
    

    @Test
    void testMain() {

    }
}