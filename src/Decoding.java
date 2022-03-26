import java.util.ArrayList;

public class Decoding {

    public static char[] isDecoding(int key, char[] txt) {
        for (int i = 0; i < txt.length; i++) {
            int index = 0;
            while (txt[i] != Solution.alphavite[index]) index++;
            /**
             * Отнимаю от индекса наш ключ. Если меньше 0, то + 72 символ.
             */
            index -= key;
            if (index < 0) {
                index += 72;
            }
            txt[i] = Solution.alphavite[index];
        }


        return txt;
    }


}


