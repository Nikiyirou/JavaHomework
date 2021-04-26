package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class p1 {
    public static List<String> both(List<String> a, List<String> b){
        Set<String> setB = new HashSet<>();
        List<String> ans = new ArrayList<>();
        for(String s : b) {
            setB.add(s);
        }
        for(String curr : a){
            if(setB.contains(curr)){
                ans.add(curr);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        List<String> b = new ArrayList<>();
        List<String> ans = new ArrayList<>();
        a.add("momo");
        a.add("cici");
        a.add("tipo");
        a.add("riri");

        b.add("momo");
        b.add("eiei");
        b.add("cici");
        b.add("soso");
        ans = both(a, b);
        for(String q : ans){
            System.out.println(q);
        }
    }
}
