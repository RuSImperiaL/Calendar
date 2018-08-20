import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Controller {

    public static void createCurrentCalendar(){
        String [] days = {"Пн", "Вт", "Ср", "Чт", "Пт", "Сб", "Вс"}; // Дни недели для заголовка календаря
        LocalDate today = LocalDate.now();  //Получили сегодняшний день
        LocalDate firstDayOfMonth  = LocalDate.of(today.getYear(), today.getMonth(), 1);
        for (int i = 0; i < days.length; i++) {
            System.out.print(days[i] + "  ");
        }
        System.out.println();
        Month todayMonth = today.getMonth();
        for (int i = 0; i < (7 - firstDayOfMonth.getDayOfWeek().getValue()); i++) {
            System.out.print("  ");
        }
        String tab = "";
        String tab2 = "";
        while (firstDayOfMonth.getMonth() == todayMonth){
            if(firstDayOfMonth.getDayOfMonth() < 10){
                tab = "0";
            } else tab = "";
            if(firstDayOfMonth.getDayOfMonth() == today.getDayOfMonth()){
                tab2 = "* ";
            } else tab2 = "  ";
            if(firstDayOfMonth.getDayOfWeek() == DayOfWeek.SUNDAY){
                System.out.println(tab + firstDayOfMonth.getDayOfMonth() + tab2);
            } else
                System.out.print(tab + firstDayOfMonth.getDayOfMonth() + tab2);
            firstDayOfMonth = firstDayOfMonth.plusDays(1);
        }
    }
}
