package com.driver;

public class Main {
  public static void main(String[]args){
      RWOnly obj = new RWOnly();

      /*
.\Main.java:5: error: cannot find symbol
        RWOnly obj=new RWOnly();
                       ^
  symbol:   class RWOnly
  location: class Main
 */

      obj.setName("Tarun");
      System.out.println(obj.getName());
  }
}