package ru.tynu.repo.sandbox;

public class MyFirstJava {
  public static void main(String[] args) {
    hello("user");
    double len = 5.0;
    System.out.println("Площадь квадрата со стороной " + len + " =  " + area(len));
    double a = 4;
    double b = 6;
    System.out.println("Прощадь прямоугольника со стороной " + a + " и " + b + " = " + area(a,b));
  }

  public static void hello(String somebody) {
      System.out.println("Hello, " + somebody + "!");
  }

  public static double area(double l){
    return l * l;
  }

  public static double area(double a, double b){
    return a * b;
  }
}

