import java.util.ArrayList;

public class Decoding {

    public static char[] isDecoding() {
        for (int i = 0; i < Solution.txt.length; i++) {
            int index = 0;
            while (Solution.txt[i] != Solution.alphavite[index]) index++;
            /**
             * Отнимаю от индекса наш ключ. Если меньше 0, то + 72 символ.
             */
            index -= Solution.key;
            if (index < 0) {
                index += 72;
            }
            Solution.txt[i] = Solution.alphavite[index];
        }
        String prob = new String(Solution.txt);
        if (prob.equals("Да! Теперь решено без возврата. Я покинул Родные края.")) {
            System.out.println("Расшифровка-есть совпадение! ниже перевод:");
        } else {
            System.out.println("нет");
        }
        return Solution.txt;
    }


}


