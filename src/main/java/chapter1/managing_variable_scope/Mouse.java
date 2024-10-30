package chapter1.managing_variable_scope;

public class Mouse {

    final static int MAX_LENGHT = 5;//static variable: program sonlanana kadar yasar
    int length;//instance variable: obje sonlanana kadar yasar

    public void grow(int inches){
        if(length < MAX_LENGHT){
            int newSize = length + inches;
            length = newSize;
        }
    }

}
