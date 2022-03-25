import java.io.*;
import java.util.Scanner;

public class BruteForce {
    static int key = -3;
    public static char[] txt2 = new char[54];
    public static char[] isBruteForce() {
        String brute = "C:\\javarush\\final.txt";
       Solution.isReader(brute);


        for (int j = 0; j < 30 ; j++) {


            for (int i = 0; i < Solution.txt.length; i++) {
                int index = 0;
                while (Solution.txt[i] != Solution.alphavite[index]) index++;
                /**
                 * Отнимаю от индекса наш ключ. Если меньше 0, то + 72 символ.
                 */
                index -= key;
                if (index < 0) {
                    index += 72;
                }
                txt2[i] = Solution.alphavite[index];
            }

            String prob = new String(txt2);
            System.out.println(prob);
            if (prob.equalsIgnoreCase("Да! Теперь решено без возврата. Я покинул Родные края.")) {
                System.out.println("есть совпадение!");
                return txt2;
            } else {
                key++;
            }
        }
        return txt2;
    }
}











