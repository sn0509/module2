package com.codegym.access_modifier.static_method;

import com.codegym.access_modifier.static_method.Student;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Student.change();

        Student s1= new Student(111,"Hoang");
        Student s2= new Student(222, "Khanh");
        Student s3= new Student(333, "Nam");

        s1.display();
        s2.display();
        s3.display();

    }
}