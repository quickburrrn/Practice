import java.lang.reflect.Array;
import java.util.*;

public class MexicanWave {
    public static String[] wave(String str) {
        String[] Wave = new String[str.length()];
        String[] mexican = str.split("",str.length()+1);

        //do the thing
        for (int i = 0; i<str.length(); i++){
            if (!mexican[i].equals(" ")){
                mexican[i] = mexican[i].toUpperCase();
                Wave[i] = String.join("",mexican);
                mexican[i] = mexican[i].toLowerCase();
            }
        }

        //removes null from list
        List<String> list = new ArrayList<String>();
        for (String s: Wave){
            if (s != null)
            {
                list.add(s);
            }
        }
        return list.toArray(new String[list.size()]);
    }
}
