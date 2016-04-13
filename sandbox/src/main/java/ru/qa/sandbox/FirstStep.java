package ru.qa.sandbox;

public class FirstStep {

	public static void main(String[] args) {
	  hello("user");

        double len = 5;
        System.out.println("Площадь квадрата со стороной " + len + " = " + area(len));

        double a = 4;
        double b = 6;
        System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a,b));
    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

    public static double area(double s) {
        return s*s;
    }

    public static double area(double a, double b) {
        return a*b;
    }

}