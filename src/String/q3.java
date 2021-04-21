package String;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class q3 {
    public static void main(String[] args) {
        List<String> tokens = new ArrayList<String>();
        String example = "https://www.amazon.com/demo?test=abc";
        StringTokenizer stringTokenizer = new StringTokenizer(example, ":// . ? =");
        while(stringTokenizer.hasMoreTokens()){
            tokens.add(stringTokenizer.nextToken());
        }
        System.out.println(tokens);
    }

}
