package com.codegym.interface_abstract_class.animal_interfac.fruit;

import com.codegym.interface_abstract_class.animal_interfac.animal.Chicken;
import com.codegym.interface_abstract_class.animal_interfac.fruit.Orange;
import com.codegym.interface_abstract_class.animal_interfac.animal.Animal;
import com.codegym.interface_abstract_class.animal_interfac.animal.Tiger;
import com.codegym.interface_abstract_class.animal_interfac.fruit.Apple;
import com.codegym.interface_abstract_class.animal_interfac.fruit.Fruit;

public class Main {
    public static void main(String[] args) {
        Animal[] animals =new Animal[2];
        animals[0]= new Tiger();
        animals[1]= new Chicken();
        for(Animal animal : animals){
            System.out.println(animal.makeSound());

            if(animal instanceof Chicken edibler){
                System.out.println(edibler.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0]= new Apple();
        fruits[1]= new Orange();
        for(Fruit fruit : fruits){
            System.out.println(fruit.howToEat());
        }
    }
}
