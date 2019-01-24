package temp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StixGenerator301 extends StixGenerator {

    @Override
    public List<String> getCol() {
        return new ArrayList(Arrays.asList("ip", "手法研判"));
    }


}
