import java.time.*;
import java.time.format.*;
class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        String astr = a<10? "0"+a: a+"";
        String bstr = b<10? "0"+b: b+"";
        String date = "2016"+astr+bstr;
        System.out.println(date);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate localDate = LocalDate.parse(date, dateTimeFormatter);

        answer = localDate.getDayOfWeek().name().substring(0,3);
        return answer;
    }
}