package yungbenn.learn.java.data;

public interface ITransportation extends ITransportationColor {
  static void getMachine(String machine) {
    System.out.printf("This transportation's machine is %s\n", machine);
  }

  int getWheel(int wheel);
}
