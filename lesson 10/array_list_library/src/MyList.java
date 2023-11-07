import java.util.ArrayList;
public class MyList<E> {
    private final int size =0;
    private static final int DEFAULT_CAPACITY = 10;
    private ArrayList<E> list = new ArrayList<E>();
    private E element;

    private Object elements[];

    public MyList(){
    }
    public MyList(E element){
        this.element = element;
    }


    public MyList(int capacity) {
        list = new ArrayList<>(capacity);
    }

    public void add(int index, E element) {
        list.add(index, element);
    }
    public E remove(int index, E element) {
        return list.remove(index);
    }
    public int size() {
        return list.size();
    }
    public boolean contains(E element) {
        return list.contains(element);
    }
    public int indexOf(E element) {
        return list.indexOf(element);
    }
//    public boolean add(int index, E element){
//        return true;
//    }
    public void ensureCapacity(int minCapacity){
        list.ensureCapacity(minCapacity);
    }
    public E get(int index){
        return list.get(index);
    }
    public void clear(){
        list.clear();
    }

    @Override
    public String toString() {
        return "MyList{" +
                "list=" + list.toString() +
                '}';
    }
}
