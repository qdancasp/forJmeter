import java.util.ArrayList;
import java.util.List;

public class NameHandler {
    private final List<String> names = new ArrayList<String>();

    public List<String> getNames() {
        return names;
    }

    public void addName(String name){
        names.add(name);
    }

    public void addName(){
        String name = "Mátyási Dani";
        this.addName(name);
    }
}
