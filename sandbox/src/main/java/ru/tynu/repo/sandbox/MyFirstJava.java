package ru.tynu.repo.sandbox;

public class MyFirstJava {
  public static void main(String[] args) {
    hello("user");

    Square s = new Square(5);

    Rectangle r =  new Rectangle(4,6);

    System.out.println("Площадь квадрата со стороной " + s.l + " =  " + s.area());
    System.out.println("Прощадь прямоугольника со стороной " + r.a + " и " + r.b + " = " + r.area());
  }

  public static void hello(String somebody) {
      System.out.println("Hello, " + somebody + "!");
  }
}

