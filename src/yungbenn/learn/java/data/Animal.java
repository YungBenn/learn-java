package yungbenn.learn.java.data;

public class Animal implements IAnimal {

  public String animalSound(String sound) {
    return sound;
  }

  public int animalLegs(int legs) {
    return legs;
  }

  public void GetColor(String animal, String color) {
    System.out.printf("The %s color is %s\n", animal, color);
  }

}
