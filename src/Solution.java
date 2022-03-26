import java.io.*;
import java.nio.file.DirectoryStream;
import java.util.Scanner;

public class Solution {
    public static char[] txt;
    static String stat = "C:\\javarush\\stat.txt";
    static int key = 10;
    static char[] alphavite = new char[]{'А', 'а', 'Б', 'б', 'В', 'в', 'Г', 'г', 'Д', 'д', 'Е', 'е', 'Ё', 'ё', 'Ж',
            'ж', 'З', 'з', 'И', 'и', 'Й', 'й', 'К', 'к', 'Л', 'л', 'М', 'м', 'Н', 'н', 'О', 'о', 'П', 'п',
            'Р', 'р', 'С', 'с', 'Т', 'т', 'У', 'у', 'Ф', 'ф', 'Х', 'х', 'Ц', 'ц', 'Ч', 'ч', 'Ш', 'ш', 'Щ',
            'щ', 'ъ', 'Ы', 'ы', 'ь', 'Э', 'э', 'Ю', 'ю', 'Я', 'я', '.', ',', '"', ':', '-', '?', '!', ' '};
    public static String caesar = "C:\\javarush\\новый.txt";

    public static char[] isReader(String caesar) {
        try (FileReader in = new FileReader(caesar);
             BufferedReader reader = new BufferedReader(in)) {
            while (reader.ready()) {
                String text = reader.readLine();
                System.out.println("Изначальный текст: " + text);
                txt = text.toCharArray();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return txt;
    }

    public static void main(String[] args) {
        /**
         * предлагаем на выбор два режима
         */
        System.out.println("Введите 1 для шифрования текста из файла. Введите 2 для режима BruteForce. Введите 3 для статистического анализа");
        Scanner console = new Scanner(System.in);

        while (true) {
            int f = console.nextInt();
            if (f == 2) {
                System.out.println(BruteForce.isBruteForce());
                return;
            } else if (f == 1) {

                /**
                 * Зашифровываем путём вызова метода isChiffre из класса Caesar
                 */
                System.out.println(Caesar.isChiffre());
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\javarush\\final.txt"))) {
                    writer.write(txt);
                    writer.flush();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("запись зашифрованного текста прошла успешно");

                /**
                 * А теперь всё обратно расшифровываем
                 */
                System.out.println(Decoding.isDecoding(key, txt));
                return;
            } else if (f == 3) {
                int index1 = Static.isStatic(isReader(stat));
                int index2 = Static.isStatic(isReader(BruteForce.brute));
                int reskey = 72 - (index1 - index2);
                System.out.println(Decoding.isDecoding(reskey, isReader(BruteForce.brute)));
            } else {
                System.out.println("Введите 1 для шифрования текста из файла. Или введите 2 для режима BruteForce");
            }
        }
    }
}