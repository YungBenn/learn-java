package yungbenn.learn.java.application;

abstract class AnimalAbstraction {
  public abstract void animalSound();

  public void sleep() {
    System.out.println("Zzzz..");
  }
}

class Sheep extends AnimalAbstraction {
  @Override
  public void animalSound() {
    System.out.println("Mbeekk");
  }
}

class Main {
  public static void main(String[] args) {
    Sheep sheep = new Sheep();
    sheep.animalSound();
    sheep.sleep();
  }
}
