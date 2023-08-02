package yungbenn.learn.java.application;

import yungbenn.learn.java.data.ITransportation;
import yungbenn.learn.java.data.Transportation;

public class TransportationApp {
  public static void main(String[] args) {
    ITransportation.getMachine("V8");

    Transportation bajaj = new Transportation();
    System.out.printf("Bajaj has %s wheel\n", bajaj.getWheel(3));
    System.out.printf("This bajaj's color is %s", bajaj.getColor("Red"));
  }
}
