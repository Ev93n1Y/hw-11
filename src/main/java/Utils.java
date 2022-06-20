import java.util.ArrayList;
import java.util.Arrays;

public class Utils{
    public static ArrayList<String> createNamesList(String ...names){
        return new ArrayList<>(Arrays.asList(names));
    }
}
