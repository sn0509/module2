import com.sun.security.jgss.GSSUtil;

import java.util.List;

public class QuickSort implements SortStrategy{
    @Override
    public <T> void sort(List<T> item) {
        System.out.println("Quick sort");
    }
}
