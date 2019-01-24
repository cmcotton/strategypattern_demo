package temp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StixGenerator101 extends StixGenerator {

    @Override
    void setCategory(String close) {
        content += "我不一樣" + close;
    }

    @Override
    public List<String> getCol() {
        return new ArrayList(Arrays.asList("ip", "impact"));
    }
}
