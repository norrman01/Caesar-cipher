package Caesar;

class Caesar  {

    public static char[] isChiffre() {
        /**
         * Вызываю метод ридер, который принимает текстовый файл и считывает его.
         * дальше путем цикла перебираем чары.
         */
        Utils.isReader(Utils.caesar);
        for (int i = 0; i < Utils.txt.length; i++) {
            int index = 0;
            try {
                while (Utils.txt[i] != Utils.alphabet[index]) index++;
            } catch (ArrayIndexOutOfBoundsException e) {
                index = 71;
            }
            /**
             * Добавляю ключ +10, и меняю индекс. Если перевалило за 71, то отсчет с 0.
             */
            index += Utils.key;
            if (index > 71) {
                index -= 72;
            }
           Utils.txt[i] = Utils.alphabet[index];
        }
        return Utils.txt;
    }
}



