package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("darkness my old friend");

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

    Homework h = new Homework();
    System.out.println(h.xyu());

  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

}