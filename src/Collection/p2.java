package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class p2 {
    public static void duplicate(String s){
        List<String[]> ans = new ArrayList<>();
        Map<Character, Integer> store = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            store.put(s.charAt(i), store.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (Character c : store.keySet()) {
            if (store.get(c) > 1) {
                System.out.println(c + ": " + store.get(c));
            }
        }

    }

    public static void main(String[] args) {
        String s = "asjkdlcknsdbjcakjscncbdsc";
        duplicate(s);
    }
}
