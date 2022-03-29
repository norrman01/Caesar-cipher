package Caesar;

class Caesar  {

    public static char[] isCipher() {
         /*Вызываю метод ридер, который принимает текстовый файл и считывает его.
         дальше путем цикла перебираем чары.*/
        Utils.isReader(Utils.textForCaesar);
        for (int i = 0; i < Utils.baseText.length; i++) {
            int index = 0;
            try {
                while (Utils.baseText[i] != Utils.alphabet[index]) index++;
            } catch (ArrayIndexOutOfBoundsException e) {
                index = 71;
            }
            /*
             Добавляю ключ +10, и меняю индекс. Если перевалило за 71, то отсчет с 0.
             */
            index += Utils.baseKey;
            if (index > 71) {
                index -= 72;
            }
           Utils.baseText[i] = Utils.alphabet[index];
        }
        return Utils.baseText;
    }
}



