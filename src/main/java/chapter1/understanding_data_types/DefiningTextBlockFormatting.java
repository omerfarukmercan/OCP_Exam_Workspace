package chapter1.understanding_data_types;

public class DefiningTextBlockFormatting {
    public static void main(String[] args) {

        String textBlock1 = """
                    \"sample"
                """;
        System.out.println(textBlock1);// text block icerisinde \" = " oluyor
        String textBlock2 = """
                    \\\\\\line1"
                """;
        System.out.println(textBlock2);
        String textBlock3 = """
                    \s\s\sline1
                """;
        System.out.println(textBlock3);
        String textBlock4 = """
                    line1 \
                    line1-part2  \
                    line1-part3
                """;
        System.out.println(textBlock4);
        /*
        * \""" = """
        * \"\"\" = """
        * space = ignored
        * \s = two spaces
        * \(at end of line) = omits new line on that line
        *
        * */

    }
}
