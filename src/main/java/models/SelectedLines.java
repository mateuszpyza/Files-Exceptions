package models;

public class SelectedLines {


    public static void writeEveryOtherLine(String text) {
        if (text != null) {
            int startIndex = 0;
            int endIndex = 0;
            int counter = 0;
            while (endIndex != -1) {
                startIndex = text.indexOf("\n", startIndex);
                endIndex = text.indexOf("\n", startIndex + 1);
                if (endIndex == -1 && counter % 2 == 0) {
                    endIndex = text.length();
                    System.out.println(text.substring(startIndex + 1, endIndex));
                    break;
                }
                if (counter % 2 == 0) {
                    System.out.println(text.substring(startIndex + 1, endIndex));
                }
                counter = counter + 1;
                startIndex = startIndex + 1;
            }
        } else {
            throw new RuntimeException("Problems with data input!");
        }
    }
}
