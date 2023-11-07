public class Triangle {

    private static int FirstEdge;
    private static int SecondEdge;
    private static int ThirdEdge;
    public  Triangle() {

    }

    public static String typeOfTriangle(int FirstEdge, int SecondEdge, int ThirdEdge){
        if (FirstEdge > 0 && SecondEdge > 0 && ThirdEdge > 0 && FirstEdge + ThirdEdge > SecondEdge
        && FirstEdge +SecondEdge> ThirdEdge && SecondEdge + ThirdEdge > FirstEdge){
            if (FirstEdge == SecondEdge && SecondEdge == ThirdEdge) {
                return "Equilateral Triangle";
            } else if (FirstEdge == SecondEdge && ThirdEdge > SecondEdge) {
                return "Isosceles Triangle";
            } else if (FirstEdge != SecondEdge && SecondEdge != ThirdEdge) {
                return "Regular triangle";
            }
        } return "It's not a triangle";

    }
    public static void getTriangle(int firstEdge, int secondEdge, int thirdEdge){
//
        System.out.println(typeOfTriangle(firstEdge, secondEdge, thirdEdge));
    }


}
