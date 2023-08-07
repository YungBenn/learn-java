package yungbenn.learn.java.application;

public class ClassesObj {
  int x = 5;

  enum steak {
    Rare,
    Medium_Rare,
    Medium,
    Medium_Well,
    Well_Done,
  }

  public static void main(String[] args) {
    ClassesObj myObj = new ClassesObj();
    System.out.println(myObj.x);
    System.out.println(steak.Medium_Rare);
  }
}
