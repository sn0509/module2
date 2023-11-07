import  org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void typeOfTriangleTest() {
        int FirstEdge = 1;
        int SecondEdge = 1;
        int ThirdEdge = 1;
        String expected = "Equilateral Triangle";
        String result = Triangle.typeOfTriangle(FirstEdge, SecondEdge, ThirdEdge);
        assertEquals(expected, result);
    }

    @Test
    void typeOfTriangleTest1() {
        int FirstEdge = 2;
        int SecondEdge = 2;
        int ThirdEdge = 3;
        String expected = "Isosceles Triangle";
        String result = Triangle.typeOfTriangle(FirstEdge, SecondEdge, ThirdEdge);
        assertEquals(expected, result);
    }
    @Test
    void typeOfTriangleTest2() {
        int FirstEdge = 2;
        int SecondEdge = 4;
        int ThirdEdge = 3;
        String expected = "Regular triangle";
        String result = Triangle.typeOfTriangle(FirstEdge, SecondEdge, ThirdEdge);
        assertEquals(expected, result);
    }
    @Test
    void typeOfTriangleTest3() {
        int FirstEdge = 0;
        int SecondEdge = 2;
        int ThirdEdge = 3;
        String expected = "It's not a triangle";
        String result = Triangle.typeOfTriangle(FirstEdge, SecondEdge, ThirdEdge);
        assertEquals(expected, result);
    }
}