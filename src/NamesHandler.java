import java.util.Arrays;
import java.util.Locale;

public class NamesHandler {
    private String[] names;


    public NamesHandler(String[] names) {
        this.names = names;
    }

    public NamesHandler(String name) {
        this.names = name.split(",");

    }

    public String toString() {
        return arrayToString(names);
    }

    public String toStringByLength(int length) {
        String result = "";
        for (String name : names) {
            if (name.length() == length) {
                result += name + " ";
            }
        }
        return result.trim();
    }

    public String toStringByStartWith(char firstLetter) {
        String result = "";
        for (String name : names) {
            if (name.toLowerCase().charAt(0) == firstLetter) {
                result += name + " ";
            }
        }
        return result;
    }

    public static String arrayToString(String[] names) {
        String result = "";
        for (String temp : names) {
            result = result + temp + " ";
        }
        return result;
    }
}