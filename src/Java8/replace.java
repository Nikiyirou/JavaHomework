package Java8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class replace {
    public static void main(String[] args) {
        String S = "walabcwalexywalxzsfwalmx";
        System.out.println(Arrays.asList(S.split("(?i)wal")).stream().collect(Collectors.joining("sams")));
    }
}
