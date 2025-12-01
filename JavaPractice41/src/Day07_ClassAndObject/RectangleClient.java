package Day07_ClassAndObject;

public class RectangleClient {
    public static void main(String[] args) {
        RectangleTask rectangleTask = new RectangleTask();

        rectangleTask.width= 22.00;
        rectangleTask.length=20.00;
        System.out.println(rectangleTask);

        System.out.println("rectangleTask area = " + rectangleTask.calculateArea());
        System.out.println("rectangleTask perimeter = " + rectangleTask.calculatePerimeter() );

        System.out.println(" ============================================= ");
        RectangleTask rectangleTask2 = new RectangleTask();

        rectangleTask2.width=3.5;
        rectangleTask2.length=5.6;
        System.out.println(rectangleTask2);

        System.out.println("rectangleTask area = " + rectangleTask2.calculateArea());
        System.out.println("rectangleTask perimeter = " + rectangleTask2.calculatePerimeter() );

        System.out.println(" ============================================= ");
        RectangleTask rectangleTask3 = new RectangleTask();

        rectangleTask3.width=15;
        rectangleTask3.length=25.2;
        System.out.println(rectangleTask3);

        System.out.println("rectangleTask area = " + rectangleTask3.calculateArea());
        System.out.println("rectangleTask perimeter = " + rectangleTask3.calculatePerimeter() );

    }
}
