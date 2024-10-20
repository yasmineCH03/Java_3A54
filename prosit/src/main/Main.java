package main;
import java.util.Scanner;

import entities.Animal;
import entities.Zoo;
import entities.Animals.aquatic;
import entities.Animals.terrestrial;
import entities.Animals.penguin;
import entities.Animals.dolphin;
public class Main {
    public static void main(String[] args) {
        Zoo myZoo=new Zoo("Central Park","Madagascar");
        Zoo zoo2=new Zoo("ariena","tunis");
        Animal lion=new Animal("Félins","Simba",5,true);

        Animal giraffe=new Animal("Giraffe","Sam",5,true);
        Animal chat=new Animal("Chat","miel",5,true);
        myZoo.addAnimal(lion);
        myZoo.addAnimal(giraffe);
        myZoo.addAnimal(chat);
        myZoo.displayAnimals();
        //System.out.println(myZoo.searchAnimal(chat));
        if(myZoo.searchAnimal(chat)!=-1)
        {
            System.out.println("animal found");
        }else
        {
            System.out.println("animal not found");
        }
        myZoo.comparerZoo(myZoo,zoo2);
        if (myZoo.isZooFull())
            System.out.println("zoo is full")    ;
        else
            System.out.println("zoo is not full");
        }

        dolphin d=new dolphin();
        penguin p=new penguin();
        terrestrial t=new terrestrial();
        aquatic a=new aquatic("aa","aaaa",22,true,"laplaya");




}