package Simform.Inheritance;

import Simform.Inheritance.car.Car;
import Simform.Inheritance.car.Mercedes;

public class Main {
  public static void main(String[] args) {
    //refernce --> attribute
    //object --> method
    Car car = new Mercedes();
    car.Accelerate();
    car.Brake();

  }
}
