package yungbenn.learn.java.application;

import yungbenn.learn.java.data.Animal;

public class AnimalApp {
  public static void main(String[] args) {
    Animal cat = new Animal();
    System.out.printf("The cat says: %s\n", cat.animalSound("meow"));
    System.out.printf("The cat has %s\n", cat.animalLegs(4));
    cat.GetColor("cat", "orange");
    Animal dog = new Animal();
    System.out.printf("The dog says: %s\n", dog.animalSound("woof"));
    System.out.printf("The dog has %s\n", dog.animalLegs(4));
    dog.GetColor("dog", "white");
  }
}
