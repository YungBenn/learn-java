package yungbenn.learn.java.application;

class AnimalInheritance {
  protected String hisAnimal = "Cat";
  private int legs = 5;

  public void animalLegs() {
    System.out.println("has " + legs + " legs");
  }

  public void sound() {
    System.out.println("Woof woof");
  }
}

class PrintAnimal {
  public static void main(String[] args) {
    AnimalInheritance animali = new AnimalInheritance();
    System.out.println(animali.hisAnimal);
    animali.sound();
    animali.animalLegs();
  }
}

// class Animal extends AnimalInheritance {
// private String animalName = "Dog";

// public static void main(String[] args) {
// Animal myAnimal = new Animal();
// myAnimal.sound();
// System.out.println(myAnimal.hisAnimal);
// System.out.println(myAnimal.animalName);
// }
// }
