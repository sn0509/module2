import java.util.Arrays;

public class MyList<E>  {
    private int size =0;
    private static final int   DEFAULT_CAPACITY=10;

    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCappa(){
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements,newSize);
    }

    public void add(E e){
        if (size == elements.length){
            ensureCappa();
        }
        elements[size++] = e;
    }
    public E get(int index){
        if (index >= size || index < 0){
            throw new IndexOutOfBoundsException("Index: " + index +", Size " + index);
        }
        return (E) elements[index];
    }

}
