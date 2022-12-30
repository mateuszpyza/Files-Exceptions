package models;


public class TextReverser {
    public static void reversText(String text) {
        if (text != null) {
            int j = 0;
            char[] reverseText = text.toCharArray();
            for (int i = text.length() - 1; i >= 0; i--) {
                reverseText[j] = text.toCharArray()[i];
                j++;
            }
            System.out.println(reverseText);
        } else {
            throw new RuntimeException("Problems with input data!");
        }
    }
}
