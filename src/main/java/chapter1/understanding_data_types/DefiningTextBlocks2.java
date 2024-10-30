package chapter1.understanding_data_types;

public class DefiningTextBlocks2 {
    public static void main(String[] args) {

        String textBlocks1 = """
                Hello TextBlocks
                """;
        System.out.println("-------1------");
        System.out.println(textBlocks1);

        String textBlocks2 = """
                    line1
                """;
        System.out.println("-------2------");
        System.out.println(textBlocks2);

        String textBlocks3 = """
                line1
                                        """;
        System.out.println("-------3------");
        System.out.println(textBlocks3);

        String textBlocks4 = """
                                    line1
                """;
        System.out.println("-------4------");
        System.out.println(textBlocks4);

        String textBlocks5 = """
                    line1
             line2
                """;
        System.out.println("-------5------");
        System.out.println(textBlocks5);

        String textBlocks6 = """
                        line1
                    line2
                """;
        System.out.println("-------6------");
        System.out.println(textBlocks6);

        String textBlocks7 = """
                    line1
                line2
                   line3
                                line4      """;
        System.out.println("-------7------");
        System.out.println(textBlocks7);

        String textBlocks8 = """
                    "line1"
                  "line2"
                        "line3"
                            "line4"
                """;
        System.out.println("-------8------");
        System.out.println(textBlocks8);
    }
}
