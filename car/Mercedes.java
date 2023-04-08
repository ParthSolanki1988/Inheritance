package Simform.Inheritance.car;

public class Mercedes extends Car{
  @Override
  public void Accelerate() {
//    super.Accelerate();
    System.out.println("The Mercedes Benz S-class accelerates like this!");
  }

  @Override
  public void Brake() {
//    super.Brake();
    System.out.println("The Mercedes Benz S-class brakes like this!");
  }
}
