import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0]=new Circle(1);
        circles[1]=new Circle(2);
        circles[2]=new Circle(3);

        System.out.println("Before sorting...");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        List<Circle> circleList = Arrays.asList(circles);

        CircleComparator comparator = new CircleComparator();
        circleList.sort(comparator);

        System.out.println("After sorting...");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}