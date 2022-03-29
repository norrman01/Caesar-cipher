package Caesar;

import java.util.HashMap;
import java.util.Map;

public class Static {

    public static int isStatic(char[] name) {
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        /*
          создаем мапу, где чар это ключ, а инт это значение. через цикл заполняем, так же считаем общее кол-во символов.
          в случае, если символ повторяется, просто увеличивается значение +1
         */
        for (int i = 0; i < name.length; i++) {
            if (map.get(name[i]) == null) {
                map.put(name[i], 1);
                count++;
            } else
                map.put(name[i], map.get(name[i]) + 1);
            count++;
        }
        int maxvalue = 0;
        char maxkey = 0;
        /*
          здесь ищем самое большое значение. тот символ который больше других раз повторяется в тексте. и выводим его на экран.
         */
        for (Character key : map.keySet()) {
            Integer value = map.get(key);
            if (value > maxvalue) {
                maxvalue = value;
                maxkey = key;
            }
            System.out.println(key + " --> " + value);
        }
        System.out.println("символ \"" + maxkey + "\" " + maxvalue + " повторений, из кол-ва символов- " + count);
        int index = 0;
        /*
          здесь мы перебираем наш алфавит и ищем индекс нашего самого популярного символа, и возвращаем его.
         */
        for (int i = 0; i < Utils.alphabet.length; i++) {
            if (maxkey == Utils.alphabet[i]) {
                index = i;
            }
        }
        return index;
    }
}

