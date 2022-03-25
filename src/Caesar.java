import java.util.HashSet;

class Caesar  {

    public static char[] isChiffre() {
        Solution.isReader(Solution.caesar);
        for (int i = 0; i < Solution.txt.length; i++) {
            int index = 0;
            try {
                while (Solution.txt[i] != Solution.alphavite[index]) index++;
            } catch (ArrayIndexOutOfBoundsException e) {
                index = 71;
            }
            /**
             * Добавляю ключ +10, и меняю индекс. Если перевалило за 71, то отсчет с 0.
             */
            index += Solution.key;
            if (index > 71) {
                index -= 72;
            }
            Solution.txt[i] = Solution.alphavite[index];
        }
        return Solution.txt;
    }
}



