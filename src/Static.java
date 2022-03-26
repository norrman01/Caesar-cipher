import java.util.HashMap;
import java.util.Map;

public class Static {
    /**
     * сюда входит статик.txt методом ридер
     * с помощью циклов перебираем чары и составляем map из символов и колва вхождений.
     */
    static String stat = "C:\\javarush\\stat.txt";
    public static char[] isStat = Solution.isReader(stat);
    public static char [] isStatic (){
       Map<Character, Integer> map = new HashMap<>();

        for (int i = 1; i < isStat.length; i++) {
            if (map.get(isStat[i]) == null){
                map.put(isStat[i], 1 );
            }
            else
            map.put(isStat[i], map.get(isStat[i])+1 );
        }
        for (Character key: map.keySet()){
            Integer value = map.get(key);
            System.out.println(key + " --> " + value);

        }


return isStat;
    }
}

