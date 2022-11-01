import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class Clock {
  public static void main(String[] args) {
    LocalTime myDateObj = LocalTime.now();
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm");
    
    String formattedTime = myDateObj.format(myFormatObj);
    System.out.printf("The current time is %s \n", formattedTime);
  }
}