package Simform.Inheritance;

import Simform.Inheritance.car.Mercedes;

public class Main {
  public static void main(String[] args) {
    //child class object
    Mercedes mercedes = new Mercedes();

    //using child class object call parent class method
    mercedes.Accelerate();
    mercedes.Brake();

    //child class method
    mercedes.tyres();


  }
}
