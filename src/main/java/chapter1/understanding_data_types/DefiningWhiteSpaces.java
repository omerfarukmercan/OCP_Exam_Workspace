package chapter1.understanding_data_types;

public class DefiningWhiteSpaces {
    public static void main(String[] args) {

        String eyeTest = "\"Java Study Guide\"\n   by Scott & Jeanne";
        System.out.println(eyeTest);

        String textBlock = """
                "Java Study Guide"
                    by Scott & Jeanne
                """;
        System.out.println(textBlock);
        //leftmost karakter onemli. ondan sonra gelen tüm satirlarda bosluk ekler

        String pyramid = """
                    *
                  *   *
                *   *   *
        """;
        System.out.println(pyramid);


    }
}
