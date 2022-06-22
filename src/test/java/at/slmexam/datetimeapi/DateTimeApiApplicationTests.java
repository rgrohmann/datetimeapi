package at.slmexam.datetimeapi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DateTimeApiApplicationTests {

    @Test
    void getCurrentDateTest() {
        //arrange
        DateTimeAPI dateTimeAPI = new DateTimeAPI();
        //act
        String curDate = dateTimeAPI.getCurrentDate();
        //assert

    }

    @Test
    void setFormatTeset() {
        //arrange
        DateTimeAPI dateTimeAPI = new DateTimeAPI();
        //act
        dateTimeAPI.setFormat("”HH:mm:ss”");
        //assert

    }

    @Test
    void getCurrentTimeTest() {
        //arrange
        DateTimeAPI dateTimeAPI = new DateTimeAPI();
        //act
        String curDate = dateTimeAPI.getCurrentFormatedTime();
        //assert

    }
}
