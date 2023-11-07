package com.codegym.declaration.declaration;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class PhoneManagement {
    public static void main(String[] args) {

        Iphone iphone=new Iphone("Black", "iphone",1L,6.8,2100,15);

        Samsung samsung=new Samsung ("blue", "samsung",2L,6.8,1000,16);

        System.out.println(iphone.getId());
        System.out.println(iphone.isVirtualHomeBtn());
    }
}