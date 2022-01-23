import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class App {
    public static void main(String[] args) {

        final String lyric = "Egyszer háltam nálatok, leszakadt az ágyatok! \n" +
                "Úgy recsegett ropogott, a szalmája szotyogott! \n" +
                "Vettél nekem egy pulykát, egy fehéret egy barnát, \n" +
                "dugd fel babám a pulykát, miért nem vettél egyformát?! \n" +
                "Sárga rigó, darázsfészek, nem is ember ki nem részeg! \n" +
                "Iszom iszom amíg élek, amíg bennem szent a lélek! \n" +
                "Üsd meg kezed, üsd meg lábad, hozzál felest még egy párat! \n" +
                "Engem szeress ne anyádat, én csókolom meg a szádat! ";

        // create handlers
        DateHandler dateHandler = new DateHandler();
        HashMapHandler hashMapHandler = new HashMapHandler();
        StringHandler stringHandler = new StringHandler();
        NameHandler nameHandler = new NameHandler();

        // start measurement of running
        Timestamp ts1 = new Timestamp(System.currentTimeMillis());

        //timestamp exercises
        System.out.println(dateHandler.getTimeStamp());
        System.out.println(dateHandler.getToday());
        System.out.println(dateHandler.getTomorrow());
        System.out.println(dateHandler.getNextMonth());
        System.out.println(dateHandler.getTimeStamp());

        // hashmap exercises
        System.out.println("");
        HashMap<Integer, String> map = hashMapHandler.createHashMap();
        hashMapHandler.showHashMap(map);

        // String exercises
        System.out.println("");
        stringHandler.showString(lyric);
        System.out.println("");
        // lyric.replaceAll("pulykát","malacot"); is lehetne
        System.out.println(stringHandler.replaceString(lyric, "pulykát", "malacot"));
        System.out.println("");
        System.out.println(stringHandler.trimString(lyric));
        System.out.println(stringHandler.splitString(lyric, " ").length +" darab szó");
        System.out.println("");
        String formattedDate = "1993.10.12";
        Date date = stringHandler.stringToDate(formattedDate, "yyyy.MM.dd");
        System.out.println(date);
        System.out.println("");
        String text = "1200003";
        Integer integer = stringHandler.stringToInteger(text);
        System.out.println(integer);

        //overload methods
        System.out.println("");
        nameHandler.addName("Petra");
        nameHandler.addName();
        List<String> names = nameHandler.getNames();
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }


        //stop measurement of running
        System.out.println("");
        Timestamp ts2 = new Timestamp(System.currentTimeMillis());
        Long ts3 = ts2.getTime() - ts1.getTime();
        System.out.println(ts3+" ms");

    }
}
