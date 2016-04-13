package ru.qa.sandbox;

public class FirstStep {

	public static void main(String[] args) {
	  hello("user");

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4,6);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

        Point p1 = new Point(10,15);
        Point p2 = new Point(20,23);

        //using function
        System.out.println("Расстояние между двумя точками с координатами (" + p1.x + "," + p1.y + ")" + " и (" + p2.x + "," + p2.y + ")" + " = " + distance(p1, p2));

        //using method
        System.out.println("Расстояние между двумя точками с координатами (" + p1.x + "," + p1.y + ")" + " и (" + p2.x + "," + p2.y + ")" + " = " + p1.distance(p2));


    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

    public static double distance(Point p1, Point p2){
        double d;
        return d = Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));

    }


}