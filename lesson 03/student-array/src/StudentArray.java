import java.util.Scanner;
public class StudentArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a student's name: ");
        String input=scanner.nextLine();
        boolean isExist =false;
        int i=0;
        while (i<students.length) {
            if(students[i].equals(input)){
                System.out.println("Position of the students in the list " + input + " is: " + i);
                isExist=true;
                break;
            }
            i++;
        }
        if(!isExist){
            System.out.println(input+" is not found!");
        }

    }
}
