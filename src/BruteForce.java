import java.io.*;
import java.util.Scanner;

public class BruteForce {
    static int key = -10;
    /**
     * создаю резервный массив чаров, с аналогичным размером как у txt
     */
    public static char[] txt2 = new char[Solution.isReader(Solution.caesar).length];
    public static String brute = "C:\\javarush\\final.txt";

    public static char[] isBruteForce() {

        /**
         * метод ридер, принимаем файл уже закодированный
         */
        Solution.isReader(brute);

        for (int j = 0; j < txt2.length; j++) {
            for (int i = 0; i < Solution.txt.length; i++) {
                int index = 0;
                while (Solution.txt[i] != Solution.alphavite[index]) index++;
                /**
                 * Отнимаю от индекса наш ключ. на каждом круге цикла меняем ключ на +1. Если меньше 0, то + 72 символ, если перевалили за 71, отнимаем 72
                 */
                index -= key;
                if (index < 0) {
                    index += 72;
                }
                if (index > 71) {
                    index -= 72;
                }
                txt2[i] = Solution.alphavite[index];
            }
            String prob = new String(txt2);
            String[] array = prob.split(" ");
            for (int i = 0; i < array.length; i++) {
                if (array[i].equals("шифрование")) {
                    System.out.println("есть совпадение!");
                    return txt2;
                }
            }
            key++;
        }
        return txt2;
    }
}











