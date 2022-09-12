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

    //test för att max fee är 60 
    

    @Test
    void testMain() {

    }
}