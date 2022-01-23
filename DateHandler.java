import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class DateHandler {

    //Írassuk az aktuális timestamp-et [%aktuális timestamp a kiíratás pillanatában% - formátuma: (ÉÉÉÉ-HH-NN hh:pp:mm.sss)]
    public String getTimeStamp(){
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());
        String result = sdf3.format(timestamp);
        return result;
    }

    //Írassuk az aktuális dátumot (ÉÉÉÉ-HH-NN)
    public String getToday(){
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String result = sdf3.format(date);
        return result;
    }

    //Írassuk az holnapi dátumot (ÉÉÉÉ-HH-NN)
    public String getTomorrow(){
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.DAY_OF_MONTH,1);
        Date date = c.getTime();
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
        String result = sdf3.format(date);
        return result;
    }
    //Írassuk az ma+30 napos dátumot (ÉÉÉÉ-HH-NN)
    public String getNextMonth(){
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.DATE,30);
        Date date = c.getTime();
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
        String result = sdf3.format(date);
        return result;
    }
}
