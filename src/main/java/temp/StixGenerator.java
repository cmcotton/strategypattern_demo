package temp;

import java.util.ArrayList;
import java.util.List;

public class StixGenerator {

    String content = "";

    public void gen(String id, String ca, String close) {
        setId(id);
        setCategory(ca);
        setClose(close);
    }

    void setId(String id) {
        content += id;
    }

    void setCategory(String category) {
        content += category;
    }

    void setClose(String close) {
        content += close;
    }

    public String getContent() {
        return content;
    }

    public List<String> getCol() {
        return new ArrayList();
    }
}
