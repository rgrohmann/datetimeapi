package at.slmexam.datetimeapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class DateTimeAPIController {

    DateTimeAPI dateTimeAPI = new DateTimeAPI();

    @GetMapping("/api/today")
    public String getDate(){
        return dateTimeAPI.getCurrentDate();
    };

    @GetMapping("/api/now")
    public String getTime(){
        return dateTimeAPI.getCurrentFormatedTime();
    };

    @GetMapping("/api/now/{format}")
    public String setTimeFormat(@PathVariable String format){
        dateTimeAPI.setFormat(format);
        return "success";
    };

}
