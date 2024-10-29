package olderWork.chptr13_14.comparable;

import java.util.ArrayList;
import java.util.List;

public class Product implements Comparable<Product>{
    private int id;
    private String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int hasCode(){
        return id;
    }

    public boolean equals(Object obj){
        if(!(obj instanceof Product other))
            return false;
        return this.id == other.id;
    }

    public int compareTo(Product obj){
        int i = this.name.compareTo(obj.name);
        System.out.println(i);
        return i;
    }

    public static void main(String[] args) {
        var p1 = new Product(1,"Here");
        var p2 = new Product(1,"Logic");
        var p3 = new Product(2,"Logic");
        var p4 = new Product(3,"Here");
        /*List<Product> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.forEach(System.out::println);
        list.sort(Product::compareTo);
        list.forEach(System.out::println);*/
        List<Product> list2 = new ArrayList<>();
        list2.add(p1);
        list2.add(p1);
        System.out.println(p1.compareTo(p1));
        list2.forEach(System.out::println);
        list2.sort(Product::compareTo);
        list2.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
