package Caesar;
import java.io.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /*
          предлагаем на выбор три режима
         */
        System.out.println("Введите 1 для шифрования текста из файла. Введите 2 для режима BruteForce. Введите 3 для статистического анализа");
        Scanner console = new Scanner(System.in);
        while (true) {
            int button = console.nextInt();
            switch (button) {
                case 1:
                    System.out.println(Caesar.isCipher());
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/Caesar/final.txt"))) {
                        writer.write(Utils.baseText);
                        writer.flush();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println("запись зашифрованного текста прошла успешно");
                    System.out.println(Decoding.isDecoding(Utils.baseKey, Utils.baseText));
                    return;
                case 2:
                    System.out.println(BruteForce.isBruteForce());
                    return;
                case 3:
                    int indexStat = Static.isStatic(Utils.isReader(Utils.textForStatic));
                    int indexBrute = Static.isStatic(Utils.isReader(Utils.brute));
                    int staticKey = 72 - (indexStat - indexBrute);
                    System.out.println(Decoding.isDecoding(staticKey, Utils.isReader(Utils.brute)));
                    return;
                default:
                    System.out.println("Введите 1 для шифрования текста из файла. Введите 2 для режима BruteForce. Введите 3 для статистического анализа");
            }
        }
    }
}