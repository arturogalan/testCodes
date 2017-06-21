import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by arturo.galan on 21/6/17.
 */
public class testArrays {
    public static void main(String[] args) {
        String s = "abacabad";

        System.out.println(firstNotRepeatingCharacter2(s));



    }


    public static char firstNotRepeatingCharacter(String s) {
        HashMap<Character, Integer> counter = new LinkedHashMap<Character, Integer>();
        s.chars().forEach((letter) ->{
            if(counter.containsKey((char)letter))
                counter.put((char)letter,counter.get((char)letter)+1);
            else
                counter.put((char)letter,1);
        });


        for(Character key: counter.keySet()){
            if(counter.get(key) == 1)
                return key;
        }

        for (Map.Entry<Character,Integer> numbers : counter.entrySet()){
            if(numbers.getValue()==1)
                return numbers.getKey();
        }
        return '_';
    }




//partiendo de a, si le restamos a todos los caracteres 'a' tenemos los indices de las letras desde 0 hasta 26
//accedemos al indice en el array de cada letra y vamos sumando su contador ++

    public static char firstNotRepeatingCharacter2(String s) {

        int[] counter = new int[26];
        for (char c : s.toCharArray()) counter[c - 'a']++;
        for (char c : s.toCharArray()) if (counter[c - 'a'] == 1) return c;

        return '_';
    }


    public static char firstNotRepeatingCharacter3(String s) {

        char firstNotRepeatingCharacter (String s){
            char[] c = s.toCharArray();
            for (int i = 0; i < s.length(); i++) {
                if (s.indexOf(c[i]) == s.lastIndexOf(c[i]))
                    return c[i];
            }
            return '_';
        }
    }


}
