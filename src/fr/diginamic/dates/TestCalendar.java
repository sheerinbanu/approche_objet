package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {
    public static void main(String[] args) {

        Date date1 = new Date();

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH, 19);
        cal.set(Calendar.MONTH,4);
        cal.set(Calendar.YEAR, 2016);
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 30);

        Date maDate = cal.getTime();

        SimpleDateFormat sf1 = new SimpleDateFormat("dd/MM/YYYY");
        System.out.println(sf1.format(maDate));

        SimpleDateFormat sf2 = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
        System.out.println(sf2.format(maDate));

        SimpleDateFormat sf3 = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.FRANCE);
        System.out.println(sf3.format(maDate));
        SimpleDateFormat sf4 = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.CHINA);
        System.out.println(sf4.format(maDate));
        SimpleDateFormat sf5 = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.GERMAN);
        System.out.println(sf5.format(maDate));
        Locale russe = new Locale("ru", "RU");
        SimpleDateFormat sf6 = new SimpleDateFormat("EEEE dd MMMM yyyy", russe);
        System.out.println(sf6.format(maDate));
    }
}
