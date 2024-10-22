package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDates {
    public static void main(String[] args) {

        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/YYYY");
        String d = sf.format(date);
        System.out.println(date);

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH, 19);
        cal.set(Calendar.MONTH,4);
        cal.set(Calendar.YEAR, 2016);
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 30);

        Date maDate = cal.getTime();

        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/YYYY 'à' HH:mm:ss 'secondes'");
        String maNouvDate= sd.format(maDate);
        System.out.println(maNouvDate);

        SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
        System.out.println(sdf.format(maDate));

        Date date2 = new Date();
        SimpleDateFormat sf2 = new SimpleDateFormat("dd HH");
        System.out.println(sf2.format(date2));






    }
}
