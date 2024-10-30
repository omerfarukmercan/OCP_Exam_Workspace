package chapter1.understanding_data_types;

public class DefiningTextBlocks {
    public static void main(String[] args) {

        String block = """
                  "doe""\"
                  "deer""\"
                """;
        System.out.println(block);
        System.out.println("-----------");

        String block2 = """
                a""";
        System.out.println(block2.length());
        System.out.println(block2.toCharArray());
        System.out.println("-----------");

        String block3 = """
                a
                """;
        System.out.println(block3.length());
        System.out.println(block3.toCharArray());
        System.out.println("-----------");

        String block4 = """
                a\n
                """;
        System.out.println(block4.length());
        System.out.println(block4.toCharArray());
        System.out.println("-----------");

    }
}
