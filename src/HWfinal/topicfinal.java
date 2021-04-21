package HWfinal;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public final class topicfinal {
    private final List<String> titles = new ArrayList<>();
    public final void setTitles(List<String> newtitle){
        for (String title : newtitle) {
            titles.add(title);
        }
    }
}
