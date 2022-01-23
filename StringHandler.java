import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringHandler{

    public void showString(String text){
        System.out.println(text);
    }

    public String replaceString(String text, String origin, String replacement){
        String result = text.replaceAll(origin, replacement);
        return result;
    }

    public String trimString(String text){
        String result = "";
        String[] array = text.split("\n");
        for (int i = 0; i < array.length; i++) {
            String line = array[i].trim();
            result += line + "\n";
        }
        return result;
    }

    public String[] splitString(String text, String separator){
        String[] array = text.split(separator);
        return array;
    }

    public Date stringToDate(String date, String dateFormat){
        Date result = null;
        try {
            result = new SimpleDateFormat(dateFormat).parse(date);
        } catch (Exception ex) {
            System.out.println(ex.getStackTrace());
        }
        return result;
    }

    public Integer stringToInteger(String text){
        Integer result = null;
        try{
            result = Integer.parseInt(text);
        } catch(Exception ex){
            System.out.println(ex.getStackTrace());
        }
        return result;
    }
}
