package at.slmexam.datetimeapi;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;


public class DateTimeAPI {

    String format = "HH:mm";

    public String getCurrentDate() {
        DateTimeFormatter dtformat = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
        return dtformat.format(now);
    }

    public String getCurrentFormatedTime() {
        DateTimeFormatter dtformat = DateTimeFormatter.ofPattern(format);
        LocalDateTime now = LocalDateTime.now();
        return dtformat.format(now);
    }

    public void setFormat(String format) {
        this.format = format;
    }

}
