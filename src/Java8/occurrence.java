package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class occurrence {
    List<String> strList = Arrays.asList("Eclipse", "eclipse", "Eclipse", "eclipse", "amc", "clip", "ECLIPSE");
    Map<String, Integer> map = strList.stream().map(s -> s.toLowerCase())
            .collect(Collectors.groupingBy(o -> o, Collectors.summingInt(o -> 1)));
}
