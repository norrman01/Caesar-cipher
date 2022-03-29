package Caesar;


public class BruteForce {
    static int keyForBrute = -10;
    /*
      создаю резервный массив чаров, с аналогичным размером как у baseText
     */
    public static char[] isBruteForce() {
        /*
          метод ридер, принимаем файл уже закодированный
         */
       Utils.isReader(Utils.brute);
        for (int j = 0; j < Utils.textForBrute.length; j++) {
            for (int i = 0; i < Utils.baseText.length; i++) {
                int index = 0;
                while (Utils.baseText[i] != Utils.alphabet[index]) index++;
                /*
                  Отнимаю от индекса наш ключ. на каждом круге цикла меняем ключ на +1. Если меньше 0, то + 72 символ, если перевалили за 71, отнимаем 72
                 */
                index -= keyForBrute;
                if (index < 0) {
                    index += 72;
                }
                if (index > 71) {
                    index -= 72;
                }
                Utils.textForBrute[i] = Utils.alphabet[index];
            }
            String prob = new String(Utils.textForBrute);
            System.out.println(prob);
            String[] array = prob.split(" ");
            for (int i = 0; i < array.length; i++) {
                if (array[i].equals("шифрование")) {
                    System.out.println("есть совпадение!");
                    return Utils.textForBrute;
                }
            }
            keyForBrute++;
        }
        return Utils.textForBrute;
    }
}











