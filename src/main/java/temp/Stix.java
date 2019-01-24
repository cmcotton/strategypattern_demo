package temp;

public class Stix {

    public static void main(String[] a) {


        StixGenerator stixGenerator = StixFactory.get("301");

        stixGenerator.gen("301, ", "301 cate, ", "301 close");

        System.out.println(stixGenerator.getContent());
        System.out.println(stixGenerator.getCol());

        System.out.println("-----------------------------");


        stixGenerator = StixFactory.get("302");
        stixGenerator.gen("302, ", "302 cate, ", "302 close");
        System.out.println(stixGenerator.getContent());
        System.out.println(stixGenerator.getCol());

        System.out.println("-----------------------------");

        stixGenerator = StixFactory.get("101");
        stixGenerator.gen("101, ", "101 cate, ", "101 close");
        System.out.println(stixGenerator.getContent());
        System.out.println(stixGenerator.getCol());

    }
}
