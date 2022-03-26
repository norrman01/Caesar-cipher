import java.util.HashSet;

class Caesar  {

    public static char[] isChiffre(int key, char[] txt) {
        /**
         * Вызываю метод ридер, который принимает текстовый файл и считывает его.
         * дальше путем цикла перебираем чары.
         */
        Solution.isReader(Solution.caesar);
        for (int i = 0; i < txt.length; i++) {
            int index = 0;
            try {
                while (txt[i] != Solution.alphavite[index]) index++;
            } catch (ArrayIndexOutOfBoundsException e) {
                index = 71;
            }
            /**
             * Добавляю ключ +10, и меняю индекс. Если перевалило за 71, то отсчет с 0.
             */
            index += key;
            if (index > 71) {
                index -= 72;
            }
            txt[i] = Solution.alphavite[index];
        }
        return txt;
    }
}



