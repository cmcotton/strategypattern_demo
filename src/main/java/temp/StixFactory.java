package temp;

public class StixFactory {

    public static StixGenerator get(String cate) {
        StixGenerator stixGenerator = null;

        Class<StixGenerator> some = null;
        try {
            some = (Class<StixGenerator>) Class.forName("temp.StixGenerator" + cate);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            stixGenerator = some.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return stixGenerator;
    }
}
