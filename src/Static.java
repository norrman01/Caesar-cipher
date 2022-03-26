import java.util.HashMap;
import java.util.Map;

public class Static {

    public static int isStatic(char[] name) {
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 1; i < name.length; i++) {
            if (map.get(name[i]) == null) {
                map.put(name[i], 1);
                count++;
            } else
                map.put(name[i], map.get(name[i]) + 1);
            count++;
        }
        int maxvalue = 0;
        char maxkey = 0;
        for (Character key : map.keySet()) {
            Integer value = map.get(key);
            if (value > maxvalue) {
                maxvalue = value;
                maxkey = key;
            }
            System.out.println(key + " --> " + value);
        }
        System.out.println("символ \"" + maxkey +  "\" " + maxvalue + " повторения, из кол-ва символов " + count);

//        double maxproc = (double) maxvalue / count;
//        System.out.println(maxproc);
        int index = 0;
        for (int i = 0; i < Solution.alphavite.length; i++) {
            if (maxkey == Solution.alphavite[i]) {
                index = i;
            }
        }
//        int reskey = 72 - (71 - index);
//        System.out.println(reskey);

        return index;
    }
}

