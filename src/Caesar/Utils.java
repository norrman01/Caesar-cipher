package Caesar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Utils {
    public static char[] txt;
    static String stat = "src/Caesar/stat.txt";
    static int key = 10;
    static char[] alphabet = new char[]{'А', 'а', 'Б', 'б', 'В', 'в', 'Г', 'г', 'Д', 'д', 'Е', 'е', 'Ё', 'ё', 'Ж',
            'ж', 'З', 'з', 'И', 'и', 'Й', 'й', 'К', 'к', 'Л', 'л', 'М', 'м', 'Н', 'н', 'О', 'о', 'П', 'п',
            'Р', 'р', 'С', 'с', 'Т', 'т', 'У', 'у', 'Ф', 'ф', 'Х', 'х', 'Ц', 'ц', 'Ч', 'ч', 'Ш', 'ш', 'Щ',
            'щ', 'ъ', 'Ы', 'ы', 'ь', 'Э', 'э', 'Ю', 'ю', 'Я', 'я', '.', ',', '"', ':', '-', '?', '!', ' '};
    public static String caesar = "src/Caesar/новый.txt";
    public static char[] txt2 = new char[isReader(caesar).length];
    public static String brute = "final.txt";
    public static char[] isReader(String caesar) {
        try (FileReader in = new FileReader(caesar);
             BufferedReader reader = new BufferedReader(in)) {
            while (reader.ready()) {
                String text = reader.readLine();

                txt = text.toCharArray();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return txt;
    }
}
