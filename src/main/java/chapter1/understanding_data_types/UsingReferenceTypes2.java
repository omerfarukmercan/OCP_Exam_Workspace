package chapter1.understanding_data_types;

public class UsingReferenceTypes2 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("omer", "faruk", 28);
        Employee employee2 = new Employee("nazan", "mercan", 28);
        System.out.println(employee2);
        System.out.println(employee1);
    }
}
