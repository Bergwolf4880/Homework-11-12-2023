
public class Main {
    public static void main(String[] args) {

        int namesLength = 5;
        char firstLetter = 'c';
        String[] namesArray = {"Eugen", "John", "Charlie", "David", "Eva", "Drake"};
        NamesHandler namesHandler = new NamesHandler(namesArray);

        System.out.println("All names: " + namesHandler.toString() + " ");
        System.out.println("Names not longer than have " + namesLength + " symbols are: " + namesHandler.toStringByLength(namesLength));
        System.out.println("Names starting with " + firstLetter + ": " + namesHandler.toStringByStartWith(firstLetter));


    }

}
